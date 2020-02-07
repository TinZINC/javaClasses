public class Car {

    private int year;
    private String make;
    private int miles;
    private String model;

    public Car(int year, String make, String model) {

        this.year = year;
        this.make = make;
        this.miles = 0;
        this.model = model;

    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive(int miles) {
        this.miles += miles;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMiles() {
        return miles;
    }


    public String toString() {
        return
                "This car is a " +
                        this.getYear()+ " " +
                        this.getMake() + " " +
                        this.getModel() + " with " +
                        this.getMiles() + " miles.";
    }

}
