package by.epam.learn.branching;

public class Task5 {
    public static void main(String[] args) {
        int x = 2;
        double res;
        if (x <= 3)
            res = Math.pow(x, 2) - 3 * x + 9;
        else
            res = 1 / (Math.pow(x, 3) + 6);
        System.out.println("F(x) = " + res);
    }
}
