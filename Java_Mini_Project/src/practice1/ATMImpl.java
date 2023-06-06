package practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ATMImpl implements ATMinterface{
	ATM atm=new ATM();
	Scanner sc=new Scanner(System.in);
	Map<Double, String> map= new HashMap<Double, String>();
	

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("available balance is:"+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if (withdrawAmount%100==0) {
			
		
		if(withdrawAmount<=atm.getBalance()) {
			map.put(withdrawAmount, "amount withdrawn");
		System.out.println("collect the cash "+withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		
	    }
		else {
			System.out.println("insufficient balance!!");
		}
		} else {
			System.out.println("please enter the amount in multiple of 100");

		}
		
	}

	@Override
	public void depositeAmount(double depositeAmount) {
		map.put(depositeAmount, "amount deposited");
		// TODO Auto-generated method stub
		System.out.println(depositeAmount+" deposited successfully");
		atm.setBalance(atm.getBalance()+depositeAmount);
		
	}

	@Override
	public void miniStatement() {
		
         
          for (Entry<Double, String> e : map.entrySet()) {
        	  System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
