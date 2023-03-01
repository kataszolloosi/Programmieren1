package proben;

public class IfElse {
    public static void main(String[] args) {
        // on the bus receive a discount if you are a senior citizen, a dog or a student
        boolean isSenior = false;
        boolean isDog = false;
        boolean isStudent = false;

        checkIfDiscount(isSenior, isStudent, isDog);
        checkIfDiscount(true, true, true);
        checkIfDiscount(true, true, false);
        checkIfDiscount(true, false, false);
        checkIfDiscount(true, false, true);
        checkIfDiscount(false, true, false);
        checkIfDiscount(false, true, true);
        checkIfDiscount(false, false, true);
        checkIfDiscount(false, false, false);


    }

    public static void checkIfDiscount(boolean isSenior, boolean isDog, boolean isStudent) {
        if (isSenior) {
            System.out.println("Discount!");
        } else if (isDog) {
            System.out.println("Discount!");
        } else if (isStudent) {
            System.out.println("Discount!");
        } else {
            System.out.println("no discount!");
        }
    }
}
