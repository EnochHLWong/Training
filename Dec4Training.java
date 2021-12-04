import java.util.*;
public class Dec4Training{
    public static void main(String[] args){
        System.out.println("Hello World");
        starSquare();
        printNum();
        
    }
    public static void starSquare(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the height of your * square?");
        int height = input.nextInt();
        System.out.println("What is the width of your * square?");
        int width = input.nextInt();
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printNum(){
        int i = 1;
        System.out.print(i);
    }
}