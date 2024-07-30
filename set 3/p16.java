import java.util.*;
public class p16 {
 private double real;
 private double imaginary;
 public p16 () {
 }
 public p16 (double real, double imaginary) {
 this.real = real;
 this.imaginary = imaginary;
 }
 public static p16 getInput() {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter real part: ");
 double real = scanner.nextDouble();
 System.out.print("Enter imaginary part: ");
 double imaginary = scanner.nextDouble();
 return new p16 (real, imaginary);
 }
 public p16 add(p16 other) {
 return new p16(real + other.real, imaginary + other.imaginary);
 }
 public p16 subtract(p16 other) {
 return new p16(real - other.real, imaginary - other.imaginary);
 }
 public p16 multiply(p16 other) {
 double newReal = (real * other.real) - (imaginary * other.imaginary);
 double newImaginary = (real * other.imaginary) + (imaginary * other.real);
 return new p16(newReal, newImaginary);
 }


 public String toString() {
 return String.format("%.2f + %.2fi", real, imaginary);
 }
 public static void main(String[] args) {
 System.out.println("Enter first complex number:");
 p16 number1 = getInput();
 System.out.println("Enter second complex number:");
 p16 number2 = getInput();
 p16 sum = number1.add(number2);
 p16 difference = number1.subtract(number2);
 p16 product = number1.multiply(number2);
 System.out.println("Sum: " + sum);
 System.out.println("Difference: " + difference);
 System.out.println("Product: " + product);

 }
 }