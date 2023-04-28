class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int z=0;
	    int o=0;
	    for(int i=0;i<n;i++)
	    {
	        if (arr[i]==0)
	        {
	            ++z;
	        }
	        else 
	        {
	            ++o;
	        }
	    }
	    int index=0;
	    for (int i=0;i<z;i++)
	    {
	        arr[i]=0;
	        index++;
	    }
	    for (int i=index;i<n;i++)
	    {
	        arr[i]=1;
	    }
	    return arr;
	} 
} 
