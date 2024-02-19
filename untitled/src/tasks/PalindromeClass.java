package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Listi sonlandirmaq ucun soz yazin........");
        System.out.println("List1 ucun ededleri daxil edin.....");
        while(scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }
        for(int i=0; i<list.size();i++){
            if(!list.get(i).equals(list.get(list.size()-1 - i))) {
                System.out.println("List palindrome deyil.");
                return;
            }
        }
        System.out.println("List Polindromedur.");
    }
}
