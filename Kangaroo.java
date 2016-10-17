import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
       
        
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        if(x1 < x2)
        {
            if(v1 < v2)
                System.out.println("NO");
            else
            {
                int d1 = x1, d2 = x2 ;
                int c1 =0, c2 = 0;
                while(d1 < d2)
                {
                    d1 += v1;
		    System.out.print("d1: " + d1 + " ");
                    c1++;
                    d2 += v2;
		    System.out.print("d2: " + d2 + " ");
                    c2++;
                }
                if(d1 == d2)
                {
                    if(c1 == c2)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
		else 
			System.out.println("NO");    
            }
        }
        else if( x1 > x2)
        {
            if(v1 > v2)
                System.out.println("NO");
            else
            {
                int d1 = x1, d2 = x2 ;
                int c1 =0, c2 = 0;
                while(d1 > d2)
                {
                    d1 += v1;
		    System.out.print("d1: " + d1 + " ");
                    c1++;
                    d2 += v2;
		    System.out.print("d2: " + d2 + " ");
                    c2++;
                }
                if(d1 == d2)
                {
                    if(c1 == c2)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
		else 
		    System.out.println("NO");    
            }
        }
    }
}

