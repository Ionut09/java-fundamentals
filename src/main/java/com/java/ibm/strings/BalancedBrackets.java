package com.java.ibm.strings;

public class BalancedBrackets {
	
	public static void main(String[] args) {
		String[] strings = {
			"()",
			"[()]", //->"[]" ->"" -> is balanced
			"{[()]}", //{[]} -> {} ->
			"([{{[(())]}}])",
			"abc[](){}",
			"{{[]()}}}}",
			"{[(])}" //-> "{[(])}" -> is not balanced
		};
		
		for (String input : strings) {
			if (isBalanced(input)) {
				System.out.println(input + " is balanced");
			} else {
				System.out.println(input + " is not balanced");
			}
		}
	}
	
	private static boolean isBalanced(String string) {
		while (string.contains("()") ||
			       string.contains("[]") ||
			       string.contains("{}")) {
			string = string.replace("()", "");
			string = string.replace("[]", "");
			string = string.replace("{}", "");
		}
		return string.isEmpty();
	}
}
