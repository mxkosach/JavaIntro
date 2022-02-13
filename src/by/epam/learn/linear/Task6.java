package by.epam.learn.linear;

//6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае
public class Task6 {
    public static void main(String[] args) {
        int x = 2;
        int y = -1;
        boolean bool;
        bool = ((-2 <= x && x <= 2) && (y >= 0 && y <= 4)) || (x >= -4 && x <= 4 && y <= 0 && y >= -3 && y != -1);
        System.out.println("("+x+", "+y+") - "+ bool);
    }
}
