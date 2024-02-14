package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int sum=0;
        int number=0;
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=1; i<=10;i++)
            map.put(i,sc.nextInt());
        System.out.println(map.values());
        for(int j=1;j<=10;j++){
            count =1;
            for(int k=j+1;k<=10;k++){
                if(map.get(j)==map.get(k)){
                    count++;
                }
            }
            if(sum<count){
                sum=count;
                number=map.get(j);
            }

        }

        System.out.println(map.values());
        System.out.println(sum);
        System.out.println(number);
    }

}
