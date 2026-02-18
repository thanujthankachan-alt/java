import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {

        String[] names = { "John", "Alice", "David", "Bob" };

        Arrays.sort(names);

        System.out.println("Names in Ascending Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
