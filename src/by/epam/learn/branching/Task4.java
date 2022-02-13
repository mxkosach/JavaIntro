package by.epam.learn.branching;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие
public class Task4 {
    public static void main(String[] args) {
        int a = 70, b = 120, x = 250, y = 120, z = 65;
        if (x <= a && y <= b || x <= a && z <= b
                || x <= b && y <= a || x <= b && z <= a
                || y <= a && z <= b || y <= b && z <= a)
            System.out.println("The brick will fit through the hole");
        else
            System.out.println("The brick will not fit through the hole");
    }
}
