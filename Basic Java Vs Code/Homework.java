import java.util.*;


class Homework{
public static void main(String[] args){

   //Input two numbers and checking which one is greater..........
  System.out.println("Enter two numbers");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

if(a > b){
    System.out.println("A is greater than b");
}else{//
   System.out.println(b);
}//
System.out.println("Enter Your age");
int age=sc.nextInt();
if(age > 18){
   System.out.println("Eligible to vote");
}else{
   System.out.println("Not eligible to vote");
}

//Input a number and checking positive negative integers and zeroes......
int positive=0,negative=0,zeroes=0;
System.out.println("Press 1 to start and 0 to stop");
int input=sc.nextInt();
while(input==1){
    System.out.println("Enter number");
    int number=sc.nextInt();
    if(number>0){
       positive++;
    }else if(number<0){
       negative++;

    }else{zeroes++;
   }

System.out.println("press 1 to start and 0 to stop");
int inpu=sc.nextInt();//
System.out.println("positive:"+ positive);//
System.out.println("Nrgative:"+negative);//
System.out.println("zeroes:"+zeroes);//






}


}
}

