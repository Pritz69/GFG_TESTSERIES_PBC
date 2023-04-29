class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
        // code here
        int n=array.length;
        Arrays.sort(array);
        int minsum=Integer.MAX_VALUE;
        for (int i=0;i<n;i++)
        {
            int first=array[i];
            int st=i+1;
            int end=n-1;
            while (st<end)
            {
                int s=first+array[st]+array[end];
                if (s==target)
                {
                    return target;
                }
                if (Math.abs(target-s)<Math.abs(target-minsum))
                {
                    minsum=s;
                }
                if (Math.abs(target-s)==Math.abs(target-minsum))
                {
                    minsum=Math.max(s,minsum);
                }
                if (s>target)
                {
                    end --;
                }
                else
                {
                    st ++;
                }
            }
        }
        return minsum;
	} 
}
