package Task1;

import java.util.Scanner;

public class View {
    Scanner scan = new Scanner(System.in);
    public Double getDouble1(){
        System.out.println("Enter operand 1 n: ");
        Double n = scan.nextDouble();
        return n;
    }
    public Double getDouble2(){
        System.out.println("Enter operand 2 n: ");
        Double n = scan.nextDouble();
        return n;
    }

    public String getOper(){
        System.out.print("Enter an operator (+, -, *, /): ");
        return scan.next();
    }


}
