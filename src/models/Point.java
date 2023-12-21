package models;
public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getDistance(Point dist){
        double x1 = this.x;
        double y1 = this.y;

        double x2 = dist.getX();
        double y2 = dist.getY();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));

        return distance;
    }
    public String toString(){
        return "X value: " + this.x + '\n' + "Y value: " + this.y;
    }
}
