public class Solution {
    public int NumberofElementsInIntersection(int[] a, int[] b, int n, int m) {
        // initialize an empty hash set to store the elements of a
        HashSet<Integer> set = new HashSet<>();
        
        // add each element in a to the set
        for (int num : a) {
            set.add(num);
        }
        
        // initialize an empty list to store the intersection
        ArrayList<Integer> list = new ArrayList<>();
        
        // loop through each element in b
        for (int num : b) {
            // if the element is in the set, add it to the list and remove it from the set
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        
        // return the size of the list, which represents the number of elements in the intersection
        return list.size();
    }
}
