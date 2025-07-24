import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();

        int number[]=new int[size];

        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int min=number[0];
        int max=number[0];

        for(int ele :number){
            if(ele<min){
                min=ele;
            }
            if(ele>max){
                max=ele;
            }
        }

        System.out.println("Minimum number :"+ min);
        System.out.println("MAximum number :"+ max);
    }
}
