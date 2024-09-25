package at.htlsaalfelden;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Flug personenFlug = new Personenflug(123, "Wien");
        Flug katzenTransportFlug = new Transportflug(123, "Buxtehude", 1000);

        personenFlug.setSitzplatzanzahl(100);
        System.out.println(personenFlug.reservieren(10));
        System.out.println(personenFlug.reservieren(100));

        System.out.println(katzenTransportFlug.reservieren(10));
    }
}