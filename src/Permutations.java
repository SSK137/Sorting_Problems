public class Permutations {
    private void permute(String str, int startindex, int endindex) {
        if (startindex == endindex)
            System.out.println(str);
        else {
            for (int i = startindex; i <= endindex; i++) {
                str = swap(str, startindex, i);
                permute(str, startindex + 1, endindex);
                str = swap(str, startindex, i);
            }
        }
    }
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public void permutationsOprations(){
        String str = "ABC";
        int n = str.length();
        Permutations permutation = new Permutations();
        permutation.permute(str, 0, n-1);
    }

    public static void main(String[] args) {
        Permutations permutations=new Permutations();
        
    }

}