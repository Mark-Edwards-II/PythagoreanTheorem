import java.lang.Math;
public class Pythagorean {
    public double caculateHypotenuse(int legA, int legB) {
        int i = 2;
        double squareA = Math.pow(legA, i);
        System.out.println(squareA);
        double squareB = Math.pow(legB, i);
        System.out.println(squareB);
        double c = Math.sqrt(squareA + squareB);
        return c;
    }
}