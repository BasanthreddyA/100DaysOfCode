//23-02-2023  pdsb1
//  WAP menu to drive programe to drive  for bank application for deposite ,withdraw and balance enquiry .
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int balance=5000;
	    int ch,amount=0;
	    Scanner sc=new Scanner(System.in);
	    int n=1;
	    while(n!=0){
	        System.out.println("\n Menu \n");
	        System.out.println("1 Deposite");
	        System.out.println("2 WithDraw");
	        System.out.println("3 Balance Enquirey");
	        System.out.println("4 exit");
	        System.out.println("Enter your choice");
	        
	        ch=sc.nextInt();
	        switch(ch){
	            case 1: System.out.println("Enter the amount to Deposit");
	                 amount+=sc.nextInt();
	                 balance+=amount;
	                 System.out.println(amount +" as Deposited .The balance is "+ balance);
	                 break;
	            case 2: System.out.println("Enter the amount to withdraw");
	            amount=sc.nextInt();
	                if(amount<=balance-1000){
	                    balance-=amount;
	                    System.out.println(amount +" Amount is withdrawn balance , Remaing Balnce is "+balance);
	                    break;
	                }else{
	                    System.out.println("Insufficent balance"+ balance);
	                    break;
	                }
	           case 3: System.out.println("Your balance is "+balance);
	                    break;
	           
	           case 4: System.out.println(" Programe is Terminated ");
	                    System.exit(0);
	                    
	           default:
	               System.out.println(" Enter the Vaild choice between 1 to 4");
	        }
	        
	        System.out.println(" \n If you want to continue press 1 \n or to Exit press 0 ");
	        n=sc.nextInt();
	        
	        
	        }
	    }
	}
