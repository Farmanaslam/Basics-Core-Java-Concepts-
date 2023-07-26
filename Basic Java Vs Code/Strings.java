import java.util.*;
class Strings{
public static void main(String args[]){
 Scanner scan=new Scanner(System.in);
 //To join Strings.....
String name=scan.nextLine();
System.out.println("your name is:"+name);


//To print the length of strings......
String names=scan.nextLine();
System.out.println(names.length());


//using for loop to print all characters of strings......
for(int i=0;i<name.length();i++){
    System.out.println(name.charAt(i));
}


//other string methods.....
String firstname="farman";
String lastname="aslam";
if(firstname.compareTo(lastname)==0) {
    System.out.println("Strings are equal");

}else{System.out.println("STRINGS are not equal");
}
String propose="I love you";
System.out.println(propose);
int size=scan.nextInt();
String array[]=new String[size];
int totLength=0;
for(int i=0;i<size;i++){
    array[i]=scan.next();
    totLength +=array[i].length();

}
System.out.println(totLength);
String str=scan.nextLine();
String result=" ";
for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='e'){
        result+='i';
    }else{
        result+=str.charAt(i);
    }System.out.println(result);
}
System.out.println("enter fullname:");
String fullname=scan.nextLine();
String email=fullname+"@gmail.com";
System.out.println("Your email is"+email);



    
}



}