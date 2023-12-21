
import models.Point;


import java.util.ArrayList;

public class Shape {
    private ArrayList <Point> pointsArr = new ArrayList<>();
    private int length;
    public void addPoint(Point a){
        pointsArr.add(a);
        length++;
    }

    public double calculatePerimeter(){
        double perimeter = 0;
        perimeter += pointsArr.get(0).getDistance(pointsArr.get(length - 1));
        for (int i = 0; i < pointsArr.size() - 1; i++) {
            perimeter += pointsArr.get(i).getDistance(pointsArr.get(i + 1));
        }
        return perimeter;
    }

    public double getLongest(){
        double maxDistance = Double.MIN_VALUE;
        for (int i = 0; i < pointsArr.size() - 1; i++) {
            double currentDistance = pointsArr.get(i).getDistance(pointsArr.get(i+1));
            if(currentDistance > maxDistance){
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }
    public double getAverage(){
        //double average = calculatePerimeter();
        return calculatePerimeter()/length;
    }

}
