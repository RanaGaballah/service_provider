public class Services {
    
    public payment p;
    public payment GetPaymentTech(payment pay)
    {
        return p=pay;
    }
    public Services() {
    }
    public payment getP() {
        return p;
    }
    public void setP(payment p) {
        this.p = p;
    }

    public static void ServicesMenu() {
		System.out.print("\n");
		System.out.println("_______Services Menu______");
		System.out.println("1- Mobile recharge services");
		System.out.println("2- Internet Payment services.");
		System.out.println("3- Landline services");
		System.out.println("4- Donations");
		System.out.println("5- Return back");
	}
    
}
