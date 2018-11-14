package com.emre.javanotes;

/*
 * Bir methoda g�nderilecek argument sayisi �nceden bilinmiyorsa iki yol denenebilir.
 * 
 * 1-overload, 2-array kullanmak ama bunlar bakim acisindan s�k�nt� olu�turabilir.
 * 
 * Java 5 ile beraber gelen varargs �zelli�i ile keyfi miktarda argument g�nderilebilir.
 * 
 * �� nokta (...)ifade kullanilir ve return_type method(datatype... args) seklinde tanimlanir.
 * 
 */

// Bir method sadece 1 parametreyi varargs olarak tan�mlayabilir.
// Varargs parametresi methodun son parametresi olmal�.

public class Varargs {
	
	public static int methodVarargs(int... args) {
		int sum = 0;
		for(int number : args) {
			sum += number;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Toplam 1: "+methodVarargs(1,2,3,4));
		System.out.println("Toplam 2: "+methodVarargs(6,7));
		System.out.println("Toplam 3: "+methodVarargs());
		
		//System.out.println(method1(1,2,3)); //the method method1(int, int[]) is ambiguous for the type Varargs
	}
	
	// Varargs overloaddan ka��n�lmal� ��nk� hataya a��kt�r
	public static void method1(int num1, int... nums) {}
	
	public static void method1(int... nums) {}
}
