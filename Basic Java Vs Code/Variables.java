
import java.util.*;

public class Variables{
public static void main(String[] args) {
   

    //declaration of variables in java ........
int a=10;
int b=25;
int c=a + b;
System.out.println(c);   

//performing arithematic operations on variables.....

int mul=a  * b;
System.out.println(mul);






//conditions in java....using if else......
//scanner to take input from user........
Scanner sc=new Scanner(System.in);

int age=sc.nextInt();

if(age > 18){
    System.out.println("Adult");

} else {
    System.out.println("Not Adult");
}
int number=sc.nextInt();
if( number % 2==0){
    System.out.println("Even");

}else{
    System.out.println("odd");
}


int x=sc.nextInt();
int y=sc.nextInt();
if(x==y){System.out.println("Equal");}
else{
    if(x>y){
        System.out.println("x is greater");
    }else{
        System.out.println("x is smaller");
    }
}


}}