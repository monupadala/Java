public class StringReplacement {
    public static String replaceSubstring(String input, String target, String replacement, String method) {
        switch (method.toLowerCase()) {
            case "string":
                return replaceWithString(input, target, replacement);
            case "stringbuilder":
                return replaceWithStringBuilder(input, target, replacement);
            case "stringbuffer":
                return replaceWithStringBuffer(input, target, replacement);
            default:
                throw new IllegalArgumentException("Invalid method. Choose 'string', 'stringbuilder', or 'stringbuffer'.");
        }
    }

    private static String replaceWithString(String input, String target, String replacement) {
        return input.replace(target, replacement);
    }

    private static String replaceWithStringBuilder(String input, String target, String replacement) {
        StringBuilder sb = new StringBuilder(input);
        int index;
        while ((index = sb.indexOf(target)) != -1) {
            sb.replace(index, index + target.length(), replacement);
        }
        return sb.toString();
    }

    private static String replaceWithStringBuffer(String input, String target, String replacement) {
        StringBuffer sb = new StringBuffer(input);
        int index;
        while ((index = sb.indexOf(target)) != -1) {
            sb.replace(index, index + target.length(), replacement);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World, Hello Java!";
        String target = "Hello";
        String replacement = "Hi";

        System.out.println("Using String: " + replaceSubstring(input, target, replacement, "string"));
        System.out.println("Using StringBuilder: " + replaceSubstring(input, target, replacement, "stringbuilder"));
        System.out.println("Using StringBuffer: " + replaceSubstring(input, target, replacement, "stringbuffer"));
    }
}
