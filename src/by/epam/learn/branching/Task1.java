package by.epam.learn.branching;

//Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
public class Task1 {
    public static void main(String[] args) {
        int alpha = 200, beta = 10;
        int gamma = 180 - alpha - beta;
        System.out.println("Degree measures: " + alpha + ", " + beta + ", " + gamma);
        if (gamma > 0 && beta > 0 && alpha > 0) {
            System.out.println("Triangle exist.");
            if (gamma == 90 || alpha == 90 || beta == 90) {
                System.out.println("It\'s rectangle.");
            }
        } else
            System.out.println("Triangle don\'t exist.");

    }
}