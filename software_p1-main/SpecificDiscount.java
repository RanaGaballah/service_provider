public class SpecificDiscount extends Discount {

    payment pay;
    public SpecificDiscount(payment pay){
        this.pay=pay;
    }
    public String getDescription(){
        return pay.getDescription()+"Overall Discount ( apply 20% discount ) ";
    }
    public double cost(ServiceProvider sp){
        return 0.80*pay.cost(sp);
    }
    
}
