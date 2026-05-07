public class HelloApp {
    public static void main(String[] args) {
        String userName = "World";

        if (args.length > 0) {
            userName = args[0];
        }

        System.out.println("Hello, " + userName + "!");
    }
}
