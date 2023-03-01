package house;

public class Kitchen {
    public static void main(String[] args) {
        int squareMeterPrice = 15;
        double wallHeight = 2.8;
        double lange = 6;
        double breite = 2.5;
        String oven = "Herbert";
        float arbeitsplatz = 2.8f;

        System.out.println(" Boden grösse in der Küche: " + lange * breite + " square meter ");
        System.out.println(" neue Fliesen kostet: " + lange * breite * squareMeterPrice + " Euro ");
        System.out.println("Wir brauchen " + lange * breite * wallHeight + " liter Wandfarbe");
        System.out.println("this is the kitchen. the oven is called: " + oven);
    }
}
