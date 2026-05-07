public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String userName = args[0];
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("Hello!");
            System.out.println("Usage: java HelloApp <name>");
        }
    }
}
