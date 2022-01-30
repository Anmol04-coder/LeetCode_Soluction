//Rotate Array K-times
public class Q11 {
    public static void reverse(int arr[],int l, int h){
        while(l < h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            h--;
            l++;
        }
    }
    public static void rotate(int arr[], int k){
        k = k % arr.length;// if we have let's say 101 to rotate, then we only rotate it 1 time not 101 times
        if(k < 0){
            k+=arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
