//converts a binary string to decimal representation
public class BinaryToDecimal {

    public static long convertToDecimal(String binary){

        long decimal = 0;
        int power = binary.length()-1; // start at leftmost bit with the highest power of 2
        for(int x=0; x<binary.length(); x++){
            decimal = (long) ((binary.charAt(x) == '1') ? decimal + Math.pow(2,power) : decimal);
            power--;
        }
        return decimal;
    }

    public static void main(String[] args) {

        System.out.println(convertToDecimal("101"));
        System.out.println(convertToDecimal("0"));
        System.out.println(convertToDecimal("1001"));
        System.out.println(convertToDecimal("100000"));
        System.out.println(convertToDecimal("11111111"));

    }
}
