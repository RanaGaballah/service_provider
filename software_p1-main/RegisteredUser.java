import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class RegisteredUser extends User {

    Scanner input= new Scanner(System.in);
    String Name;
    String Password ;
    String eMail ;
    Accounts acc;


    // default constructor
    public RegisteredUser() {
        Name = "";
        Password = "";
        eMail = "";
    }
    // parameterized constructor
    public RegisteredUser(String Name, String Password, String eMail,Accounts acc) {
        this.Name = Name;
        this.Password = Password;
        this.eMail = eMail;
        this.acc=acc;
    }
    // setters and getters
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getEmail() {
        return eMail;
    } 

    public boolean sign_in(Accounts acc) {

		System.out.print("Enter email : ");
		String eMail= input.nextLine(); 
		System.out.print("Enter password : ");
		String Password = input.nextLine();
        System.out.print("\n");
		boolean success = false;

        for (int i = 0; i < acc.accounts.size(); i++) {

			if(acc.accounts.get(i).getEmail().equals(eMail) && acc.accounts.get(i).getPassword().equals(Password))
			{
                System.out.println("Account found Singed in Successfully ;)");
                success = true;
                break;
			}
        }
        return success;	
	}

    public void MobileInterntServices ()
    {
        System.out.println("1-We Service Provider");
        System.out.println("2-Vodafone Service Provider");
        System.out.println("3-Etisalat Service Provider");
        System.out.println("4-Orange Service Provider");

    }
    
    public void SearchServices() {

        System.out.print("Enter Service name you want to search for  : ");
        String ServiceName = input.nextLine();
        System.out.print("\n");
        if (ServiceName.toLowerCase().equals("mobile")) {
            System.out.println("Mobile recharge services found in System Services");
        }else if (ServiceName.toLowerCase().equals("internet")) {
            System.out.println("Internet Payment services found in System Services");
        }else if (ServiceName.toLowerCase().equals("landline")) {
            System.out.println("Landline services found in System Services");
        }else if (ServiceName.toLowerCase().equals("donation")) {
            System.out.println("Donations services found in System Services");
        }else {
            System.out.println("There is no such a service in the system");
        }
    }

    public static void registeredUserMenu() {
		System.out.print("\n");
		System.out.println("_______Registered User Menu______");
		System.out.println("1- Search for service");
		System.out.println("2- Services Menu");
		System.out.println("3- Add fund to your wallet");
		System.out.println("4- Check refund requests");
		System.out.println("5- Return back");
	}
    
}
