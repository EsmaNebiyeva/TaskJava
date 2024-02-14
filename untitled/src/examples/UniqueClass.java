package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueClass{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Map<Integer,Integer> map =new HashMap<>();
            for(int i=1; i<=10;i++)
                map.put(i,sc.nextInt());
            System.out.println(map.values());
            for(int j=1;j<=10;j++){
                for(int k=j+1;k<=10;k++){
                    if(map.get(j)==map.get(k)){
                        map.remove(j);
                    }
                }

            }
            System.out.println(map.values());



    }


}
