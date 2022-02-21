package main;

public class Customer {
    private final int index;
    private final int age;
     
    private final boolean isActive;

    private final String id;
    private final String eyeColor;
    private final String gender;
    private final String picture;
    private final String balance;
    private final String name;
    private final String company;
    private final String email;
    private final String phone;
    private final String registered;
    private final String favoriteFruit;

    private Address address;
    
    public Customer(
        String id,
        int index,
        boolean isActive,
        String balance,
        String picture,
        int age,
        String eyeColor,
        String name,
        String gender,
        String company,
        String email,
        String phone,
        String registered,
        String favoriteFruit,
        String street,
        String city,
        String state,
        int postCode,
        double latitude,
        double longitude
    ){
        this.id = id;
        this.index = index;
        this.isActive = isActive;
        this.balance = balance;
        this.picture = picture;
        this.age = age;
        this.eyeColor = eyeColor;
        this.name = name;
        this.gender = gender;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.registered = registered;
        this.favoriteFruit = favoriteFruit;
        this.address = new Address(
            street,
            city,
            state,
            postCode,
            latitude,
            longitude
        );
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Registered: " + registered);

        StringBuilder addressStr = new StringBuilder();
        addressStr.append(address.getStreet()).append(", ");
        addressStr.append(address.getCity()).append(", ");
        addressStr.append(address.getState()).append(", ");
        addressStr.append(address.getPostCode());

        System.out.println("Address: " + addressStr.toString());
        System.out.println();
    }

}