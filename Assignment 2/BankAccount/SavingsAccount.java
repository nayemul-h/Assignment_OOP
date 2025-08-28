public class SavingsAccount extends BankAccount {

        SavingsAccount(int accountNumber,String holderName,double balance){
            super(accountNumber,holderName,balance);
        }
     double minimumBalance=500;

    void withdraw (double amount){
        if (amount>0 && (this.balance-amount) >=minimumBalance){
            {
                this.balance -= amount;
                System.out.println("Name:" + this.holderName);
                System.out.println("Account Number:" + this.accountNumber);
                System.out.println("Withdrawn:" + amount);
                System.out.println("After withdrawn Balance:" + this.balance);
            }

        }
        else System.out.println("You can't withdraw because you don't have enough balance");
    }

    @Override
    void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    void showDetails() {
        super.showDetails();
    }
}
