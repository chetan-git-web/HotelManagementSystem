import java.math.BigInteger;
import java.util.ArrayList;

public class Customer {
    public String name="";
    public BigInteger aadharCard;
    public BigInteger phoneNo ;
    public ArrayList<Room> rooms= new ArrayList<Room>();

    Customer(String name,BigInteger aadharCard,BigInteger phoneNo,ArrayList<Room> rooms){
        this.name = name;
        this.aadharCard = aadharCard;
        this.phoneNo = phoneNo;
        this.rooms = rooms;
    }
}
