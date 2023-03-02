public class Animal {
    static int countAnimal = 0;
    public Animal(){
        countAnimal++;
    }

    public static void runing(String name, String lenght){
        System.out.println(name + " пробежал "+ lenght + " метров");
    }

    public static void swiming(String name, String lenght){
        System.out.println(name + " проплыл "+ lenght + " метров");
    }
}
