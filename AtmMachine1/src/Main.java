package ATMMachine;
import java.util.*;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 6543;
    public void checkpin()
    {
        System.out.println("Enter your Pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin  ");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice : ");
        System.out.println("1. Check A/C Balance : ");
        System.out.println("2. Withdraw Money : ");
        System.out.println("3. Deposit Money : ");
        System.out.println("4. EXIT : ");

        Scanner sc = new Scanner(System.in);
        int opt =  sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            Deposit();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice !");
        }
    }
    public void checkBalance()
    {
        System.out.println("Balance : " + Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter the Amount to Withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Amount !");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money Withdrawn !");
        }
        menu();
    }
    public void Deposit(){
        System.out.println("Enter the amount to Deposit : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance= Balance+amount;
        System.out.println("Money Deposited Successfully !");
        menu();
    }

}
class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}