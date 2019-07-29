package hbcu.stay.ready.algorithms;
import java.util.ArrayList;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){

        ArrayList<String> duplicates = new ArrayList<String>();

        for (int x = 0; x < input.length; x++) {
            for (int y = x + 1; y < input.length; y++) {
                if (input[x] == input[y] && !duplicates.contains(input[x])) {
                    duplicates.add(input[x]);
                }
            }
        }
        return duplicates.size();
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for (int x = 0; x < input.length; x++) {
            for (int y = x + 1; y < input.length; y++) {
                if (input[x] == input[y] && !duplicates.contains(input[x])) {
                    duplicates.add(input[x]);
                }
            }
        }
        return duplicates.size();
    }
}
