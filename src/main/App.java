package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {

    public static void main(String[] args) throws Exception {

        ArrayList<Customer> customerList = new ArrayList();
        JSONParser parser = new JSONParser();

        try {
            FileReader fr = new FileReader("D:\\1File_Fathur\\java\\java-101\\hello-world\\src\\customer.json");
            Object obj = parser.parse(fr);

            JSONArray jsonArray = (JSONArray) obj;

            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject objItem = (JSONObject) jsonArray.get(i);

                String id = objItem.get("_id").toString();
                int index = Integer.parseInt(objItem.get("index").toString());
                boolean isActive = (Boolean) objItem.get("isActive");
                String balance = objItem.get("balance").toString();
                String picture = objItem.get("picture").toString();
                int age = Integer.parseInt(objItem.get("age").toString());
                String eyeColor = objItem.get("eyeColor").toString();
                String name = objItem.get("name").toString();
                String gender = objItem.get("gender").toString();
                String company = objItem.get("company").toString();
                String email = objItem.get("email").toString();
                String phone = objItem.get("phone").toString();
                String registered = objItem.get("registered").toString();
                String favoriteFruit = objItem.get("favoriteFruit").toString();

                JSONObject objItemAddress = (JSONObject) objItem.get("address");

                String street = objItemAddress.get("street").toString();
                String city = objItemAddress.get("city").toString();
                String state = objItemAddress.get("state").toString();
                int postCode = Integer.parseInt(objItemAddress.get("postcode").toString());
                double latitude = Double.parseDouble(objItemAddress.get("latitude").toString());
                double longitude = Double.parseDouble(objItemAddress.get("longitude").toString());

                Customer customer = new Customer(
                        id,
                        index,
                        isActive,
                        balance,
                        picture,
                        age,
                        eyeColor,
                        name,
                        gender,
                        company,
                        email,
                        phone,
                        registered,
                        favoriteFruit,
                        street,
                        city,
                        state,
                        postCode,
                        latitude,
                        longitude);
                
                customerList.add(customer);
            }

            for (Customer customer : customerList) {
                customer.getInfo();
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
