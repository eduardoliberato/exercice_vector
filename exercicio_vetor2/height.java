package exercicio_vetor2;

public class height {

    private String name;
    private int age;
    private double height;

    public height(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public String getName(){
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }

    public int getAge(){
        return age;
    }

    public int setAge( int age){
        return this.age = age;
    }

    public double getHeight(){
        return height;
    }

    public double setHeight(double height){
        return this.height = height;
    }
}
