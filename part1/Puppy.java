public class Puppy {
    int puppyAge;
    public  Puppy(String name) {
            System.out.println(
                "dog name:"+name
            );
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("dog age:"+puppyAge);
        return puppyAge;
    }

    // 主入口函数
   public static void main(String[] args) {
       Puppy myp = new Puppy("xiaohei");
       myp.setAge(2);
       myp.getAge();
       System.out.println("age: "+myp.puppyAge);
   }

}