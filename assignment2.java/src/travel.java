import java.util.Scanner;

public class travel {
    static double adultTicketPrice = 150.00;
    static double childTicketPrice = 85.00;
    static double type1RoomPrice = 100.00;
    static double type2RoomPrice = 80.00;
    static double salesTax = .05;

    public static void main(String[] args) {
        int choice = 0;
        int numAdult;
        int numChild;
        int numNights;
        int numtype1Room, numtype2Room;
        double subTotalTicketPrice = 0;
        double subTotalHotelPrice = 0;
        double totalPrice = 0;
        double totalFinalPrice = 0;

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please choose a selection(1-3)\n1.Ticket\n2.Hotel\n3.Quit");
        while(true) {
            choice = scnr.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Please enter a number between 1 and 3.");
            } else if (choice == 1) {
                System.out.print("Enter number of children under age 11: ");
                numChild = scnr.nextInt();
                System.out.print("Enter number of adults: ");
                numAdult = scnr.nextInt();
                subTotalTicketPrice += getTicketPrice(numAdult, numChild );
            } else if(choice == 2) {
                System.out.print("Enter number of nights: ");
                numNights = scnr.nextInt();
                System.out.print("Enter number of type 1 rooms: ");
                numtype1Room = scnr.nextInt();
                System.out.print("Enter number of type 2 rooms: ");
                numtype2Room = scnr.nextInt();
                subTotalHotelPrice += getHotelPrice(numNights,numtype1Room,numtype2Room);
            } else {
                break;
            }
        }

        System.out.println("Sub Total Ticket Price: " + subTotalTicketPrice);
        System.out.println("Sub Total Hotel Price: " + subTotalHotelPrice);
        totalPrice = subTotalTicketPrice + subTotalHotelPrice;
        totalFinalPrice = totalPrice + (totalPrice * salesTax);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Total Final Price: " + totalFinalPrice);
    }

    public static double getTicketPrice(int numAdults, int numChildren) {
        double totalAdultTicketPrice = numAdults * adultTicketPrice;
        double totalChildTicketPrice = numChildren * childTicketPrice;

        System.out.println("Number of adults: " + numAdults + ", Total Price: " + totalAdultTicketPrice);
        System.out.println("Number of children: " + numChildren + ", Total Price: " + totalChildTicketPrice);

        return totalAdultTicketPrice + totalChildTicketPrice;
    }

    public static double getHotelPrice(int numNights, int numType1Room, int numType2Room) {
        double totalType1HotelPrice = numType1Room * numNights * type1RoomPrice;
        double totalType2HotelPrice = numType2Room * numNights * type2RoomPrice;

        System.out.println("Number of Nights: " + numNights + ", Number of type 1 rooms: " + numType1Room + ", Total Price: " + totalType1HotelPrice);
        System.out.println("Number of Nights: " + numNights + ", Number of type 2 rooms: " + numType2Room + ", Total Price: " + totalType2HotelPrice);

        return totalType1HotelPrice + totalType2HotelPrice;
    }
}
