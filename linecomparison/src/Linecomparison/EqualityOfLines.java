package Linecomparison;

public class EqualityOfLines {
	public static void main(String[] args) {
	String s1="ANUJ";
	String s2 ="anuj";
	String s3 = new String ("anuj");
		System.out.println(s1+ "equals" +s2+ ":" +s1.equals(s2));
		System.out.println(s1+ "equals" +s3+ ":" +s1.equals(s3));
		System.out.println(s3+ "equals" +s2+ ":" +s3.equals(s2));
	}
}
