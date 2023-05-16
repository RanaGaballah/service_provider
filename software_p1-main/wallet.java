public class wallet extends payment {

    double balance;
    CreditCard card;
    public wallet() {
        balance = 0;
    }
    public wallet(double balance)
    {
        this.balance=balance;
    }
    
    public void AddToWallet(CreditCard card,double funds)
    {
        card.balance-=funds;
        balance += funds;
        System.out.println("Funds has been added successfully ;) ");
            
    }
    public double getBalance()
    {
            return balance;
    }

    @Override
    public double cost(ServiceProvider sp) {
        
        if(balance >= sp.amount)
        {
            balance-=sp.amount;
            return sp.amount;
        }
        else
        {
            System.out.println("There is no enough balance in your wallet ,please add fund first");
            return -1;
        }
        
    }
    
    
}
