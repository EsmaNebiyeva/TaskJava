package tasks;

public class Person {
    private int age;
    private String name;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public Person(){

    }
    @Override
    public String toString(){
        return "Person { name= "+name+" , age= "+age+" } ";
    }
}
