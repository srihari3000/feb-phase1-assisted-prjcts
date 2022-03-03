public class rangequeries {
	    static int k = 8;
	    static int N = 10000; 
	    static long table[][] = new long[N][k + 1]; 
	   
	    static void buildSparseTable(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            table[i][0] = arr[i]; 
	        for (int j = 1; j <= k; j++) 
	            for (int i = 0; i <= n - (1 << j); i++) 
	                table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1]; 
	    } 
	    static long query(int L, int R) 
	    {
	        long answer = 0; 
	        for (int j = k; j >= 0; j--)  
	        { 
	            if (L + (1 << j) - 1 <= R)  
	            { 
	                answer = answer + table[L][j];
	                L += 1 << j; 
	            } 
	        } 
	        return answer; 
	    }
	    public static void main(String args[]) 
	    { 
	        int arr[] = { 2,4,6,8,12,14 }; 
	        int n = arr.length; 
	        buildSparseTable(arr, n); 
	        System.out.println(query(0, 8)); 
	        System.out.println(query(3, 4)); 
	        System.out.println(query(2, 3)); 
	    } 
	}