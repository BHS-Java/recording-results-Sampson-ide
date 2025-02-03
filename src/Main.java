import java.util.Scanner;


public class Main implements Spec{

    Scanner USER = new Scanner(System.in);
    public static void main(String[] args) {
        Game start = new Game();
        Main hey = new Main();
        String name = hey.askString("input name");
        int age = hey.askNumber("how old is " + name + "?");
        int height = hey.askNumber("how tall is " + name + "?");

        Player hi = new Player(name,age,height);

        System.out.println(hi.getName() + " " + hi.getAge() + " " + hi.getHeight());
    }
    @Override
    public String   askString(String question){
        System.out.println(question);
        return USER.next();
    }
    @Override
    public int      askNumber(String question){
        System.out.println(question);
        return USER.nextInt();
    }
  
    @Override
    public void     addResults(Person player){
        System.out.println("");
    }
}
