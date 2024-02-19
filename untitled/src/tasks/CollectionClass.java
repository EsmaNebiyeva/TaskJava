package tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();
        Scanner scanner1= new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        System.out.println("Listleri sonlandirmaq ucun soz yazin........");
        System.out.println("List1 ucun ededleri daxil edin.....");
        while(scanner1.hasNextInt()){
            list1.add(scanner1.nextInt());
        }
        System.out.println("List2 ucun ededleri daxil edin.....");
        while(scanner2.hasNextInt()){
            list2.add(scanner2.nextInt());
        }
        System.out.println(list1);
        System.out.println(list2);
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j))){
                    list3.add(list1.get(i));
                }
            }
        }
        System.out.println(list3);
        System.out.println(list3.stream().sorted().toList());
    }
}
