import java.util.*;
class Stringsbuilder{
public static void main(String args[]){

    //using string builder instead of string for more methods.....
StringBuilder sb=new StringBuilder("far");
System.out.println(sb);
sb.insert(3,"man");
System.out.println(sb);
sb.append("aslam");
System.out.println(sb);

StringBuilder sb1=new StringBuilder("farman");
for(int i=0;i<sb1.length()/2;i++){
    int front=i;
    int back=sb1.length()-1-i;
    char frontchar=sb1.charAt(front);
    char backchar=sb1.charAt(back);
 sb1.setCharAt(i,backchar);
 sb1.setCharAt(back,frontchar);


}
System.out.println("Reverse letters are:"+sb1);


}


}