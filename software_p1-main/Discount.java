public abstract class Discount extends payment{

    public Discount() {
    }
    public abstract String getDescription();

    public static void DiscountMenu() {
		System.out.print("\n");
		System.out.println("_______Discount Menu______");
		System.out.println("1- Overall Discounts");
		System.out.println("2- Specific Discounts");
	}
    
}
