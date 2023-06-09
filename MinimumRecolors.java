class MinimumRecolors {
    public int minimumRecolors(String blocks, int k) {
       int i = 0;
        int j = i+k;
        int ans= Integer.MAX_VALUE;
        while(j<=blocks.length()){
            int count = getTotalWhite(blocks,i,j);
            ans = Math.min(ans,count);
            i++;
            j++;
        }
        return ans;
    }
    
    public static int getTotalWhite(String block,int i,int j){
        int count = 0;
        for(int m=i;m<j;m++){
            if(block.charAt(m)=='W'){
                count++;
            }
        }
        return count;
    }
}

// https://leetcode.com/contest/biweekly-contest-85/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
