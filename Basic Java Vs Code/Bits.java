import java.util.*;
class Bits{
public static void main(String[] args) {
    int n=5;
    int pos=3;
    int bitMask=1<<pos;
if((bitMask & n)==0){
    System.out.println("Zero");
}else{System.out.print("One");
}
int n1=5;
int pos1=1;
int bitMask1=1<<pos;
if((bitMask1 | n1)==1){
    System.out.println("One");
}else{
    System.out.println("Zero");
}

int i1=5;
int pos2=2;
int bitMask2=1<<pos;
int notBitMask=~(bitMask);
if((notBitMask & i1)==1){
    System.out.println("one");
}else{
    System.out.println("Zero");
}

System.out.println("Farman");
System.out.println("Eshan");

int i3=5;
int pos3=1;
int oper=1;
int bitMask3=1<<pos;
int newNumber=bitMask3 ;
if(newNumber==1){
    System.out.println(newNumber);
}else{
    int newBitMask=~(bitMask);
    int newnumber=newBitMask;
    System.out.println(newnumber);
}





}


}