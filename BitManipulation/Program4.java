/*Given a positive integer n and you can do operations as follow:
1.	If n is even, replace n with n/2.
2.	If n is odd, you can replace n with either n + 1 or n - 1.
What is the minimum number of replacements needed for n to become 1?
Example 1:
Input:
8
Output:
3
*/
package BitManipulation;
import java.io.*;
public class Program4 {
	static int min_num_replacements(int n)
	{
		int c=0;
        while((n|0)!=1)
        {
           if((n&1)==0)
               n=n>>1;
           else if(((n>>1)&1)==1)
               n=n+1;
           else
               n=n-1;
           c++;
        }
        return c;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        System.out.println(min_num_replacements(n));
	}

}
