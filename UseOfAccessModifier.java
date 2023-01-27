 class AccessModifier {

     private int privateField = 10;
     public int publicField = 5;
     protected int protectedField = 15;
 }
 public class UseOfAccessModifier {

    public static void main(String[] args) {
        AccessModifier access = new AccessModifier();
        // System.out.println(access.privateField); gives error
        System.out.println(access.publicField);  //works
        System.out.println(access.protectedField); //works for package and subclasses
    }
}
