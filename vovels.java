
package vovels;
import java.util.Scanner;
public class vovels {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the alphabet:");
		char n=sc.next().charAt(0);
		switch(n) {
		case 'a':System.out.println("Is a vowel");
		break;
		case 'e':System.out.println("Is a vowel");
		break;
		case 'i':System.out.println("Is a vowel");
		break;
		case 'o':System.out.println("Is a vowel");
		break;
		case 'u':System.out.println("Is a vowel");
		break;
		default:System.out.println("Is a consonant");
		}
		
	}

}
