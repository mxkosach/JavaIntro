package by.epam.learn.linear;
//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task3 {
    public static void main(String[] args) {

        double x = 5;
        double y = 25;
        double res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(res);
    }
}
