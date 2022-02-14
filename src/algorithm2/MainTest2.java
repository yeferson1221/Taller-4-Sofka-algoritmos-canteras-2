package algorithm2;

public class MainTest2 {
    private String name;
    private String lastName;

    public MainTest2(String name, String lastName) {
        this.name = name;
        this.lastName= lastName;
    }

    public static void main(String[] args) {
        MainTest2 mainTest2 = new MainTest2( "Yeferson", "Valencia");
        System.out.println(mainTest2.name+" "+mainTest2.lastName);
    }
}
