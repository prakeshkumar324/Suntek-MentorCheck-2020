/*Given the array arr of positive integers and the array queries where queries[i] = [Li, Ri], for each query i compute the XOR of elements from Li to Ri (that is, arr[Li] xor arr[Li+1] xor ... xor arr[Ri] ). Return an array containing the result for the given queries.

Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8] 
*/
package BitManipulation;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Program1 {
	static int[] XOR_Func(ArrayList<Integer> ar,ArrayList<Integer> query)
	{
		int[] res=new int[query.size()>>1];
		for(int i=0;i<query.size();i+=2) 
			for(int j=query.get(i);j<=query.get(i+1);j++)
				res[i>>1]=res[i>>1]^ar.get(j);
		return res;
	}
	public static void main(String[] args )throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		ArrayList<Integer> ar=new ArrayList<>();
		while(st.hasMoreTokens())
			ar.add(Integer.parseInt(st.nextToken()));
		st=new StringTokenizer(br.readLine());
		ArrayList<Integer> query=new ArrayList<>();
		while(st.hasMoreTokens())
			query.add(Integer.parseInt(st.nextToken()));
		int[] res=XOR_Func(ar,query);
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);
	}
}
