//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int low=1, high=n;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                high=mid-1;
            }
            else{
                
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
