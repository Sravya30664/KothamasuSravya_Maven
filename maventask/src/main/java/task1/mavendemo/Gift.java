package task1.mavendemo;
import java.util.*;
public class Gift {
	public static void main(String a[]) {
	Scanner sc=new Scanner(System.in);
	int choci,sweetno,candy=0;
	int upper,lower,gift;
	System.out.println("Enter upper range for candy");
	upper=sc.nextInt();
	System.out.println("Enter lower range for candy");
	lower=sc.nextInt();
	System.out.println("Enter gift weight");
	gift=sc.nextInt();
	System.out.println("Enter number of sweets");
	sweetno=sc.nextInt();
	int sweets[]=new int[sweetno];
	System.out.println("Enter number of choclates");
	choci=sc.nextInt();
	int choclates[]=new int[choci];
	System.out.println("Enter weight of each sweet");
	for(int i=0;i<sweetno;i++) {
		sweets[i]=sc.nextInt();
	}
	System.out.println("Enter weight of each choclate");
    for(int i=0;i<choci;i++) {
        choclates[i]=sc.nextInt();	
    }
	ChociSweets cs=new ChociSweets();
	int total=0;
	int total_weight=cs.chocisweetsweight(choclates, sweets, choci, sweetno, total);
	System.out.println("Total weight in the new year gift is "+total_weight);
	System.out.println("Choclates and sweets in the range of candy are");
	for(int i=0;i<choci;i++) {
		candy=candy+cs.candiesinrange(lower, upper,choclates[i]);
	}
	for(int i=0;i<sweetno;i++) {
		candy=candy+cs.candiesinrange(lower, upper,sweets[i]);
	}
	System.out.println("Number of candies in range are "+candy);
	
	}

}
