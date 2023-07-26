import java.util.*;
class Practice_Set_On_Loops{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //Printing star pattern using for loop.......
    int n=4;
    for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("/n");
    }
    int sum=0;
for(int i=0;i<n;i++){
    sum=sum+(2*i);

}
// System.out.println(sum);

int num=sc.nextInt();
for(int i=0;i<=10;i++){
System.out.println(num*i);
}
//reverse order table
int nums=sc.nextInt();
for(int i=10;i>0;i--){
    System.out.println(nums*i);
}



}


}