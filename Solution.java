class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase();
        String[] temp = s.split("-");
        String out = "";

        for(int i=0; i<temp.length; i++){
            out += temp[i];
        }
        StringBuilder sb = new StringBuilder(out);
        int i=sb.length()-1; 
        while(i-k>=0){
            i -= k;
            sb.insert(i+1,"-");
            
        }
        return sb.toString();
    }
}
