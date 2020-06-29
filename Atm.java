package atmpack;
import java.util.*;

public class Atm {

	public static void main(String[] args) {
		
		System.out.println("Enter Amount");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
	if(amount%100==0) {	
		int thousand = 0;
		int five = 0;
		int hundred = 0;
		if(amount>=1000) {
			 thousand = amount / 1000;
			System.out.println("1000 * "+ thousand + " = " + 1000*thousand+"rs" );	
			 amount = amount % 1000; 
		}
		if(amount>=500) {
			 five = amount / 500;
			System.out.println("500 * "+ five + " = " + 500*five+"rs" );
			amount = amount % 500; 
	   }
		if(amount>=100) {
			 hundred = amount / 100;
			System.out.println("100 * "+ hundred + " = " + 100*hundred+"rs");
			amount = amount % 100;
			System.out.println("Change : "+ amount+"rs");
		}
		System.out.println("*Total* = " + (thousand*1000+five*500+hundred*100+amount) +"rs" );	

  }
	else
		System.out.println("Enter demonization of 100's ");


}}
