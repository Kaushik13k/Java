public class IfElse {
    public static void main(String[] args){
        String userName = "myName";
        int age = 20;
        boolean isHuman = true;
        int battery = 60;
        boolean isEmail = true;
        boolean isPhoneNumber = false;
        boolean isAge = age >= 18? true: false;
        String isAgeMessage = age >= 18? "Is allowd to use the social-media": "Is NOT allowd to use the social-media";


        if (isHuman){
            System.out.println("Verified not a robot!");
            System.out.println("Welcome " + userName);
        }

        // Logical AND operator
        if ((battery >= 30) && isHuman){
            System.out.println("Logged in!");
        }

        // Logical OR operator
        if (isEmail || isPhoneNumber){
            System.out.println("Recovery method is set!");
        }

        // Ternary Operator
        if (isAge){
            System.out.println(isAgeMessage);
        }

    }
}
