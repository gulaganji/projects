package Atmmachine;
import java.util.*;

class Atmmachine1{
    float Balance;
    int Pin=5674;
    public void checkpin(){
        System.out.println("Enter your pin");
        Scanner sc=new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(enterpin==Pin){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }

    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();

        }
        else if(opt==4){
            return;
        }
        else{
            System.out.print("Enter the valid choise");
        }
    }
    public void checkBalance(){
        System.out.print("Balance:" + Balance);
        menu();

    }
    public void  withdrawMoney(){
        System.out.print("Enter Amount to Withdraw");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.print("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.print("Money Withdrawl Sucessful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.print("Enter the Amount");
        Scanner sc=new Scanner(System.in);
        float amount =sc.nextFloat();
        Balance=Balance+amount;
        System.out.print("Money Deposited Successfully");
        menu();
    }

}
public class Atm1{
    public static void main(String[] args){
        Atmmachine1 a=new Atmmachine1();
        a.checkpin();


    }
}