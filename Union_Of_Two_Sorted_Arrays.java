class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[], int n, int m)
    {
        // add your code here
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (i == 0 || a[i] != a[i-1]) {
                    result.add(a[i]);
                }
                i++;
            } else if (b[j] < a[i]) {
                if (j == 0 || b[j] != b[j-1]) {
                    result.add(b[j]);
                }
                j++;
            } else {
                if (i == 0 || a[i] != a[i-1]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        while (i < n) {
            if (i == 0 || a[i] != a[i-1]) {
                result.add(a[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (j == 0 || b[j] != b[j-1]) {
                result.add(b[j]);
            }
            j++;
        }
        
        return result;
    }
}
