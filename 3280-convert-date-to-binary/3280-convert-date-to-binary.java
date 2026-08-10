class Solution {
    public String convertDateToBinary(String date) {
        String str[]=date.split("-");
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<str.length;i++){
             StringBuilder res=new StringBuilder();
            int n=Integer.parseInt(str[i]);
                while(n != 0){
               int digit = n % 2;
               res.append(digit);
               n = n / 2;
            }
             sb.append(res.reverse()).append("-");
            
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}