class Solution
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        int s1=0;
        int s2=0;
        int m=ar1.length;
        int n=ar2.length;
        int res=0;
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(ar1[i]<ar2[j])
            {
                s1 +=ar1[i++];
            }
            else if(ar1[i] > ar2[j])
            {
                s2 +=ar2[j++];
            }
            else
            {
                res += Math.max(s1,s2) + ar1[i];
                s1=0;
                s2=0;
                i++;
                j++;
            }
        }
        while(i<m)
        {
            s1 += ar1[i++];
        }
        while(j<n)
        {
            s2 +=ar2[j++];
        }
        res += Math.max(s1,s2);
        return res;
    }
}
