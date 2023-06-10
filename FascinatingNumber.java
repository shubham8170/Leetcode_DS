class Solution {
    public boolean isFascinating(int n) {
        int a = 2*n;
        int b = 3*n;
        String str=Integer.toString(n)+Integer.toString(a)+Integer.toString(b);
        HashSet<Character>set=new HashSet<>();
        for(int i = 0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                return false;
            }
            set.add(str.charAt(i));
        }
        if(str.contains("1") && str.contains("2") && str.contains("3") && str.contains("4") && str.contains("5") && str.contains("6") && str.contains("7")
          && str.contains("8")&& str.contains("9") && !str.contains("0")){
            return true;
        }
        return false;
    }
}
