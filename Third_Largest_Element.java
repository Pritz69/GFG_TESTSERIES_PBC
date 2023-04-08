class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    if(n<3)
	    {
	        return -1;
	    }
	    int max=Integer.MIN_VALUE;
	    int smax=Integer.MIN_VALUE;
	    int tmax=Integer.MIN_VALUE;
	    for(int i=0;i<a.length;i++)
	    {
	        if (a[i]>max)
	        {
	            tmax=smax;
	            smax=max;
	            max=a[i];
	        }
	        else if(a[i]<max && a[i]>smax)
	        {
	            tmax=smax;
	            smax=a[i];
	        }
	        else if(a[i]<smax && a[i]>tmax)
	        {
	            tmax=a[i];
	        }
	    }
	    return tmax;
    }
}
