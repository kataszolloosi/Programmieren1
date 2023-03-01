package proben;

public class Logic {
    public static void main(String[] args) {

        //the sun is shining and it is raining
        boolean sunshine = false;
        boolean rain = true;

        System.out.println(!sunshine && !rain);

        //this exersice confuses me OR i know exactly what this is about
        boolean confusion = false;
        boolean knowledge = true;

        System.out.println(confusion || knowledge);

        //(1 > 3 and (not 3-1 < 5)) or 2 * 2 == 4
        boolean result = 1 > 3 && (!(3 - 1 < 5)) || 2 * 2 == 4;
        System.out.println(result);


        //(6 >= 2*3 || 2-3 < 0) && (1*1 == 1 && 1 != 1+1)
        boolean result2 = 6 >= 2 * 3 || 2 - 3 < 0 && (1 * 1 == 1 && 1 != 1 + 1);
        System.out.println(result2);

    }
}
