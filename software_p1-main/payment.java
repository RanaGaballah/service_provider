public abstract class payment {

   
    String description =" ";
    ServiceProvider sp;
   
    public payment() {
    }
   
    public String getDescription(){
        return description;
    }
    
    public abstract double cost( ServiceProvider sp);

    public static void paymentWays() {
		System.out.print("\n");
		System.out.println("_______Choose Payment way______");
		System.out.println("1- Credit card");
		System.out.println("2- Cash");
		System.out.println("3- Wallet");
	}
}
