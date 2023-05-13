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

    }
}
