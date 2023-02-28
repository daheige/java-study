public class ArrDemo {
    public static void main(String[] args) {
        var arr = new int[3]; // 定义一个整型数组
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        String s = "fefe";
        System.out.println("s = " + s);
        System.out.println(arr.length);
        System.out.println(arr[2]);
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(arr2[1]);

        // 下面的就会报错
        // arr2[4] = 5; xception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // System.out.println(arr2[4]);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("current val: " + arr2[i]);
        }

        // arr2 = null;
        // System.out.println(arr2.length); // 这里就会报错
    }
}
