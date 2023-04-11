class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            
            start +=1;
            end -=1;
        }
    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
}
