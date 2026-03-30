import java.util.LinkedList;
import java.util.Scanner;

class LinkedListClearExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // FIXED LINE
        System.out.println("Original LinkedList: " + list);

        list.clear();

        System.out.println("LinkedList after removing all elements: " + list);

        sc.close();
    }
}