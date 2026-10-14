import java.util.*;
public class PiecewiseFunction {
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukkan nilai x = ");
    double x = input.nextDouble();
    
    double result;
    
    if (x <= -5){
        result = 2*x*x + 5; }
    else if (x > -5 && x < 5) {
        result = 3*x - 1 ;}
    else {
        result = x*x -4*x;}
    
    System.out.println("Hasil evaluasi f(" + x +  ") = " + result);
    
    }  
}
