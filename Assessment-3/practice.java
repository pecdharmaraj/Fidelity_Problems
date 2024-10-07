import java.util.LinkedList;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");


        System.out.println("Initial Linked List: " + list);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element to remove (0-3): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < list.size()) {
            String removedElement = list.remove(index);
            System.out.println("Removed Element: " + removedElement);
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and 3.");
        }
        System.out.println("Linked List after removal: " + list);
    }
}
