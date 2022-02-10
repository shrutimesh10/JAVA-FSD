package LIS;

public class LSI {

	public static void main(String[] args) {
		
		int ran[]= {10, 22, 9 ,33, 21 ,50 ,41, 60, 80,90 ,100};
		int ran_len = ran.length;
		System.out.println("The lenght of the longest increasing subsequence is"+ long_subseq(ran, ran_len) );
	    }
	static int long_subseq(int ran[], int ran_len)
	
	{
		int sq_ran[]= new int[ran_len];
		int i, j, max=0;
		for(i=0; i< ran_len; i++)
			sq_ran[i]=1;
		for(i=1; i< ran_len; i++)
			for (j=0; j<i; j++)
				if(ran[i]>ran[j] && sq_ran[j] < sq_ran[j]+1)
					sq_ran[i]= sq_ran[j]+1;
		for (i=0; i< ran_len; i++)
			if (max < sq_ran[i])
				max= sq_ran[i];
		return max;
		
	
	
		// TODO Auto-generated method stub

	}

	}


