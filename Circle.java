public class Circle extends Shape {
 public Circle(){
 super();
 }
 @Override
 public String draw(){
 return "draw Circle";
 }
  
 public String erase(){
 return "erase Circle";
 }
 
 public static void main (String [] args){
 Circle c = new Circle();
 System.out.println(c.draw());
 System.out.println(c.erase());
 }
}