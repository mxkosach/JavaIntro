package by.epam.learn.linear;

//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static void main(String[] args) {
        double r = 123.586;
        int intPart = (int) r;
        int fracPart = (int) ((r - intPart) * 1000);
        System.out.println("Исходное число: " + r);
        System.out.println("intPart = " + intPart);
        System.out.println("fracPart = " + fracPart);
        double rNew = fracPart + (intPart / 1000.0);
        System.out.println("Итоговое число: " + rNew);
    }
}
