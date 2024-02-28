import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Colors in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }

        colors.add(2, "Purple");

        colors.remove(1);

        System.out.println("\nUpdated ArrayList after adding and removing elements:");
        System.out.println(colors);

        String searchColor = "Blue";
        System.out.println("\nSearching for color '" + searchColor + "':");
        searchColor(colors, searchColor);

        ArrayList<String> colorsWithDuplicates = new ArrayList<>(colors);
        colorsWithDuplicates.add("Red");
        colorsWithDuplicates.add("Green");
        colorsWithDuplicates.add("Yellow");

        System.out.println("\nArrayList with duplicates:");
        System.out.println(colorsWithDuplicates);

        System.out.println("\nArrayList after removing duplicates:");
        System.out.println(removeDuplicates(colorsWithDuplicates));
    }

    public static void searchColor(ArrayList<String> colors, String searchTerm) {
        int position = colors.indexOf(searchTerm);
        if (position != -1) {
            System.out.println("Color '" + searchTerm + "' found at position " + position);
        } else {
            System.out.println("Color '" + searchTerm + "' not found in the ArrayList");
        }
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
}


