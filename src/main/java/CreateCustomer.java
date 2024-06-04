import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateCustomer {
    static Customer createNewCustomer(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter full name");
        String name="";
        while (true){
             name = scn.nextLine();
            Pattern pattern = Pattern.compile("\\b([a-zA-ZÀ-ÿ][-,a-z. ']+ *)+");
            Matcher matcher = pattern.matcher(name);
            boolean matchFound = matcher.find();
            if(matchFound) {
                break;
            } else {
                System.out.println("Please enter a valid Name");
            }
        }

        System.out.println("Please enter Aadhar no.");
        String aadharInString;
        while (true){
            aadharInString = scn.nextLine();
            Pattern pattern = Pattern.compile("^[2-9][0-9]{3}[0-9]{4}[0-9]{4}$");
            Matcher matcher = pattern.matcher(aadharInString);
            boolean matchFound = matcher.find();
            if(matchFound) {
                break;
            } else {
                System.out.println("Please enter a valid aadhar");
            }
        }
        BigInteger aadhar = new BigInteger(aadharInString);
        System.out.println("Please enter phone number with country code like (+91**********)");
        String phoneNoInString;
        while (true){
            phoneNoInString = scn.next();
            Pattern pattern = Pattern.compile("^[+]{1}(?:[0-9\\-\\(\\)\\/\\.]\\s?){6,15}[0-9]{1}$");
            Matcher matcher = pattern.matcher(phoneNoInString);
            boolean matchFound = matcher.find();
            if(matchFound) {
                break;
            } else {
                System.out.println("Please enter a valid phone number without spaces");
            }
        }
        BigInteger phoneNo =new BigInteger(phoneNoInString);
        ArrayList<Room> rooms= new ArrayList<Room>();
        while(true){
            Room room = CreateRoom.createRoom();
            rooms.add(room);
            System.out.println("Want to book another Room enter 1 for yes and 0 for no");
            int temp = scn.nextInt();
            if(temp == 0){
                break;
            }
        }

        return new Customer(name,aadhar,phoneNo,rooms);
    }
}
