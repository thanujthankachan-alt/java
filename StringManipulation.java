public class StringManipulation {
    public static void main(String[] args) {

        String str = "HelloWorld";

        System.out.println("Length: " + str.length());

        System.out.println("Character at second position: " + str.charAt(1));
        System.out.println("Character at fourth position: " + str.charAt(3));

        System.out.println("Substring (start index 5): " + str.substring(5));

        System.out.println("Substring (2 to 7): " + str.substring(2, 7));

        String str2 = "Java";
        String result = str.concat(str2);
        System.out.println("Concatenated String: " + result);

        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Uppercase: " + str.toUpperCase());
    }
}
