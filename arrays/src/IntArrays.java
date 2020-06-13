public class IntArrays {

    /**
     * 1. git add (or "git add -A .")
     * 2. git commit -m "message in present tense"
     * 3. git push
     *
     *
     * @param args
     */
    public static void main (String[] args){

        int[][] array = new int[][] {
                {1,2,3},
                {4,5,6,23},
                {7,8,9,1,1}
        };

        // print "23"
        System.out.println(array[1][3]);

        // print "length of array"
        int totalArrayLength = 0;
        for (int i = 0; i < array.length; i++){
            totalArrayLength += array[i].length;
        }
        System.out.println("" + totalArrayLength);

        // lesson 0:
        // reverse the iteration.
        // the array should be traversed from end to start.
        // print "totalArrayLengthReversed" at the end.
        // result should be the same as above.
        int totalArrayLengthReversed = 0;
        for (int i = array.length-1; i > -1; i--){
            totalArrayLengthReversed += array[i].length;

        }
        System.out.println("" + totalArrayLengthReversed);

    }
}
