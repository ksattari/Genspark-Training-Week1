public class AddTwoBinaryNumbers {

    public static void main(String[] args) {
        String b1 = "10010111";
        String b2 = "00000010";
        boolean d1 = false;   // used for bitwise operations on binary digits when adding
        boolean d2 = false;
        boolean cF = false; // overflow flag
        String b1rv = new StringBuffer(b1).reverse().toString();
        String b2rv = new StringBuffer(b2).reverse().toString();
        char[] arr = new char[b1.length()];

        //add them together
        for(int i = 0; i < b1rv.length(); i++){
            d1 = b1rv.charAt(i) == '1';
            d2 = b2rv.charAt(i) == '1';
            boolean d3 = (d1 ^ d2) ^ cF;
            cF = (d1 && d2) || ((d1 || d2) && cF) ;
            arr[i] = d3 ? '1' : '0';
        }
        String result = new StringBuffer((new String(arr)))
                            .reverse().toString();
        System.out.println(result);
    }
}
