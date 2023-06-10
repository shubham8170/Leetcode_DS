class Solution {
    public int sumDistance(int[] nums, String s, int d) {
     while(d-->0){
         for(int i =0;i<nums.length;i++){
             if(s.charAt(i)=='L'){
                 nums[i]=nums[i]-1;
             }
             else{
                 nums[i]=nums[i]+1;
             }   
             
         }
            
         s=checkCollision(s,nums);
     }
        int ans = calculatePairDistanceSum(nums);

        return ans;
    }
      public static int calculatePairDistanceSum(int[] array) {
        int mod = 1000000007; // Modulo value
        long sum = 0; // Use long to handle large sums

        // Sort the array in ascending order
        Arrays.sort(array);

        // Calculate the sum of the pairs of distances
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sum = (sum + Math.abs(array[i] - array[j])) % mod;
            }
        }

        return (int) sum; // Cast back to int before returning
    }
    
    public static String checkCollision(String str, int[] arr){
        int i=0;
        int j =1;
        String s = str;
        while(i<j && j<arr.length){
          
            if(arr[i]==arr[j]){
                if(s.charAt(i)=='R'){
                    s = s.substring(0, i) + 'L'
              + s.substring(i + 1);
                    
                }
                
                else if(s.charAt(i)=='L'){
                       s = s.substring(0, i) + 'R'
              + s.substring(i + 1);
                }
                if(s.charAt(j)=='R'){
                       s = s.substring(0, j) + 'L'
              + s.substring(j + 1);
                }
               
                 else if(s.charAt(j)=='L'){
                         s = s.substring(0, j) + 'R'
              + s.substring(j + 1);
                }
            }
            i++;
            j++;
        }
        return s;
    }
}
