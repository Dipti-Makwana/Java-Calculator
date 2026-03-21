import java.util.*;

public class CalculatorLogic{
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter frist number: ");
        float a = sc.nextFloat();

        System.out.println("Enter second number: ");
        float b = sc.nextFloat();

        System.out.println("Choose any option from given: \n 1.Sum \n 2.Multiplication \n 3.Division \n 4.Subtraction \n 5.Modulus");
        int options = sc.nextInt(); 
        
        switch(options){
            case 1: 
            float sum = a+b;
            System.out.println("sum =" + sum);
            break;

            case 2: 
            float mul = a * b;
            System.out.println("multiplication =" + mul);
            break;

            case 3:
                if(b==0){
                        System.out.println("Can't divide by 0");
                    }
                    else{
                float div = a / b;
                System.out.println("Division =" + div);
                    }
                break;

                case 4:
                    float sub = a - b;
                    System.out.println("Subtraction =" + sub);
                
                    break;

                    case 5:
                        if(b==0){ 
                            System.out.println("Can't divide by 0");
                        }
                        else{
                        float mod = a%b ;
                        System.out.println("Modulus =" + mod);
                        }
                        break;

                        default: 
                        System.out.println("Invalid option.");
        }

        sc.close();
    }


}
