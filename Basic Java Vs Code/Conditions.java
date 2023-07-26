import java.util.*;
public class Conditions{
public static void main(String[] args){

    //scanner to take input from user.......
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();

//conditions using if else statement.......

if(age>18){
    System.out.println(" You are Adult ");
}else{
    System.out.println("Not Adult");
}

int button=sc.nextInt();


//using switch case ..................
switch(button) {

case 1:System.out.println("Hello");
break;
case 2:System.out.println("Namestey");
break;
case 3:System.out.println("Bonjour");
break;
default:System.out.println("Invalid button");

}


    
}

}