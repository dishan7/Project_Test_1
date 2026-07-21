import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n%2 == 0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + sum);

        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3)
                .toList();
        System.out.println("Filtered names: " + filteredNames);
    }
}