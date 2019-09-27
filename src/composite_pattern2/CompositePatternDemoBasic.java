package composite_pattern2;

import java.util.Arrays;
import java.util.List;

public class CompositePatternDemoBasic {
    public static void main(String[] args) {
        List<Category> categories = Arrays.asList(
                new Category("Handphone"),
                new Category("Computer"),
                new Category("Fashion")
        );

        categories.forEach(category -> {
            printCategory(category);
        });
    }
    private static void printCategory(Category category) {
        System.out.println(category.getName());
    }
}
