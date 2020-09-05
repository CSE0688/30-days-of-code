class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer(address);
        for (int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='.')
            {
                sb.insert(i,"[");
                sb.insert(i+2,"]");
                i+=2;
            }
        }
        return sb.toString();
    }
}