import java.util.Scanner;
public abstract class ServiceProvider {
    static Scanner input = new Scanner(System.in);

    int MobileNum;
    double amount;
    //getters and setters
    public int getMobileNum() {
        return MobileNum;
    }
    public void setMobileNum(int mobileNum) {
        MobileNum = mobileNum;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    ServiceProvider(){

    }
    public void form(){
        System.out.print("Enter your Mobile Number : ");
        MobileNum = input.nextInt();
        System.out.print("Enter amount : ");
        amount = input.nextInt();
    }

    public static void ServiceProvidersMenu() {
        System.out.println("____ Enter service provider ___ ");
        System.out.println("1- Vodafone");
        System.out.println("2- Etisalat");
        System.out.println("3- Orange");
        System.out.println("4- WE");
    }
}
    

    

