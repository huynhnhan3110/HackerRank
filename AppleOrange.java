//Problem: https://www.hackerrank.com/challenges/apple-and-orange
//Java 8
import java.util.Scanner;
public class AppleOrange {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        int []apples = {2,3,-4};
	        
	        int []oranges = {3,-2,-4};

	        int countApple = 0;
	        int countOrange = 0;
	        int Apples_land[] = new int[apples.length];
	        int Oranges_land[] = new int[oranges.length];
	        
	        for(int i = 0; i<apples.length; i++) {
	        	
	        	Apples_land[i] = a + apples[i];
	        	if(Apples_land[i] >= s && Apples_land[i] <= t) {
	        		countApple++;
	        	}
	        }
	        
	        for(int i = 0; i<oranges.length; i++) {
	        	Oranges_land[i] = b + oranges[i];
	        	if(Oranges_land[i] >= s && Oranges_land[i] <= t) {
	        		countOrange++;
	        	}
	        }
	        
	        System.out.println(countApple);
	        System.out.println(countOrange);
	    }
}
