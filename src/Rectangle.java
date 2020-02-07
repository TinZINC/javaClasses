public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = this.length * this.width;
        return area;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt(( (this.length * this.length) + (this.width * this.width)) );
        return diagonal;

    }

    public String isSquare() {
        if (this.length == this.width) {
            return "this is a square";
        }
        return "this is not a square";

    }

    public String printRectangleInformation() {
        return
                "This rectangle has " +
                        this.getLength()+ " for its length, " +
                        this.getWidth() + " for its width, " +
                        this.getArea() + " for its area, " +
                        this.getDiagonal() + " for its diagonal, and " +
                        this.isSquare();
    }
}
