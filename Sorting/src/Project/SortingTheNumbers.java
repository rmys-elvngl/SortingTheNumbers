package Project;
import java.util.Scanner;
public class SortingTheNumbers {
	public static void main(String[] args) {
		int a,b,c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. sayı = ");
		a = input.nextInt();
		
		System.out.print("2. sayı = ");
		b = input.nextInt();
		
		System.out.print("3. sayı = ");
		c = input.nextInt();
		
		if ((a<b) && (a<c)) {
			if(b<c) {
				System.out.print("1.sayı < 2.sayı < 3.sayı");
			}
			else {
				System.out.print("1.sayı < 3.sayı < 2.sayı");
			}
		}
		else if((b < a) && (b < c)) {
			if(a < c) {
				System.out.print("2.sayı < 1.sayı < 3.sayı");
			}
			else {
				System.out.print("2.sayı < 3.sayı < 1.sayı");
			}
		}
		else if((c < a) && (c < b)) {
			if(a < b) {
				System.out.print("3.sayı < 1.sayı < 2.sayı");
			}
			else {
				System.out.print("3.sayı < 2.sayı < 1.sayı");
			}
		}
	}
}
