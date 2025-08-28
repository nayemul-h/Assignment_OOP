class BankAccount {
    int accountNumber;
    String holderName;
    double balance;


    BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }



    void deposit(double amount) {
        if (amount>0){
            this.balance+=amount;
            System.out.println("Name:"+this.holderName);
            System.out.println("Account Number:"+this.accountNumber);
            System.out.println("Deposited:"+amount);
            System.out.println("After deposit Balance:"+this.balance);
        }
    }

    void withdraw (double amount){
        if (amount>0){
            this.balance-=amount;
            System.out.println("Name:"+this.holderName);
            System.out.println("Account Number:"+this.accountNumber);
            System.out.println("Withdrawn:"+amount);
            System.out.println("After withdrawn Balance:"+this.balance);
        }
    }

    void withdraw (double amount,double fee){
        if (amount>0 && fee >0){
            this.balance-=(amount+fee);
            System.out.println("Name:"+this.holderName);
            System.out.println("Account Number:"+this.accountNumber);
            System.out.println("Withdrawn:"+amount+"Fee:"+fee);
            System.out.println("After withdrawn Balance:"+this.balance);
        }
    }

       void showDetails(){
           System.out.println("*******Account details:********");
           System.out.println("Name:"+this.holderName);
           System.out.println("Account Number:"+this.accountNumber);
           System.out.println("Balance:"+this.balance);
       }


}
