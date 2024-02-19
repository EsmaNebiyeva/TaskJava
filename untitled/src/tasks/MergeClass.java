package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeClass {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();
        List<Integer> list4=new ArrayList<>();
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
        for(int k=0;k<list1.size();k++){
            for(int n=k+1;n<list1.size();n++){
                if(list1.get(k).equals(list1.get(n))){
                    System.out.println("CAUTION::List1 in elementleri unique deyil...............");
                    return;
                }
            }
        }
        for(int k=0;k<list2.size();k++){
            for(int n=k+1;n<list2.size();n++){
                if( list2.get(k).equals(list2.get(n))){
                    System.out.println("CAUTION::List2 nin  elementleri unique deyil...............");
                    return;
                }
            }
        }
        System.out.println("List1 in elementleri......");
        System.out.println(list1);
        System.out.println("List2 in elementleri......");
        System.out.println(list2);
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (list1.get(i).equals(list2.get(j))) {
                        list4.add(list2.remove(j));
                    }
                }
            }

        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("List3 un elementleri......");
        System.out.println(list3);
        System.out.println("List4 un elementleri......");
        System.out.println(list4);

        for(int k=0;k<list3.size();k++){
            for(int n=k+1;n<list3.size();n++){
                if(list3.get(k)>list3.get(n)){
                    int temp=list3.get(k);
                    list3.set(k,list3.get(n));
                    list3.set(n,temp);
                }
            }
        }
        System.out.println("List3 un hazir sort olunmus elementleri......");
        System.out.println(list3);
    }
}