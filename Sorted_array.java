public class Sorted_array {
    public static void main(String[] args) {
        int[] arr ={10,20,30,60,40,50};
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=true;
                break;
            }
        }

        if(!flag){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
