package Day9;

public class All4Tasks {

    public static void main(String[] args){

        //Task 1
        int a = 4, b = 4, c = 5;

        if(a == b || a == c || b == c){
            System.out.println("Two of the numbers are equal");
        }

        else{
            System.out.println("None of the numbers are equal");
        }

        //Task2

        int input = 16;

        if(input % 3 == 0 || input % 5 ==0){
            System.out.println("Multiple of 3 or 5");
        }
        else{
            System.out.println("Not a multiple of 3 or 5");
        }

        //Task 3

        int numA = 4;
        int numB = 9;

        if((numA + numB) % 2 == 0)
            System.out.println("Even");
        else{
            System.out.println("Odd");
        }

        //Task4

        int number = 35;

        if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0){
            System.out.println("Not prime.");
        }
        else{
            System.out.println("Prime.");
        }
    }

}
