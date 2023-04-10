class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int mini=Integer.MAX_VALUE;
        int xp=-1;
        int yp=-1;
        for(int i=0;i<n;i++)
        {
            if (a[i]==x)
            {
                xp=i;
            }
            if (a[i]==y)
            {
                yp=i;
            }
            if(xp!=-1 && yp!=-1)
            {
                mini=Math.min(mini,Math.abs(xp-yp));
            }
        }
        if (xp==-1 || yp==-1)
        {
            return -1;
        }
        return mini;
    }
}
