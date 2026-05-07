public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String namesWithDelimiter = "";

        for (String name : args) {
            namesWithDelimiter = namesWithDelimiter + name + ", ";
        }

        String allNames = namesWithDelimiter.substring(0, namesWithDelimiter.length() - 2);

        System.out.println("Hello, " + allNames + "!");
    }
}
