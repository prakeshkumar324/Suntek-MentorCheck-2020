package BitManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Program3 {
	static int Max_XOR(ArrayList<Integer> ar)
	{
		int max=0;
		for(int i=0;i<ar.size()-1;i++)
		{
			for(int j=i+1;j<ar.size();j++)
			{
				int k=ar.get(i)^ar.get(j);
				if(k>max)
					max=k;					
			}
		}
		return max;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		ArrayList<Integer> ar=new ArrayList<>();
		while(st.hasMoreTokens())
			ar.add(Integer.parseInt(st.nextToken()));
		System.out.println(Max_XOR(ar));	
	}
}
