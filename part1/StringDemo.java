public class StringDemo {
    public static void main(String[] args) {
        // 格式化字符串
        var fs = String.format("a = %s and b = %d","abc",120);
        System.out.println("fs = "+fs);
        System.out.println("abc".concat("sss")); // 字符串连接
        System.out.println("abc".length()); // 字符串长度

        var arr = "a,b,c".split(",",-1); // 字符串切割
        System.out.println(arr[0]);

        var s = "fefesabesss@ssfefe@sss123";
        System.out.println(s.indexOf("ab")); // 字符串第一次出现的位置
        System.out.println(s.replace("@","|"));
        System.out.println(s.substring(0,3)); // 字符串截取
        System.out.println(s.substring(s.length() - 4)); // 截取后4位
        System.out.println("abces".toUpperCase());
        System.out.println("    fefefev ddd \n".trim()); // 去掉左右两边的空格和\n

    }
}