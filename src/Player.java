
public class Player implements Person{
    String name = "";
    int Age = 1;
    int height = 1;
    Game GO = new Game();
    Player(String name, int age, int Height){
        this.name = name;
        Age = age;
        height = Height;
    }
    public void     setName(String name){
        this.name = name;
    }
    public String   getName(){
        return name;
    }
    public int      getHeight(){
        return height;
    }
    public int      getAge(){
        return Age;
    }
    
    public Results  getResults(){
    return GO;
    } 
}
