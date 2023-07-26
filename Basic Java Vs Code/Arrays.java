import java.util.*;

class Arrays{
public static void main(String args[]){

    //declaring arrays syntax.....
int[] marks={68,79,25,54,24,25};
marks[0]=80;
marks[1]=50;
marks[2]=47;
marks[3]=85;
marks[4]=95;

//printing array values using for loop..........
for(int i=0;i<5;i++){
    System.out.println(marks[i]);
    
}
Scanner input=new Scanner(System.in);
int size=input.nextInt();

String names[]=new String[size];
for(int i=0;i<size;i++){
    names [i]=input.next();

}
for(int i=0;i<names.length;i++){
    System.out.println("name are:"+(i+1)+"is"+names[i]);
// }
int size1=input.nextInt();
int number[]=new int[size1];

for(int i1=0;i1<size;i1++){
    number[i1]=input.nextInt();

}int min=Integer.MIN_VALUE;
int max=Integer.MAX_VALUE;
for(int i2=0;i2<number.length;i2++){
if(number[i2]<min){
    min=number[i2];
}if(number[i2]>max){
    max=number[i2];
}


//2D arrays
int rows=input.nextInt();
int cols=input.nextInt();
int numbers[][]=new int[rows][cols];
for(int i3=0;i3<rows;i3++){
    for(int j=0;j<cols;j++){
        numbers[i3][j]=input.nextInt();

    }

}
int x=input.nextInt();
for(int i4=0;i4<rows;i4++){
for(int j=0;j<cols;j++){
    if(numbers[i4][j]==x){
        System.out.println("x found at location("+ i4 +","+ j+")");
    }
// }

// }

int rows1=input.nextInt();
int cols1=input.nextInt();

int [][] matrix=new int [rows1][cols1];

for(int i5=0;i5<rows;i5++){
    for(int j2=0;j2<cols;j2++){
        matrix[i5][j2]=input.nextInt();
    }

}System.out.println("Transpose of matrix is:/n");
for(int j4=0;j4<cols;j4++){
    for(int i6=0;i6<rows;i6++){
        System.out.println(matrix[i6][j4]+" ");
    }
    System.out.println();
}


}

}



}}}}