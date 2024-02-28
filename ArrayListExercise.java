import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        // Creating and initializing an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Iterating over the ArrayList
        System.out.println("Colors in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Adding a new color at the third position
        colors.add(2, "Purple");

        // Removing the second color from the ArrayList
        colors.remove(1);

        // Printing the updated ArrayList
        System.out.println("\nUpdated ArrayList after adding and removing elements:");
        System.out.println(colors);

        // Searching for an element
        String searchColor = "Blue";
        System.out.println("\nSearching for color '" + searchColor + "':");
        searchColor(colors, searchColor);

        // Removing duplicates
        ArrayList<String> colorsWithDuplicates = new ArrayList<>(colors);
        colorsWithDuplicates.add("Red");
        colorsWithDuplicates.add("Green");
        colorsWithDuplicates.add("Yellow");

        System.out.println("\nArrayList with duplicates:");
        System.out.println(colorsWithDuplicates);

        System.out.println("\nArrayList after removing duplicates:");
        System.out.println(removeDuplicates(colorsWithDuplicates));
    }

    // Method to search for a color in the ArrayList
    public static void searchColor(ArrayList<String> colors, String searchTerm) {
        int position = colors.indexOf(searchTerm);
        if (position != -1) {
            System.out.println("Color '" + searchTerm + "' found at position " + position);
        } else {
            System.out.println("Color '" + searchTerm + "' not found in the ArrayList");
        }
    }

    // Method to remove duplicates from an ArrayList
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


