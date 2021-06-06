package nsp.bhu.in;

import java.util.ArrayList;
import java.util.List;

public class people {
    private String name;
    private String account_number;
    private double balance;
    private List<String> passbook = new ArrayList<String>();
    static String temp = "NSP10002000";
    static int c = 0;

    public people(String name) {
        this.name = name;
        this.balance = 0;
        c++;
        this.account_number = temp + String.valueOf(c);
        String p1 = "New Account created with initial balance 0";
        passbook.add(p1);

    }

    public people(String name, double init_balance) {
        this.name = name;
        this.balance = init_balance;
        c++;
        this.account_number = temp + String.valueOf(c);
        String p1 = "New Account created with initial balance " + String.valueOf(init_balance);
        passbook.add(p1);
        // System.out.println(p1);
    }

    public void deposit(double amount) {
        this.balance += amount;
        String p1 = String.valueOf(amount) + " has been added succesfully !!! NEW BALANCE IS "

                + String.valueOf(this.balance);
        passbook.add(p1);

        System.out.println(p1);

    }

    void withdrawl(double amount) {
        if (amount > this.balance) {
            System.out.println("TRANSACTION FAILED!! INSUFFICIENT BALANCE");
        } else {
            this.balance -= amount;
            String p1 = "TRANSACTION SUCCESSFULL !! NEW BALANCE IS " + String.valueOf(this.balance);
            passbook.add(p1);

            System.out.println(p1);
        }
    }

    void view_details() {
        System.out.println("NAME : " + this.name);
        System.out.println("ACCOUNT NO. : " + this.account_number);
        System.out.println("CURRENT BALANCE = " + this.balance);
        System.out.println("");
    }

    void view_passbook() {
        for (int i = 0; i < passbook.size(); i++) {
            System.out.println(passbook.get(i));
        }
    }

    public String getAccountNo() {
        return this.account_number;
    }
}
