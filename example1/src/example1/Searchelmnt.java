package example1;

import java.util.Scanner;

public class Searchelmnt {
	public static void main(String[]args){
		int n,x,flag=0,i;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of elements");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all elements");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("enter elements want to find");
		x=s.nextInt();
		for(i=0;i<n;i++){
			if(a[i]==x){
				flag=1;
				break;
			}
			else{
				flag=0;
			}
		}
			if(flag==1){
				System.out.println("the element is found"+(i+1));
			}
			else{
				System.out.println("the element not found");
			}
		}
}
