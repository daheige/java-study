public class Hello {

    public static void main(String[] args) {
        System.out.println("daheige");
        String a = "123ss";
        System.out.println("a = " + a);

        // java11
        var s = "abc";
        System.out.println(s);

        var f = 12.45;
        System.out.println("f = " + f);

        var i = 12;
        System.out.println("i = " + i);

        i = 123;
        System.out.println(i);

        var b = true;

        System.out.println(b);

        double c = 12.09;
        System.out.println("c = " + c);

        // 对于float单进度的浮点型，需要后面加个f
        float d = 12.345f;
        System.out.println("d = " + d);

        // 类型转化
        double d2 = 10.0;
        System.out.println(d2);

        // 强制类型转化的话，会丢失精度
        var k = (int) 89.09;
        System.out.println("k = " + k);

        // 运算符
        var p = 1;
        var q = 2;
        var m = p + q;
        System.out.println("m = " + m);
        System.out.println(1 * 2 + 1);
    }

}