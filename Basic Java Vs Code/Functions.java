import java.util.*;
class Functions{

    //declaring a function.........
public static int average(int x,int y,int z){
    int average=(x+y+z)/(3);
    return average;

}


public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    //calling a function........
    int avg=average(x,y,z);
    System.out.println(avg);


}

}