import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of rows");
	    int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int col=sc.nextInt();
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		    System.out.print("*");
		}
		System.out.println();
		}
	}
}
