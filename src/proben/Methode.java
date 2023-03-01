package proben;

public class Methode {
    public static void main(String[] args) {
        //in a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book
        int nonFiction = 3;
        int fiction = 2;
        /* Discount(nonFiction, fiction);
        Discount(6, 5);
        Discount(1, 2);
        */
        checkDiscount(fiction, nonFiction);



    }
    public static void Discount (int nonFiction, int fiction){

        if (nonFiction > 2 && fiction > 0) {
            System.out.println("Discount!");
        } else {
            System.out.println("no discount!");
        }
    }

    public static String checkDiscount (int nonFiction, int fiction) {
        String discount = "Discount!";
        if(fiction > 0 && nonFiction >=3)
        {return discount; }
        else {
        return "no discount"; }
}
}
