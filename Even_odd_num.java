public class Even_odd_num {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        System.out.print("Even number :");
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd number :");
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
