import java.util.ArrayList;
import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();

        while(true){
            System.out.println("Welcome to Hotel Skylark Rooms Services");
            System.out.println("Press 1  Want to create customer");
            System.out.println("Press 2  Want to get customer details");
            System.out.println("Press 3  Want to modify customer");
            int selectOption;
            do {
                selectOption = scn.nextInt();
                if (selectOption < 1 || selectOption > 3) {
                    System.out.println("Please select in range from 1 to 3");
                }
            } while (selectOption < 1 || selectOption > 3);

            if(selectOption == 1){
                Customer cust = CreateCustomer.createNewCustomer();
                customers.add(cust);
            }
            else if (selectOption == 2){

            }

        }


    }
}
