public class CheckingAccount extends BankAccount {
    double overDrift = 1000;

    CheckingAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

            //Can't figure out how overdrift works
    void withdraw(double amount, double fee) {
        if (amount > 0 && fee > 0 && (this.balance - amount) >= -overDrift) {
                this.balance -= (amount + fee);
                System.out.println("Name:" + this.holderName);
                System.out.println("Account Number:" + this.accountNumber);
                System.out.println("Withdrawn:" + amount + "Fee:" + fee);
                System.out.println("After withdrawn Balance:" + this.balance);
            }

         else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
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
