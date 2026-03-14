import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int arr[]={1,23,4,56,7};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // } 
        System.out.println(Arrays.toString(arr)); 
        // int marks[][]={{1,2},{3,4}};
        // for(int i=0;i<marks.length;i++){
        //     for(int j=0;j<marks.length;j++){
        //         System.out.print(marks[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); 

    }
}
