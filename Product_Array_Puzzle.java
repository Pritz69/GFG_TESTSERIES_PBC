class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        if (n == 1) 
        {
            return new long[]{1};
        }
        int i;
        long temp=1;
        long prod[] = new long[n];

        for (int j = 0; j < n; j++)
            prod[j] = 1;

 
        for (i = 0; i < n; i++) 
        {
            prod[i] = temp;
            temp *= arr[i];
        }


        temp = 1;

        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }
        return prod;
	} 
} 
