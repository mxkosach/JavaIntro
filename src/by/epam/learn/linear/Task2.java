package by.epam.learn.linear;
//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
public class Task2 {
    public static void main(String[] args) {
        double res;
        double a = 1;
        double b = 2;
        double c = 3;
        res = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(res);
    }
}
