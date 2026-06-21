//Rotate Array

public class RotateArray{
     public static void rotate1(int arr[]){
             int temp=arr[arr.length-1];
             for(int i=arr.length-1;i>=1;i--){
                  arr[i]=arr[i-1];
              }
              arr[0]=temp;
      }
                   

     public static void rotatearray(int arr[], int rotate){
            int m=rotate%arr.length;
            for(int i=1;i<=m;i++){
                  rotate1(arr);
             }
             for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+"   ");
             }
     }
        
     public static void main(String[] args){
            int arr[]={3,7,9,0,1,2,6,82};
            int rotate=10;
            rotatearray(arr,rotate);
     }
 }