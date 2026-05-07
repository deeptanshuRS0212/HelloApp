public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder allNames = new StringBuilder();

        for (int index = 0; index < args.length; index++) {
            allNames.append(args[index]);

            if (index < args.length - 1) {
                allNames.append(", ");
            }
        }

        System.out.println("Hello, " + allNames + "!");
    }
}
