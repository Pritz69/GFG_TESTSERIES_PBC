

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        for (int x : arr) 
        {
            if (d.containsKey(x)) 
            {
                d.put(x, d.get(x) + 1);
            }
            else
            {
                d.put(x, 1);
            }
        }
        for (int i = 1; i <= N; i++) 
        {
            if (d.containsKey(i))
            {
                arr[i - 1] = d.get(i);
            } 
            else
            {
                arr[i - 1] = 0;
            }
        }
    }
}
