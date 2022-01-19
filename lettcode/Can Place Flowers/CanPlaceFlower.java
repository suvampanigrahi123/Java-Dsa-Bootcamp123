/*
Question link:https://leetcode.com/problems/can-place-flowers/

*/
class CanPlaceFlower{
    public static void main(String[] args) {
        int flowered[]={1,0,0,0,1};
        int n=1;
        System.err.println(CanPlace(flowered, n));
    }
    public static boolean CanPlace(int[] flowered,int n){
        if(n==0) return true;
        int n2=flowered.length;
        int count=0;
        for(int i=0;i<n2;i++){
            if(flowered[i]==0 && (i==0 ||flowered[i-1]==0) && (i==n2-1 || flowered[i+1]==0)){
                count++;
                if(count==n){
                    break;
                }
            }
        }
        return count==n;
    }
}