public class Cahce extends payment {

    public Cahce() {
    }
    @Override
    public double cost(ServiceProvider sp) {
        return sp.getAmount();
    }
    
}
