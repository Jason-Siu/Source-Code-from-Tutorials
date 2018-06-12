public class Main {
    
    // create main method
    public static void main(String[] args) {
        
        // initialize string static array with intializer list
        String[] words = { "funk", "chunk", "furry", "baconator" };

        //startsWith
        // iterates through the array using enhanced for loop
        // note that w is just a copy of the value - not the reference itself
        for (String w: words) {
            // if it starts with fu, print string
            if (w.startsWith("fu")) {
                System.out.println(w + " starts with fu");
            }
        }

        //endsWith
        for (String w: words) {
            if (w.endsWith("unk")) {
                System.out.println(w + " ends with unk");
            }
        }

    }

}
