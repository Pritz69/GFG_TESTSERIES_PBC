
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long ls=arr[0];
        long s=0;
        for(int i=0;i<n;i++)
        {
            s +=arr[i];
        }
        if (n==1)
        {
            return 1;
        }
        for(int i=1;i<n-1;i++)
        {
            ls += arr[i];
            if (ls==(s-ls-arr[i+1]))
            {
                return i+2;
            }
        }
        return -1;
    }
}
