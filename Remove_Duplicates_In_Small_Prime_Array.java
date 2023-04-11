class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        ArrayList<Integer> al= new ArrayList<>(set);
        return al;
    }
}
