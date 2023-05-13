public class IfElse {
    public static void main(String[] args){
        String name = "myName";
        boolean isHuman = true;
        int battery = 60;
        boolean isEmail = true;
        boolean isPhoneNumber = false;

        if (isHuman){
            System.out.println("Verified not a robot!");
            System.out.println("Welcome " + name);
        }

        // Logical AND operator
        if ((battery >= 30) && isHuman){
            System.out.println("Logged in!");
        }

        // Logical OR operator
        if (isEmail || isPhoneNumber){
            System.out.println("Recovery method is set!");
        }
    }
}
