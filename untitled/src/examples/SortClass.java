package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortClass {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int temp;
        for(int i=0;i<10;i++){
            map.put(i,sc.nextInt());
        }
        System.out.println(map.values());
        for(int j=0;j<10;j++){
            for(int k=j+1;k<map.size();k++){
                if(map.get(j)> map.get(k)){
                    temp=map.get(k);
                    map.put(k,map.get(j));
                    map.put(j, temp);
                }
            }
        }

        System.out.println(map.values());
    }
}
