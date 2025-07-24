import java.util.*;
public class Search_num {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int search=30;

        boolean flag=false;
        for(int element:arr){
            if(element==search){
                flag=true;
                break;
            }
        }

        System.out.println(flag? "Search success": "Search not success");
    }
}
