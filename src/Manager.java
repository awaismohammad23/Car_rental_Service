public class Manager {

    //attributes of the Manager.
    private String Name;
    private String Address;
    private String PhoneNumber;
    private int Manager_ID;

    //default constructor.
    Manager()
    {
        this.Name = null;
        this.Address = null;
        this.PhoneNumber = null;
        this.Manager_ID = 0;
    }

    //parameterized constructor.
    Manager(String Name,String Address,String phoneNumber,int Manager_ID)
    {
        this.Name = Name;
        this.Address = Address;
        this.PhoneNumber = phoneNumber;
        this.Manager_ID = Manager_ID;
    }



}
