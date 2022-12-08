import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        //Calculator
        while(true){
            welcomeScreen();
            System.out.print("Enter your choice: ");
            Scanner userInput = new Scanner(System.in);
            char choice = userInput.next().charAt(0);

            switch(choice){
                case 'a':
                    System.out.print("Enter your first number: ");
                    float num1 = userInput.nextFloat();
                    System.out.print("Enter your second number: ");
                    float num2 = userInput.nextFloat();

                    System.out.print(Addition(num1, num2));
                break;

                case 'b':
                    System.out.print("Enter your first number: ");
                    float num3 = userInput.nextFloat();
                    System.out.print("Enter your second number: ");
                    float num4 = userInput.nextFloat();
            
                    System.out.print(Substraction(num3, num4));
                break;

                case 'c':
                    System.out.print("Enter your first number: ");
                    float num5 = userInput.nextFloat();
                    System.out.print("Enter your second number: ");
                    float num6 = userInput.nextFloat();

                    System.out.print(Multiplication(num5, num6));
                break;

                case 'd':
                    System.out.print("Enter your first number: ");
                    float num7 = userInput.nextFloat();
                    System.out.print("Enter your second number: ");
                    float num8 = userInput.nextFloat();

                    System.out.print(Division(num7, num8));
                break;

                case 'e':
                    System.out.print("Enter your original price: ");
                    float num9 = userInput.nextFloat();
                    System.out.print("Enter your discount: ");
                    float num10 = userInput.nextFloat();

                    System.out.print("The Discounted Price: " + calcDiscount(num9, num10));
                break;                    
            }

        }
        
    }

    public static void welcomeScreen(){
        System.out.println("\nPress 'a' to add\nPress 'b' to substract\nPress 'c' to multiply\nPress 'd' to divide" + 
        "\nEnter 'e' to calculate discount" );
        
    }

    //Calculation operation methods(Basic operations)
    public static float Addition(float x, float y){
        return x + y;
    }
    public static float Substraction(float x, float y){
        return x - y;
    }
    public static float Multiplication(float x, float y){
        return x * y;
    }
    public static float Division(float x, float y){
        return x / y;
    }

    //Method to calculate discount
    public static double calcDiscount(double originalPrice, double discount){
        double price = (discount * originalPrice)/100;
        double finalPrince = originalPrice - price;

        return finalPrince;
    }
    
}