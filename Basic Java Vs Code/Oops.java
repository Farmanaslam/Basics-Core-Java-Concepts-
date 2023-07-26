//Making different classes with their properties......
class Employee{
        int id;
    String name;
    int salary;
    }
    class Square{
        int side;
        public int area(){
            return side*side;
        }public int perimeter(){
            return 4*side;
        }
    }
    class Rectangle{
        int length;
        int breadth;
        public int perimeter(){
            return 2*(length+breadth);
        }public int area(){
            return length*breadth;
        }
    }
    class Circle{
        int rad;

    
    public int area(){
        return 22*rad*rad;
    }public int circumference(){
        return 2*22*rad;
    }}
    
class Oops{
    public static void main(String[] args) {
        //making objects of different classes...........
    Employee farman=new Employee();
    farman.id=1;
    farman.name="farman aslam";
    System.out.print(farman.id + " "+farman.name);


    Square sq=new Square();
    sq.side=4;
    
    System.out.println("area is"+sq.area());
System.out.println("per is"+sq.perimeter());


Rectangle rect=new Rectangle();
rect.length=10;
System.out.println("Length is"+rect.length);
rect.breadth=14;
System.out.println("breadth is"+rect.breadth);
System.out.println("perimeter is:"+rect.perimeter());
System.out.println("area is:"+rect.area());

Circle cir=new Circle();
cir.rad=7;
System.out.println("Radius of circle is:"+cir.rad);
System.out.println("Area of circle is:"+cir.area());
System.out.println("Circumference is:"+cir.circumference());
}

}
    

