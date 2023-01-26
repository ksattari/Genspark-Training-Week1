//lazy method of getting  a singleton instance
class Singleton{

    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){

        if(instance == null)
            instance = new Singleton();
        return instance;

    }
}

 class SingletonDemo {

    private SingletonDemo(){

    }
    public static void main(String[] args) {
       // Singleton s = new Singleton(); compilation error
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);    // prints out true
    }
}
