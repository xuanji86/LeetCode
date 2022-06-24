public class mySqrt {
    public int mySqrt(int x) {
        if(x == 1){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int left = 1;
        int right = x / 2;
        while(left<right){
            int mid = left + (right-left)/2  + 1;
            if(x/mid==mid){
                return mid;
            }
            if(mid<x/mid){
                left = mid;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
}