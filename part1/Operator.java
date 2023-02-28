public class Operator {
    public static void main(String[] args) {
        var i = 10;
        var c = 'A'; // 65
        System.out.println("i+c = "+(i+c));

        // char ch = i+c; 
        // 不兼容的类型，如果包含多个类型，类型是会自动提升的
        // byte,short,char都会提升为int类型
        // 整个表达式的类型提升等级顺序
        // byte,short,char-->int-->long-->float-->double
        // 字符的+操作，会拿计算机底层的数据结构进行操作
        int n = i+c;
        System.out.println(n);
        var a = 12;
        System.out.println(a);

        double d = 10 +2.34;
        System.out.println(d);

        // 字符串的+操作
        // 字符串进行了拼接操作
        System.out.println("abc"+666);
        System.out.println("abc "+6+66); // abc 666

        //如果非string开头就先进行运算
        System.out.println(1+99+"haha"); // 100haha

        // 逻辑运算符
        System.out.println(1 | 2); // 3
        // 与或
        System.out.println(1 > 2 && 3 < 4); // false
        System.out.println( 1 > 2 || 3 < 4); // true
        System.out.println(!(1 > 2));// true
    }
}