public class UseOfThisKeyword {

    private int cnt;

    public UseOfThisKeyword(){
        this(1);
    }

    public UseOfThisKeyword(int cnt){
        this.cnt = cnt;
        System.out.println("----Inside parametrized constructor----");
    }

    public static void main(String[] args) {
        new UseOfThisKeyword();
    }
}
