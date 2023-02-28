import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i = sc.nextInt();

        System.out.println(i);
        
        // 接收字符串
        var s = sc.next();
        System.out.println("s = "+s);
        
    }
}