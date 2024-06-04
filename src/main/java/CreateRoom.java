import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateRoom {
    static Room createRoom(){
        Scanner scn = new Scanner(System.in);
        System.out.println("There are three types of rooms available :-");
        System.out.println("Enter 1 for Gold");
        System.out.println("Enter 2 for Silver");
        System.out.println("Enter 3 for Bronze");
        int roomType;
        while(true){
            roomType = scn.nextInt();
            if(roomType<1 || roomType>3){
                System.out.println("Please enter number in range from 1 to 3");
            }
            else {
                break;
            }
        }
        System.out.println("Enter check in date in format yyyy-mm-dd");
        String temp;
        while (true){
            temp = scn.next();
            Pattern pattern = Pattern.compile("^(202[4-8])-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$");
            Matcher matcher = pattern.matcher(temp);
            boolean matchFound = matcher.find();
            if(matchFound) {
                break;
            } else {
                System.out.println("Please enter a valid date in format yyyy-mm-dd");
            }
        }
        LocalDateTime checkindate =LocalDateTime.parse(temp+"T12:00:00");
        System.out.println("Enter number of extra days you want to stay in range from 1 to 30");
        int days;
        while (true){
            days = scn.nextInt();
            if(days<1 || days>30){
                System.out.println("please enter days in range from 1 to 30");
            }
            else{
                break;
            }
        }
        LocalDateTime checkoutdate = checkindate.plusDays(days);
        System.out.println("Do you want to add any extra services enter 1 if yes else 0");
        int wantToAddServices;
        while (true){
            wantToAddServices = scn.nextInt();
            if(wantToAddServices<0 || wantToAddServices>1){
                System.out.println("please enter 1 for yes or 0 for no");
            }
            else{
                break;
            }
        }
        Services serv;
        if(wantToAddServices == 1){
            serv = AddServices.addService();
        }
        else {
            serv = new Services(false,false,false,false,false);
        }
        Room room = new Room(roomType,checkindate,checkoutdate,serv);
        return room;
    }
}
