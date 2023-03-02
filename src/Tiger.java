public class Tiger extends Animal {
    String name;
    String age;
    static int count = 0;

    public Tiger(){    }
    public Tiger(String name, String age){
        count ++;

        this.name = name;
        this.age = age;
        String leghtRuning = "1000";
        String leghtSwiming = "3";
        runing(name, leghtRuning);
        swiming(name, leghtSwiming);
    }
}
