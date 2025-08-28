import java.util.Scanner;

class test{
    public static void main(String[] args){

       SavingsAccount[] s= new  SavingsAccount[10];
       CheckingAccount[] c= new  CheckingAccount[10];
       Scanner sc=new Scanner(System.in);
       int taccountNum;
       String tName;
       double tbalance;
       int choice;
       int bchoice,i=0,j=0,saccountChoice,caccountChoice;

       while(true){
           System.out.println("1. Add Bank Account\n 2. Deposit \n 3. Withdraw \n 4. Check Account Details \n 5. Exit");
           System.out.println("Enter your choice:");
           choice=sc.nextInt();
           switch(choice){
               case 1:
                   System.out.println("1. Savings Account \n 2. Checking Account");
                   bchoice=sc.nextInt();
                   if(bchoice==1){
                       System.out.println("Enter Account Number:");
                       taccountNum=sc.nextInt();
                       sc.nextLine();

                       System.out.println("Enter Account Name:");
                       tName=sc.nextLine();

                       System.out.println("Enter Account Balance:");
                       tbalance=sc.nextDouble();

                       s[i]=new SavingsAccount(taccountNum,tName,tbalance);
                       i++;
                   }
                   else if(bchoice==2){
                       System.out.println("Enter Account Number:");
                       taccountNum=sc.nextInt();
                       sc.nextLine();
                       System.out.println("Enter Account Name:");
                       tName=sc.nextLine();
                       System.out.println("Enter Account Balance:");
                       tbalance=sc.nextDouble();
                       c[j]=new CheckingAccount(taccountNum,tName,tbalance);
                       j++;
                   }
                   break;
                   case 2:

                       System.out.println("1. Savings Account \n 2. Checking Account ");
                       System.out.println("Enter your choice:");
                       bchoice=sc.nextInt();
                       if(bchoice==1){
                           System.out.println("In which savings account:");
                           saccountChoice=sc.nextInt();
                           System.out.println("Enter Deposit Amount:");
                           tbalance=sc.nextDouble();
                           s[saccountChoice-1].deposit(tbalance);
                       }
                       else if(bchoice==2){
                           System.out.println("In which Checking account:");
                           caccountChoice=sc.nextInt();
                           System.out.println("Enter Deposit Amount:");
                           tbalance=sc.nextDouble();
                           c[caccountChoice-1].deposit(tbalance);
                       }
                       break;

               case 3:

                   System.out.println("1.Savings Account \n 2.Checking Account ");
                   System.out.println("Enter your choice:");
                   bchoice=sc.nextInt();
                   if(bchoice==1){
                       System.out.println("From which account you want to withdraw:");
                       saccountChoice=sc.nextInt();
                       System.out.println("Enter Amount to withdraw:");
                       tbalance=sc.nextDouble();
                       s[saccountChoice-1].withdraw(tbalance);


                   }

                   if (bchoice==2){
                       System.out.println("From which account you want to withdraw:");
                       caccountChoice=sc.nextInt();
                       System.out.println("Enter Amount to withdraw:");
                       tbalance=sc.nextDouble();
                       c[caccountChoice-1].withdraw(tbalance);
                   }
                   break;

               case 4:
                   System.out.println("1.Savings Account \n 2.Checking Account ");
                   System.out.println("Enter your choice:");
                   bchoice=sc.nextInt();
                   if(bchoice==1){
                       System.out.println("Enter Account Number:");
                       taccountNum=sc.nextInt();
                       s[taccountNum-1].showDetails();
                   }
                   else if(bchoice==2){
                       System.out.println("Enter Account Number:");
                       taccountNum=sc.nextInt();
                       c[taccountNum-1].showDetails();

                   }
                   break;

               case 5:
                   return ;


           }

       }





    }
}