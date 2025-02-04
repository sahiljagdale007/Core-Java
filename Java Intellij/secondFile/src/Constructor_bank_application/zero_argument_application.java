package Constructor_bank_application;

import java.sql.SQLOutput;

class Account {
    String accNo;
    String accName;
    String accType;
    int accBalance;

    public void setAccountDetails()

    {
        accNo = "CRAPJ8413P";
        accName = "Sahil Jagdale";
        accType = "Current AC";
        accBalance = 50000;
    }

    public void getAccountDetails()

    {
        System.out.println("Account Details");
        System.out.println("--------------------------");
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Name  :"+accName);
        System.out.println("Account Type  :"+accType);
        System.out.println("Account Balance :"+accBalance);
    }
}

public class zero_argument_application {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccountDetails();
        acc.getAccountDetails();
    }
}
