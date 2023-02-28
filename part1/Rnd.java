import java.util.Random;
public class Rnd {
    public static void main(String[] args) {
        var ran = new Random();
        var n = ran.nextInt(50);
        System.out.println("n = "+n);

        var f = ran.nextFloat();
        System.out.println(f);

        if (f > 0.5){
            System.out.println("f > 0.1");
        } else {
            System.out.println("f <= 0.1");
        }

        // 三元运算符
        var x = f > 0.5 ? f : 0.55;
        System.out.println("x = "+x);

        var i = 1;
        while(i <= 10){
            if(i % 2 == 0){
                System.out.println("i % 2 = 0");
                i++; // 这里很容器漏掉++
                continue;
            }
            
            System.out.println("i = "+i);
            i++;
        }

        System.out.println("====for===");
        for(int j = 0;j<10;j++){
            System.out.println("j = "+j);
        }

        var y = "abc";
        switch (y){
            case "a":
            System.out.println("a");
            break;
            case "abc":
            System.out.println("abc");
            break;
            default:
            System.out.println("not match");
            break;
        }
        
    }
}