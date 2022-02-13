package by.epam.learn.branching;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task3 {
    public static void main(String[] args) {
        int x1 = 5, y1 = 5, x2 = 8, y2 = 8, x3 = 37, y3 = 37;
        if ((x3 - x1) / (x2 - x1) == (y3-y1)/(y2-y1))
            System.out.printf("Points (%d, %d), (%d, %d), (%d, %d) lie on the one line", new Object[]{x1,y1,x2,y2,x3,y3}) ;
        else
            System.out.printf("Points (%d, %d), (%d, %d), (%d, %d) don\'t lie on the one line", new Object[]{x1,y1,x2,y2,x3,y3}) ;
    }
}