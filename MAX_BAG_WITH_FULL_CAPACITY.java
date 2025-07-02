// Input: capacity = [2,3,4,5], rocks = [1,2,4,4], additionalRocks = 2
// Output: 3
// Explanation:
// Place 1 rock in bag 0 and 1 rock in bag 1.
// The number of rocks in each bag are now [2,3,4,4].
// Bags 0, 1, and 2 have full capacity.
// There are 3 bags at full capacity, so we return 3.
// It can be shown that it is not possible to have more than 3 bags at full capacity.
// Note that there may be other ways of placing the rocks that result in an answer of 3.


class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks)
    {
        int[] arr = new int[rocks.length];    
        for(int i=0; i<rocks.length; i++){
            arr[i] = capacity[i] - rocks[i];     
        }        
        Arrays.sort(arr); // O(n log n )
        int count  = 0;
        for(int i=0; i<arr.length; i++){   //O(n)
            if(additionalRocks >= arr[i]){
                if(arr[i] == 0) count++;
                else{
                    additionalRocks -= arr[i];
                    count++;
                }
            } else{
                break;
            }
        }
        return count;
    }
}
// sc - > O(n);
// Tc  - >  o(n + n log n)
