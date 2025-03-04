public class StringReversal {
    public static String reverse(String input, String method) {
        switch (method.toLowerCase()) {
            case "stringbuilder":
                return reverseWithStringBuilder(input);
            case "stringbuffer":
                return reverseWithStringBuffer(input);
            default:
                throw new IllegalArgumentException("Invalid method. Choose 'stringbuilder' or 'stringbuffer'.");
        }
    }

    private static String reverseWithStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    private static String reverseWithStringBuffer(String input) {
        return new StringBuffer(input).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";

        System.out.println("Reversed using StringBuilder: " + reverse(input, "stringbuilder"));
        System.out.println("Reversed using StringBuffer: " + reverse(input, "stringbuffer"));
    }
}
