import java.util.*;
import java.lang.*;
class Primenew{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));
	}
	public static String isPrime(int num){
		if(num==0 || num==1){
			return "No";
		}
		if(num==2){
			return "Yes";
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				return "No";
			}
		}
		return "Yes";
	}
}