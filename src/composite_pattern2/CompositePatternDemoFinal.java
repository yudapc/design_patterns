package composite_pattern2;

import java.util.Arrays;
import java.util.List;

public class CompositePatternDemoFinal {
    public static void main(String[] args) {
        List<Category> categories = Arrays.asList(
                new CompositeCategory("Handphone", Arrays.asList(
                        new Category("-- Android"),
                        new Category("-- iOS")
                )),
                new CompositeCategory("Computer", Arrays.asList(
                        new Category("-- Laptop"),
                        new CompositeCategory("-- Macbook", Arrays.asList(
                                new Category("---- Macbook"),
                                new Category("---- Macbook Air"),
                                new Category("---- Macbook Pro 13"),
                                new Category("---- Macbook Pro 15")
                        )),
                        new Category("-- PC")
                )),
                new CompositeCategory("Fashion", Arrays.asList(
                        new CompositeCategory("-- Pria", Arrays.asList(
                                new Category("---- Baju Pria"),
                                new Category("---- Celana Pria")
                        )),
                        new CompositeCategory("-- Wanita", Arrays.asList(
                                new CompositeCategory("---- Baju Wanita", Arrays.asList(
                                        new Category("---- Kemeja Wanita")
                                )),
                                new CompositeCategory("---- Celana Wanita", Arrays.asList(
                                        new Category("------ Panjang Wanita"),
                                        new Category("------ Pendek Wanita")
                                ))
                        ))
                ))
        );

        categories.forEach(category -> {
            printCategory(category);
        });
    }
    private static void printCategory(Category category) {
        System.out.println(category.getName());

        if (category instanceof CompositeCategory) {
            CompositeCategory compositeCategory = (CompositeCategory) category;
            compositeCategory.getCategories().forEach(value -> {
                printCategory(value);
            });
        }
    }
}
