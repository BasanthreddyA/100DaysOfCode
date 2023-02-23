//23-02-2023  pdsb1
//checking the number is ugly number or not when the number is divisible by 2,3,5 it is ugly number else it is not a ugly number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number are you going to check number is ugly or not");
	    int n=sc.nextInt();
	    boolean numberugly=true;
	    int n1=n;
	    while (n!=1){
	        if(n%2==0)
	            n=n/2;
	        else if(n%3==0)
	           n=n/3;
	        else if(n%5==0)
	            n=n/5;
	        else{
	            numberugly=false;
	            break;
	        }
	    }
	    if(numberugly){
	        System.out.println(n1+" is a ugly number");
	    }else{
	        System.out.println(n1+" is not a ugly number");
	    }
	    
	}
}
