public class OverallDiscount extends Discount {

    payment pay;
    public OverallDiscount(payment pay){
        this.pay=pay;
    }
    public String getDescription(){
        return pay.getDescription()+"Overall Discount ( apply 10% discount ) ";
    }
    public double cost(ServiceProvider sp){
        return 0.90*pay.cost(sp);
    }
}
