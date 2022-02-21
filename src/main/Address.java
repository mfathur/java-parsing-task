package main;

public class Address {

    private String street;
    private String city;
    private String state;

    private int postCode;
    private double latitude;
    private double longitude;

    public Address(
            String street,
            String city,
            String state,
            int postCode,
            double latitude,
            double longitude
    ) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postCode = postCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public int getPostCode(){
        return postCode;
    }
}
