import java.util.Scanner;

    
public class Personobj implements Person{
    String name;
    int height;
    int age;
    Personobj(String name,int height,int age){
        this.name = name;
        this.height = height;
        this.age = age;
    };
    public void create_person(){
        Scanner thing = new Scanner(System.in);
        this.name = setName(thing.next());

    }
}

