package guvi;
import java.util.*;
public class Largest_of_three {
	public static void main(String [] args) {
		int num[]  = {8,16,1};
		int max=num[0];
		 	for(int i=0;i<num.length;i++)
		 	{
		 		if(num[i]>max) 
		 		{
				 max=num[i];
		 		}
		 	}
		 System.out.println(max);
}
}
