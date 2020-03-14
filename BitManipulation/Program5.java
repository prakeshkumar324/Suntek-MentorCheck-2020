/*Given a non negative integer number num. For every numbers i in the range 0 <= i <= num calculate the number of 1's in their binary representation and return them as an array.
Example 1:
Input: 2
Output: [0,1,1]
   It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass
   Space complexity should be O(n)
*/
package BitManipulation;
import java.io.*;
import java.util.*;
public class Program5 {

	public static void main(String[] args)throws IOException {
		ArrayList<Integer> ar=new ArrayList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		num=Integer.parseInt(br.readLine());
		ar.add(0);
		ar.add(1);
		for (int i=2;i<=num;i++)
		{
			int c=ar.get(i-1);
			if(((i-1)&1)==1)
			{
				int temp=i-1;
				while((temp&1)==1)
				{
					c--;
					temp=temp>>1;
				}
			}
			ar.add(c+1);
		}
		System.out.println(ar);
	}

}
