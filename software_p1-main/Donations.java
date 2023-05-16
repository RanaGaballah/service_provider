import java.util.Scanner;

public class Donations extends Services {
    static Scanner input = new Scanner(System.in);
    String OrganizationName;
    String OrganizationPhone;
    String UserNumber;
    String amount;
    
    public String getOrganizationName() {
		return OrganizationName;
	}
	public void setOrganizationName(String organizationName) {
		OrganizationName = organizationName;
	}
	public String getOrganizationPhone() {
		return OrganizationPhone;
	}
	public void setOrganizationPhone(String organizationPhone) {
		OrganizationPhone = organizationPhone;
	}
	public String getUserNumber() {
		return UserNumber;
	}
	public void setUserNumber(String userNumber) {
		UserNumber = userNumber;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	

    public Donations() {
    }
    
    public void DonationsInfo() {
		System.out.println("Enter Organization name : ");
		OrganizationName= input.nextLine();
		System.out.println("Enter Organization phone : ");
		OrganizationPhone = input.nextLine();
		System.out.println("Enter your number : ");
		UserNumber = input.nextLine();
		System.out.println("Enter amount : ");
		amount = input.nextLine();
	}
    
}
