class Solution {
    public int findComplement(int num) {
        
        int bitLength = Integer.toBinaryString(num).length();
        int mask = (1 << bitLength) - 1;
        int complement = num ^ mask;

        return complement;
        
    }
}