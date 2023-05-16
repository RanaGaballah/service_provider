import java.util.Scanner;


public class Admin {
    static Scanner input = new Scanner(System.in);
    RefundRequest re = new RefundRequest();


    public Admin() {
	}
	
	public boolean SinginAdmin(){
        System.out.print("Enter Email : ");
		String email = input.nextLine();
		System.out.print("Enter password : ");
		String pass = input.nextLine();
		if (pass.length() < 4) {
			return false;
		}
		return true;
    }
	 public Boolean checkReqests(RefundRequest re)
	 {
		 int Size= re.Req.size();
		 Boolean RequestStatus = true ;
		 if(Size==0)
		 {
			 System.out.println("No Requests");
		 }
		 else {
			 System.out.println("Requests : ");
			 for (int i = 0; i < Size; i++)
			 {
				 System.out.println("______________________________");
				 System.out.println("User Name : "+re.Req.get(i).getUserName());
				 System.out.println("Service Name : "+re.Req.get(i).GetServiceName());
				 System.out.println("Amount That User Want To Refund : "+re.Req.get(i).getRefundAmount()+" EGP");
				 System.out.println("______________________________");
				 System.out.println("1-Accept\n2-Reject");
				 System.out.print("Enter your choice : ");
				 int s= input.nextInt();
				 if(s==1)
				 {
					 re.Req.remove(i);
					 System.out.println("Request was accepted , we will sent to user ");
					 return RequestStatus;
				 }
				 else 
				 {
					 re.Req.remove(i);
					 System.out.println("Request was rejected , we will sent to user");
					 RequestStatus=false;
					 return RequestStatus;
				 }
			 }
			 
		 }
		 
		return RequestStatus;
		 
	 }

	 public static void AdminMenu() {
		System.out.print("\n");
		System.out.println("_______Admin Menu______");
		System.out.println("1- Review refund requests");
		System.out.println("2- Return back");
	}
	 
	 
	
    
}
