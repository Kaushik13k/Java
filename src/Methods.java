public class Methods {
    public static void main(String[] args){
        // Code 1: Check if the number is postitive or negative and throw exception if ZERO is passsed
        boolean isPositive = positiveNegative(0);
    }
    public static boolean positiveNegative(int number){
        if (number == 0) {
            throw new IllegalArgumentException("Number cannot be zero.");
        }
        if (number > 0) {
            return true;
        }else {
            return false;
        }
    }
}
