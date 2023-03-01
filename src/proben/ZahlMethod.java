package proben;

public class ZahlMethod {
    public static void main(String[] args) {
        double area = calculateArea(2.1, 3.5);
        double area1 = calculateArea(6.5, 5.8);
        if (area > area1) {
            System.out.println("area is the greatest");
        } else {
            System.out.println("area1 is the greatest");
        }

    }

    public static double calculateArea(double length, double breadth) {
        double area = length * breadth;
        return area;
    }
}
