import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {
    // 由于date有些方法已经过期了，所以加上这个标志
    @Deprecated
    public static void main(String[] args) {
        var d = new Date();
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.toString()); // Sat May 09 20:27:02 CST 2020
        System.out.println(d.toLocaleString());

        Date dNow = new Date( );
        // 时间格式化模版
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
 
        System.out.println("当前时间为: " + ft.format(dNow));
        System.out.printf("%tT\n",dNow);
         // 显示格式化时间 使用 < 标志。它表明先前被格式化的参数要被再次使用
       System.out.printf("%s %tB %<te, %<tY\n", "Due date:", dNow);

       try { 
            System.out.println(new Date() + "\n"); 
            Thread.sleep(1000*3);   // 休眠3秒
            System.out.println(new Date() + "\n"); 
        } catch (Exception e) { 
            System.out.println("Got an exception!"); 
        }
        
    }
}