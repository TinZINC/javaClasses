public class Runner {
    public static void main(String[]args) {
        Car myCar = new Car (2018, "Toyota",  "Formula1");
        System.out.println(myCar.toString());
        myCar.drive(50);
        System.out.println(myCar.toString());

        Rectangle myRectangle = new Rectangle(10, 12);
        System.out.println(myRectangle.printRectangleInformation());
        Rectangle mySquare = new Rectangle(10, 10);
        System.out.println(mySquare.printRectangleInformation());
    }
}
