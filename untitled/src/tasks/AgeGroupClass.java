package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgeGroupClass {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        Map<Integer,String> map=new HashMap<>();
        list.add(new Person(1,"Esma"));
        list.add(new Person(1,"Esmer"));
        list.add(new Person(2,"Esra"));
        list.add(new Person(2,"Esmer"));
        list.add(new Person(3,"Esma"));
        list.add(new Person(3,"Esra"));
        System.out.println(list);

    }
}
