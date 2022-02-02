

/*
11. Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:

Input: height = [1,1]
Output: 1
*/
class Main{
    public static void main(String[] args) {
        // int[] heights={1,8,6,2,5,4,8,3,7};
        int[] heights={1,1};
        System.out.println(MaxArea(heights));
    }
    public static int MaxArea(int[] heights){
        int left=0,right=heights.length-1,maxArea=0;
        while(left<right){
            maxArea=Math.max(maxArea, Math.min(heights[left], heights[right])*(right-left));
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

}