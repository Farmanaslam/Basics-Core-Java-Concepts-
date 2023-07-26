
import java.util.*;
class Sorting{

    //bubble sort function......
public static  void bubbleSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=n-1-i;j++){
                if(arr[j]>arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;

                }
            }
        }
    }
public static void main(String[] args) {
// Scanner scan=new Scanner(System.in);
// int size=scan.nextInt();
// int arr[]=new int[size];
// for(int i=0;i<size;i++){
// //     arr[i]=scan.nextInt();

// // }
// int printArray(int arr[]){
//     for(int z=0;z<arr,length;z++){
//         System.out.println(arr[z] ++);
//     }
// }
// int arr[]={19,4,8,7,1};
 


// for(int j=0;j<arr.length-1;j++){
//     for(int k=0;k<arr.length-j-1;k++){
//         if(arr [k]>arr[k+1]){
//             //swap
//             int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;

//         }
//     }
// }

// printArray(arr);




//selection sort




//   printArray(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i] +" ");
//     }
// }
// System.out.println();
// int array[]={7,8,9,1,5};
// for(int j=0;j<arr.length-1;j++){
//     int smallest=j;


//     for(int k=j+1;k<arr.length;j++){
//         if(arr[smallest]>arr[k]){
//             samllest=k;
//         }
//     int temp=arr[smallest];
//     arr[smallest]=arr[i];
//     arr[i]=temp;

    
//     }

// printArray(arr);

//Bubble sort
int arr[]={10,12,3,0,58,1};
for(int i=0;i<=5;i++){
    System.out.print(arr[i]+" ");

}
System.out.println();
bubbleSort(arr,5);
for(int i=0;i<=5;i++){
    System.out.print(arr[i]+" ");

}

}
}


