package by.epam.learn.branching;
// Найти max{min(a, b), min(c, d)}
public class Task2 {
    public static void main(String[] args) {
        int a=10, b=13, c=27, d=-58;
        System.out.printf("max{min(%d, %d), min(%d, %d) = ", new Object[]{a, b, c, d});
        System.out.println(+Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
