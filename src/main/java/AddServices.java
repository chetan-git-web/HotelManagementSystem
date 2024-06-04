import java.util.Scanner;

public class AddServices {
    static Services addService(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Services that are available are");
        System.out.println("Enter 1 for Laundry else 0");
        int laundry = scn.nextInt();
        System.out.println("Enter 1 for Spa else 0");
        int spa = scn.nextInt();
        System.out.println("Enter 1 for Breakfast else 0");
        int breakfast = scn.nextInt();
        System.out.println("Enter 1 for Lunch else 0");
        int lunch = scn.nextInt();
        System.out.println("Enter 1 for Dinner else 0");
        int dinner = scn.nextInt();

        Services serv = new Services(laundry==1?true:false,spa==1?true:false,breakfast==1?true:false,lunch==1?true:false,dinner==1?true:false);

        return serv;
    }
}
