import java.util.ArrayList;
import java.util.Scanner;

public class RefundRequest {
	
	String serviceName;
	String UserName;
	String RefundAmount;
	
	
	
	 public ArrayList<RefundRequest> Req ;
	 public RefundRequest() {
		 Req = new ArrayList<RefundRequest>();
		 
		}
	 RefundRequest(String username,String serviceName,String RefundAmount)
	 {
		 this.UserName=username;
		 this.serviceName=serviceName;
		 this.RefundAmount=RefundAmount;
	}
	 
	 public void RefundRequestForm()
	 {
		    Scanner input = new Scanner(System.in);

	        System.out.println("_______Refund Request Form________");
	        System.out.print("Enter User Name : ");
	        String un = input.nextLine();
	        this.setUserName(un);;
	        System.out.print("Enter Service Name you want to Refund : ");
	        String sn = input.nextLine();
	        this.SetServiceName(sn);
	        System.out.print("Enter Amount you want to Refund : ");
	        String am = input.nextLine();
	        this.setRefundAmount(am);
	        this.Req.add(this);
	        System.out.print("Your Request Sent to Admin to check it \n ");
	        
	        		
	 }
	 
	 public void SetServiceName(String serviceName) {
	        this.serviceName=serviceName;
	    }

	    public String GetServiceName() {
	        return serviceName;
	    }

	    public void setUserName(String username) {
	        this.UserName=username;
	    }

	    public String getUserName() {
	        return UserName;
	    }

	    public void setRefundAmount(String RefundAmount) {
	        this.RefundAmount=RefundAmount;
	    }

	    public String getRefundAmount() {
	        return RefundAmount;
	    }
	    
		public static void RefundMenu() {
			System.out.print("\n");
			System.out.println("_____________");
			System.out.println("1- Confirm Payment");
			System.out.println("2- Make Refund Request");
			
		}
		
}