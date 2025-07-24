import java.util.*;
public class Frequency_num {
    public static void main(String[] args) {
        int[] arr={10,20,60,30,5,20,10,5,5};

        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
    }
}
