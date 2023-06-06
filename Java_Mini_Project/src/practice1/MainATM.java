package practice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainATM {
	public static void main(String[] args) {
		ATMinterface ai=new ATMImpl();
		int atmNum=12345;
		int atmPin=123;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("!!----welcome to atm machine---!!");
		try {
		System.out.println("enter atm number");
		int num=sc.nextInt();
		System.out.println("enter atm pin ");
		int pin=sc.nextInt();
		
		if ((atmNum==num)&&(atmPin==pin)) {
			while(true){
				System.out.println("------------------------------");
			System.out.println("enter 1-for view available balance \n 2-withdraw amount \n 3-deposite amount \n 4-mini statement \n 5-exit");
			int option=sc.nextInt();
			switch (option) {
			case 1:
			ai.balance();
				
				break;
			case 2:System.out.println("enter amount to withdraw");
			double withdrawAmount=sc.nextDouble();
			ai.withdrawAmount(withdrawAmount);
				
				break;
			case 3:System.out.println("enter amount to deposite");
			double depositeAmount=sc.nextDouble();
			ai.depositeAmount(depositeAmount);
				
				break;
			case 4:System.out.println("mini statement");
			System.out.println("***************************");
				ai.miniStatement();
				ai.balance();
				
					break;
					
			case 5:System.out.println("collect your card \n----thank you for coming---:)\n visit again:)");
				System.exit(0);
					
					break;

			default:System.out.println("enter valid options");
				break;
			}
			
		}
			}
		else {
			System.out.println("enter valid credentials");
			System.exit(0);

		}
		}
		catch(InputMismatchException e) {
			System.out.println("only numbers are acceptable");
			
		}
	}

}
