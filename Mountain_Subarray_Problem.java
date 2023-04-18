class Solution {
    public ArrayList<Boolean> processQueries(int[] arr, int n, ArrayList<Pair> queries,
                                      int q) {
        // code here
        ArrayList<Boolean> ans=new ArrayList<>();
        
        for(int i=0;i<q;i++){
            int l=queries.get(i).l;
            int r=queries.get(i).r;
            
            ans.add(solve(arr,l,r));
        }
        
        return ans;
    }
    
    public boolean solve(int []arr, int l,int r){
        
       boolean inc=true;
        for(int i=l+1;i<=r;i++){
            if(arr[i]>=arr[i-1])
            {
                if(!inc)
                {
                    if(arr[i]!=arr[i-1])
                    return false;
                }
            }
            else
            {
                inc=false;
            }
        }
        return true;
    }
}
