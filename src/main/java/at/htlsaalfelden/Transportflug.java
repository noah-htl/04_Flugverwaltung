package at.htlsaalfelden;

public class Transportflug extends Flug {
    private int transportgewicht;
    private final int maxTransportgewicht;

    public Transportflug(int flugnummer, String reiseziel, int maxTransportgewicht) {
        super(flugnummer, reiseziel);
        this.maxTransportgewicht = maxTransportgewicht;
    }

    public boolean beladen(int gewicht) {
        if(gewicht + transportgewicht >= maxTransportgewicht) {
            return false;
        } else {
            transportgewicht += gewicht;
            return true;
        }
    }

    @Override
    public boolean reservieren(int anzahl) {
        throw new UnsupportedOperationException("Not supported.");
    }
}
