// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (sizeOfArray<2)
        {
            al.add(arr[0]);
            al.add(-1);
            return al;
        }
        int m=Integer.MIN_VALUE;
        int sm=Integer.MIN_VALUE;
        for(int i=0;i<sizeOfArray;i++)
        {
            if (arr[i]==m || arr[i]==sm)
            {
                continue;
            }
            if(arr[i]>m)
            {
                sm=m;
                m=arr[i];
            }
            else if(arr[i]>sm)
            {
                sm=arr[i];
            }
        }
        if (sm==Integer.MIN_VALUE)
        {
            al.add(m);
            al.add(-1);
            return al;
        }
        al.add(m);
        al.add(sm);
        return al;
    }
}
