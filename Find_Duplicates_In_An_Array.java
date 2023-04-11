class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int mp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            mp[arr[i]] +=1;
        }
        int f=0;
        ArrayList<Integer>ar=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if (mp[i] >1)
            {
                f=1;
                ar.add(i);
            }
        }
        if (f==0)
        {
            ar.add(-1);
        }
        return ar;
    }
}
