/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
			for(int i=0;i<t;i++){
				int n = sc.nextInt();
				int[] c = new int[n];
				for(int j=0;j<n;j++){
					c[j] = sc.nextInt();
					
				}
				Arrays.sort(c);
				for(int j=0;j<n;j++){
					if(j==n-2){
						System.out.println(c[j]);
						break;
					}
				}
				
				
			}
	}
}
