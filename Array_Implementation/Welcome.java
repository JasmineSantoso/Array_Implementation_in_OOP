public class Welcome {
    public static void main(String[] args) {
        Bank[] bank = new Bank[2];
        
        bank[0].addCustomer("Alum", "Kai");
        bank[0].addCustomer("Biba", "Meng");
        bank[1].addCustomer("Chiko", "Chuck");

        Customer customerA = bank[0].getCustomer(0);
        Customer customerB = bank[0].getCustomer(1);
        Customer customerC = bank[1].getCustomer(0);

        Account acc1 = new Account(500000);
        Account acc2 = new Account(450000);
        Account acc3 = new Account(870000);
        Account acc4 = new Account(730000);

        customerA.addAccount(acc1);
        customerA.addAccount(acc4);
        customerB.addAccount(acc2);
        customerC.addAccount(acc3);


        System.out.println("Customer: " + customerA);
        System.out.println(
            "Jumlah Account: " + customerA.getNumOfAccounts()
        );

        System.out.println(
            "Account 1 Balance: "
            + customerA.getAccount(0).getBalance()
        );
        acc1.deposit(1500);
        System.out.println(
            "Account 1 Balance after Deposit: "
            + customerA.getAccount(0).getBalance()
        );

        System.out.println(
            "Account 2 Balance: "
            + customerA.getAccount(1).getBalance()
        );
        acc4.withdraw(4900);
        System.out.println(
            "Account 2 Balance after Withdraw: "
            + customerA.getAccount(1).getBalance()
        );

        System.out.println("-------------------------------");
        System.out.println("Customer: " + customerB);
        System.out.println(
            "Jumlah Account: " + customerB.getNumOfAccounts()
        );

        System.out.println(
            "Account 1 Balance: "
            + customerB.getAccount(0).getBalance()
        );
        acc2.withdraw(500);

        System.out.println(
            "Account 1 Balance after Withdraw: "
            + customerB.getAccount(0).getBalance()
        );

        System.out.println("-------------------------------");
        System.out.println("Customer: " + customerC);
        System.out.println(
            "Jumlah Account: " + customerC.getNumOfAccounts()
        );

        System.out.println(
            "Account 1 Balance: "
            + customerC.getAccount(0).getBalance()
        );
        acc3.deposit(1000);

        System.out.println(
            "Account 1 Balance after Withdraw: "
            + customerC.getAccount(0).getBalance()
        );

    }
}
