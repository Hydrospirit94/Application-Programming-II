import java.util.Scanner;
public class TestEmployee {

    public static void main(String[] args){

        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Enter 1 for Hourly Employee");
        System.out.println("Enter 2 for Salaried Employee");
        System.out.println("Enter 3 for Consultant");

        int choice = keyboardinput.nextInt();

        if(choice == 1){
            HourlyEmployee choice1 = new HourlyEmployee(3, "Old Man Jenkins", "10/13/1969", 30);

            choice1.printLabel();
            choice1.calculateWages();

        }
        else if(choice == 2){
            SalariedEmployee choice2 = new SalariedEmployee(89, "Plankton", "9/1/1939", 120000, 7000);

            choice2.printLabel();
            choice2.calculatePension();
        }
        else if(choice == 3){
            Consultant choice3 = new Consultant(105, "Stan Smith", "4/13/1999", 231, 4000);

            choice3.printLabel();
            choice3.calculateFees();
        }

    }
}
