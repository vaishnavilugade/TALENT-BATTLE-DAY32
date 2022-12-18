import java.util.*;
class RemoveVowel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a,n;
		System.out.println("Enter string:");
		a=sc.nextLine();
		a = a.replaceAll("[aeiou]", "");
		System.out.println("new string:"+a);
	}
}


				

