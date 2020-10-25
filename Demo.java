public class Demo {
    public static void main(String[] args) {
        if(args.length == 0) printLoop(5);
        else printLoop(Integer.parseInt(args[0]));
      /* 
        Test cases for new methods
        int [][] a = {{},{2,3},{3,4},{49},{}};
        System.out.println(arrayDeepToString(a));
        System.out.println(arrayDeepToString(create2DArray(5,4,4)));
        System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)));
        */ 
    }
    public static void printLoop(int n) {
        for (int i = n; i > 0; i--) {
            for (int h = 1; h <= i; h++) {
                System.out.print(n-i+1);
            }
            System.out.print("\n");
        }
    }
    public static String arrToString(int[] arr){
        String a = "{";
        if (arr.length == 0) a = "{}";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) a+= String.valueOf(arr[i]) + "}";
            else a+= String.valueOf(arr[i]) + ", ";
        }
        return a;
    }
    public static String arrayDeepToString(int[][] arr){
        String a = "{";
        if (arr.length == 0) return a+="}";
        for (int i = 0; i < arr.length-1; i++) {
            a= a + arrToString(arr[i]) + ", ";
        }
        a = a + arrToString(arr[arr.length-1]) + "}";
        return a;
    }
    public static int[][] create2DArray(int rows, int cols, int maxValue){
            int[][] a = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int h = 0; h < cols; h++) {
                    a [i][h] = (int) Math.round(Math.random()*(maxValue));
                }
            }
            return a;
        } 
        
    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
        int[][] a = new int[rows][];
        for (int i  = 0; i < rows; i++) {
            int newcols = (int) Math.round(Math.random()*(cols));
            a[i] = new int[newcols];
            for (int h = 0; h < newcols; h++) {
                a [i][h] = (int) Math.round(Math.random()*(maxValue));
            }
        }
        return a;
    }
}
