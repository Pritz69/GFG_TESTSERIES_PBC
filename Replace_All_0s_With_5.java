
class GfG {
    int convertfive(int num) {
        // Your code here
        if(num==0)
        {
            return 5;
        }
        int t=0;
        while(num>0)
        {
            int d=num%10;
            if (d==0)
            {
                d=5;
            }
            t=t*10 +d;
            num=num/10;
        }
        int ans=0;
        while(t>0)
        {
            int di=t%10;
            ans=ans*10 +di;
            t=t/10;
        }
        return ans;
    }
}
