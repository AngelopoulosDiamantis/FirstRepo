package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public String convertToString() {
        return "(" + x + ")";
    }
    //API
    public void movePlus10() {
        x += 10;
    }
    public void movePlus1() {
        x++;
    }
    protected void reset() {
        x = 0;
    }
}
