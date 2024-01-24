import java.util.*;
import java.lang.*;
class Lcmofthreenumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=lcm(a,b);
		int res=lcm(d,c);
		
		System.out.println(res);
		
			
			
	}
	public static int lcm(int a, int b){
		int hcf=0;
		for(int i=1;i<=a || i<=b;i++){
			if(a%i==0 && b%i==0){
				hcf=i;
			}
		}
		int lcm=(a*b)/hcf;
		return lcm;
	}
}
	