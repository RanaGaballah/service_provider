public class CreditCard extends payment {

    double balance ;
    
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public CreditCard(double balance) {
        this.balance = balance;
    }
    @Override
    public double cost(ServiceProvider sp) {
        balance-=sp.amount;
        return sp.amount ;
    }
    
}
