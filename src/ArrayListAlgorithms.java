import java.util.ArrayList;

public class ArrayListAlgorithms {

    /** Inserts toInsert after each String in stringList
     *  that contains the letter i
     *
     *  DOES mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0, toInsert.length() > 0
     *
     *  @param stringList  original arraylist of Strings
     *  @param str String to insert
     */
    public static void insertAfterI(ArrayList<String> stringList, String str)
    {
        for(int i = 0; i < stringList.size();i++){
            if(stringList.get(i).contains("i")){
                stringList.add(i+1,str);
                i++;
            }
            }
        }
    /** Removes all Strings from stringList that have a length of 3
     *
     *  DOES mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     */
    public static void removeThree(ArrayList<String> stringList)
    {
        for(int i = 0; i < stringList.size(); i++){
            if(stringList.get(i).length() == 3){
                stringList.remove(i);
                i--;
            }
        }
    }
    /** Returns an ArrayList with all elements of arr reversed
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original array of integers
     */
    public static ArrayList<Integer> reverseArray(int[] intList) {
        {
            ArrayList<Integer> newList = new ArrayList<Integer>();
            for(int i = intList.length-1; i >= 0; i--){
                newList.add(intList[i]);
            }
            return newList;
        }
    }
    /** Appends an uppercase version of each string to the end o wordList;
     *  the uppercase versions appear in the same order as the lowercase versions
     *  for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "my", "best", "friend", "HELLO", "MY", "BEST", "FRIEND"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: wordList.size() > 0,
     *                 all words in wordList are initially lowercase
     *
     *  @param wordList  arraylist of Strings
     */
    public static void duplicateUpperEnd(ArrayList<String> wordList)
    {
        int originalSize = wordList.size();
        for(int i = 0; i< originalSize; i++){
            String upper = wordList.get(i).toUpperCase();
            wordList.add(upper);
        }
    }
    /** Returns an arraylist of Strings that represents the input sentence parsed
     *  into separate words, using a single space (" ") as the delimiter
     *
     *  For example, if sentence = "This is my sentence!"
     *  this method return the arraylist: [This, is, my, sentence!]
     *
     *  PRECONDITION: sentence does not end with a space and each word is
     *                separated by exactly one space
     *
     *  @param sentence  the input String
     *  @return  new arraylist of Strings containing the words of sentence
     */
    /*
    public static ArrayList<String> parseSentence(String sentence)
    {
        ArrayList<String> parsed = new ArrayList<String>();
        int spaceCount = 0;
        for(int i = 0; i<sentence.length();i++){
            if(sentence.contains(" ")){
                spaceCount++;

            }

        }
        for(int i = 0; i<)
    }
     */
    /** Moves all words in wordList that begin with "b" to the front of
     *  wordList; all "b" words that are moved should appear in the same order
     *  in the modified arrayList as they did before being moved
     *
     *  For example, this method will take a wordList:
     *  ["apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"]
     *  and modify it to
     *  ["banana", "bagel", "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: - wordList.size() > 0
     *                 - all strings in wordList have length >= 1
     *
     *  @param wordList  arraylist of words
     */
    public static void moveBWords(ArrayList<String> wordList)
    {
        ArrayList<String> temp = new ArrayList<String>();
        for(int i = 0; i < wordList.size(); i++){
            if(wordList.get(i).substring(0,1).equals("b")){
                temp.add(wordList.get(i));
                wordList.remove(i);
            }
        }
       wordList.addAll(temp);
    }
}