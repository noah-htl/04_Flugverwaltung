package at.htlsaalfelden;

public abstract class Flug {
    private final int flugnummer;
    private final String reiseziel;
    private int sitzplatzanzahl;
    private int anzahlReservierungen;

    private static int gesamtanzahl = 0;

    public Flug(int flugnummer, String reiseziel) {
        this.flugnummer = flugnummer;
        this.reiseziel = reiseziel;
    }

    public int getFlugnummer() {
        return flugnummer;
    }

    public static int getGesamtanzahl() {
        return gesamtanzahl;
    }

    public void setSitzplatzanzahl(int sitzplatzanzahl) {
        this.sitzplatzanzahl = sitzplatzanzahl;
    }

    public boolean reservieren(int anzahl) {
        if(anzahl+anzahlReservierungen >= sitzplatzanzahl) {
            return false;
        } else {
            anzahlReservierungen += anzahl;
            return true;
        }
    }
}
