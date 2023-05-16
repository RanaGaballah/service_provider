import java.util.*;  
public class UnregisteredUser extends User {

    Scanner input = new Scanner(System.in);
    Accounts acc;
    public UnregisteredUser() {
    }

    public boolean signup(Accounts acc) {

		System.out.print("Enter user name : ");
		String Name = input.nextLine(); 
		System.out.print("Enter email :  ");
		String eMail= input.nextLine(); 
		System.out.print("Enter password :  ");
		String Password = input.nextLine(); 
        boolean check = true;
        for (int i = 0; i < acc.accounts.size(); i++) {

            if (acc.accounts.get(i).getEmail().equals(eMail) || acc.accounts.get(i).getName().equals(Name)) {
                check=false;
                break;
                
            } 
        }
        if(check){
            RegisteredUser u = new RegisteredUser(Name,Password,eMail,acc);
            acc.accounts.add(u);
            System.out.println("you signed up successfully ");
            return check;
        }
        else{
            System.out.println("Email or Username  already exist ");
            return check;
        }
		
		
	}

    
}
