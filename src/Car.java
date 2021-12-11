public class Car {

    private boolean bookingStatus;
    private String bookingDate;

    //default constructor.
    Car()
    {
        this.bookingStatus = true;
        this.bookingDate = "";
    }

    //parameterized constructor.
    Car(boolean status, String date)
    {
        this.bookingDate = date;
        this.bookingStatus = status;
    }

    //book car function to book a car.
    public boolean bookCar(Car car)
    {
        //booking the car and updating the database.
        return true;
    }

    //addCar function to add a car.
    public void addCar(Car car)
    {

    }

    //remove car function.
    public void removeCar(Car car)
    {

    }

}
