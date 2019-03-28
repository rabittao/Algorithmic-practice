public class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        
        // write your code here
        if(A==null || A.length<3){
            return 0;
        }
        int pre = 1, last = A.length-2;
        while (pre+1<last){
            int mid = pre+(last-pre)/2;
            if(A[mid]>A[mid+1]){
                last = mid;
            }else{
                pre = mid;
            }
        }
        if(A[pre]<A[last]){
            return last;
        }else{
            return pre;
        }
  
    }
}