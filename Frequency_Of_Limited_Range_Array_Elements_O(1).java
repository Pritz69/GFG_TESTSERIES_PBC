class Solution
{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int i=0;
        while (i<N)
        {
            if(arr[i]>N)
            {
               arr[i]=0;
            }
            if (arr[i] <=0)
            {
                i ++;
                continue;
            }
            int c = arr[i]-1;
            if (arr[c]<=0)
            {
                arr[c] --;
                arr[i] =0;
                i ++;
            }
            else
            {
                arr[i]=arr[c];
                arr[c]=-1;
            }
        }
        for (int j=0;j<N;j++)
        {
            if (arr[j] <0)
            {
                arr[j] = arr[j]*(-1);
            }
        }
    }
}
