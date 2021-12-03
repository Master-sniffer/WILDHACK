package Solution.wildhack;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

// Importing Map and HashMap class from
// java.util package
// Importing Scanne class to
// take input from the user

public class Tests {


    static void getWords(String fileName,
                         Map<String, Integer> words)
            throws FileNotFoundException {
        // Creating a Scanner class object
        Scanner file = new Scanner(new File(fileName));

        // Condition check using hasNext() method which
        // holds true till there is word being read from the
        // file.
        // As the end of file content,condition violates
        while (file.hasNext()) {

            // Reading word using next() method
            String word = file.next();

            // Frequency count variable
            Integer count = words.get(word);

            // If the same word is repeating
            if (count != null) {

                // Incrementing corresponding count by unity
                // every time it repeats
                // while reading from the file
                count++;
            } else

                // If word never occurred after occurring
                // once, set count as unity
                count = 1;
            words.put(word, count);
        }

        // Close the file and free up the resources
        file.close();
    }

    // Method 2 - getMaxOccurrence()
    // To get maximum occurred Word
    static int getMaxOccurance(Map<String, Integer> words) {
        // Initially set maximum count as unity
        int max = 1;

        // Iterating over above Map using for-each loop
        for (Entry<String, Integer> word :
                words.entrySet()) {

            // Condition check
            // Update current max value  with the value
            // exceeding unity in Map while traversing
            if (word.getValue() > max) {
                max = word.getValue();
            }
        }

        // Return the maximum value from the Map
        return max;
    }


    public static void tests()
            throws FileNotFoundException {
        // Creating an object of type Map
        // Declaring object of String and Integer types
        Map<String, Integer> words
                = new HashMap<String, Integer>();

        // Retrieving the path as parameter to Method1()
        // above to get the file to be read
        File file = new File("app/src/main/java/Solution/wildhack/test1.txt");
        System.out.println(file);
        System.out.println(new File(".").getAbsoluteFile());
        getWords("/Users/null/Documents/GitHub/WILDHACK/app/src/main/java/Solution/wildhack/test1.txt", words);

        // Variable holding the maximum
        // repeated word count in a file
        int max = getMaxOccurance(words);

        // Traversing using fo-each loop
        // Creating a set out of same elements
        // contained in a HashMap
        for (Entry<String, Integer> word :
                words.entrySet()) {

            // Comparing values using geValue() method
            if (word.getValue() == max) {

                // Print and display word-count pair
                System.out.println(word);
            }
        }
    }
}
