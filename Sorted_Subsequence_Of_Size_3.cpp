class Solution{
  public:
    vector<int> find3Numbers(vector<int> arr, int N) {
        
        vector<int> ans;
        
        if(N <= 2)
            return ans;
        
        int lmin[N], rmax[N];
        lmin[0] = arr[0];
        rmax[N-1] = arr[N-1];
        
        for(int i=1; i<N; i++)
            lmin[i] = min(arr[i], lmin[i-1]);
            
        for(int i=N-2; i>=0; i--)
            rmax[i] = max(arr[i], rmax[i+1]);
            
        for(int i=1; i<N-1; i++){
            
            int min = lmin[i-1], max = rmax[i+1];
            
            if(min < arr[i] && arr[i] < max)
                return {min, arr[i], max};
        }
        
        return ans;
    }
};
