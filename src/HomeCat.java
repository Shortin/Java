public class HomeCat extends Animal {
    String name;
    String age;
    public static int count = 0;

    public HomeCat(){
    }
    public HomeCat(String name, String age){
        count ++;

        this.name = name;
        this.age = age;
        String leghtRuning = "200";
        String leghtSwiming = "0";
        runing(name, leghtRuning);
        swiming(name, leghtSwiming);
    }
}
