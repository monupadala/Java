public class StringConcatenation {
    public static String concatenate(String[] strings, String method) {
        switch (method.toLowerCase()) {
            case "string":
                return concatenateWithString(strings);
            case "stringbuilder":
                return concatenateWithStringBuilder(strings);
            case "stringbuffer":
                return concatenateWithStringBuffer(strings);
            default:
                throw new IllegalArgumentException("Invalid method. Choose 'string', 'stringbuilder', or 'stringbuffer'.");
        }
    }

    private static String concatenateWithString(String[] strings) {
        String result = "";
        for (String str : strings) {
            result += str; // Inefficient due to immutability
        }
        return result;
    }

    private static String concatenateWithStringBuilder(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    private static String concatenateWithStringBuffer(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!"};

        System.out.println("Using String: " + concatenate(words, "string"));
        System.out.println("Using StringBuilder: " + concatenate(words, "stringbuilder"));
        System.out.println("Using StringBuffer: " + concatenate(words, "stringbuffer"));
    }
}
