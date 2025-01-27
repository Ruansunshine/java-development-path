package Application;
import entities.Account;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there account an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(holder, number, initialDeposit);
        }else{
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit Value: ");
        double depositValue = sc.nextDouble();
        account.Deposit(depositValue);
        System.out.println("updated deposit value: " + depositValue);
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw Value: ");
        double withdrawValue= sc.nextDouble();
        account.Withdraw(withdrawValue);
        System.out.println("updated deposit data: " + withdrawValue);
        System.out.println(account);



        sc.close();
    }
}
