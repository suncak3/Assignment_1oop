import models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/User/IdeaProjects/Assignment_1/src/Assignment1_file");
        Scanner console = new Scanner(file);
        Shape shape = new Shape();
        while (console.hasNextLine()){
            double x = console.nextDouble();
            double y = console.nextDouble();
            shape.addPoint(new Point(x,y));
        }
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongest());
        System.out.println(shape.getAverage());
    }
}