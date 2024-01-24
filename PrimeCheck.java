import java.util.*;
import java.lang.*;
class PrimeCheck{
	public static void main(String bam[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0 ||a==1){
			System.out.println("Not a prime");
		}
		else if(a==2){
			System.out.println("yes");
		}
		else{
			int flag=0;
			for(int i=2;i<=Math.sqrt(a);i++){
				if(a%i==0){
					System.out.println("Not a prime");
					flag=1;
					break;
				}
			}
			if(flag==0){
			System.out.println("yes");
			}
		}
	}
}
