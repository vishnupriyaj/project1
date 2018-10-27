package example1;

public class Fibonacci {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int r, n=101,sum=0, temp;
		 
		 temp=n;
		while(n>0){
			r=n%10;
				n=n/10;
				sum=(sum*10)+r;
		}
				if (temp==sum){
					System.out.println("is a no");
				}
				else
				{
					System.out.println("not a no");
				}
	}}
