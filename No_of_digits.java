package clas;
import java.util.*;
public class No_of_digits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	for(int i=1;a>0;i++) {
		int s=a%10;
		a/=10;
		count++;
	}
	System.out.println(count);
}
}
