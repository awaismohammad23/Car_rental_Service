public class Car_Catalog extends Car{

    private String make;
    private int model;
    private String colour;
    private String Description;
    private String Type;
    double Price;

    //default constructor
    Car_Catalog()
    {
        this.colour = null;
        this.Description = null;
        this.make = null;
        this.model = 0;
        this.Type = null;
        this.Price = 0;
    }

    //parameterized constructor.
    Car_Catalog(String make,String description,String colour,int model,String type,double price)
    {
        this.colour = colour;
        this.Description = description;
        this.make = make;
        this.model = model;
        this.Type = type;
        this.Price = price;
    }

    //details function to show the details of the car.
    public void showDetails()
    {
        System.out.println(".................CAR DETAILS.................");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Colour: " + this.colour);
        System.out.println("Type: " + this.Type);
        System.out.println("Description: " + this.Description);
        System.out.println("Price: " + this.Price);
    }



}
