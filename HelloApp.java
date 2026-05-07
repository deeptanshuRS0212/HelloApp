public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder allNames = new StringBuilder();
        int position = 0;

        for (String name : args) {
            allNames.append(name);
            if (position < args.length - 1) {
                allNames.append(", ");
            }
            position++;
        }

        System.out.println("Hello, " + allNames + "!");
    }
}
