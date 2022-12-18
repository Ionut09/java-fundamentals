package com.java.ibm.streams;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TradingNYSE {
	
	/**
	 * 1. Find all transactions in the year 2011 and sort them by value  (small to high).
	 * 2. What are all the unique cities where the traders work?
	 * 3. Find all traders from Cambridge and sort them by name.
	 * 4. Return a string of all traders’ names sorted alphabetically.
	 * 5. Are any traders based in Milan?
	 * 6. Print all transactions’ values from the traders living in Cambridge.
	 * 7. What’s the highest value of all the transactions?
	 * 8. Find the transaction with the smallest value
	 */
	static Trader raoul = new Trader("Raoul", "Cambridge");
	static Trader mario = new Trader("Mario", "Milan");
	static Trader alan = new Trader("Alan", "Cambridge");
	static Trader brian = new Trader("Brian", "Cambridge");
	static List<Transaction> transactions = Arrays.asList(
		new Transaction(brian, 2011, 300),   //$
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(alan, 2012, 950)
	);
	
	public static void main(String[] args) {
		ex1().forEach((transaction -> System.out.println(transaction)));//void accept(Transaction t )
		System.out.println(ex7());
		System.out.println(ex4());
	}
	
	//Find all transactions in the year 2011 and sort them by value  (small to high).
	private static List<Transaction> ex1() {
		return transactions.stream()
		                   .filter((Transaction t) -> {
			                   return t.getYear() == 2011;
		                   })     //boolean test(Transaction t )
		                   
		                   // int compare(Transaction t1, Transaction t2)
		                   .sorted((Transaction t1, Transaction t2) -> t1.getValue() - t2.getValue())
		                   .collect(toList());  //terminal op
		//			        .toList();  //terminal op   din Java 16
		//			        .collect(Collectors.toCollection(ArrayList::new));  //terminal op
	}
	
	//	 * 7. What’s the highest value of all the transactions?
	private static int ex7() {
		return transactions.stream()
		                   .map((Transaction t) -> t.getValue())
		                   .max((v1, v2) -> v1 - v2)
		                   .orElseThrow();
	}
	
	   private static List<String> ex4() {
		return transactions.stream()
			       .map((transaction -> transaction.getTrader().getName()))
			       .distinct()
			       .sorted()
			       .collect(Collectors.toList()) ;
//			       .collect(Collectors.toCollection(TreeSet::new)) ;
	   }
}
