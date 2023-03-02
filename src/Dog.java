public class Dog extends Animal {
    String name;
    String age;
    static int count = 0;


    public Dog(){    }
    public Dog(String name, String age){
        count ++;

        this.name = name;
        this.age = age;
        String leghtRuning = "500";
        String leghtSwiming = "10";
        runing(name, leghtRuning);
        swiming(name, leghtSwiming);
    }
}
