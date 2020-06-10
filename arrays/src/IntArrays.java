public class IntArrays {

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

    }
}
