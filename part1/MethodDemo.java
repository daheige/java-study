import java.util.Random;
public class MethodDemo {
    public static void main(String[] args) {
        var r = getArea(12,13);
        System.out.println("r = "+r);
        System.out.println(getSum(1,2));
        System.out.println(getSum(1.2,1));
        System.out.println(getSum(1,2,3));
        String[] names = {
            "a","b","c","sss","ddd"
        };
        System.out.println(getName(names));
    }

    // 定义方法，返回类型是int getArea是方法签名
    // x,y表示参数
    public static int getArea(int x,int y){
        return x * 2 +y;
    }

    // 方法的重载,通过参数来决定
    public static int getSum(int a,int b) {
        return a +b;
    }

    public static int getSum(int a,int b,int c) {
        return a + b +c;
    }

    public static double getSum(double a,double b){
        return a +b;
    }

    public static String getName(String[] names) {
        var ran = new Random();
        var rnd = ran.nextInt(names.length);

        if(rnd > names.length -1){
            rnd = names.length - 1;
        }

        return names[rnd];
    }

}