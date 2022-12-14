import java.util.Arrays;
import java.util.Scanner;

public class BasketBall {
    public static int calPoints(String[] ops){
        int  result = Integer.MIN_VALUE;
        String[] numbers = new String[ops.length];
        for(int index=0;index<ops.length;index++){
            String code= ops[index];
            if((!code.equals("C"))&&(!code.equals("D"))){
                numbers[index] = ops[index];
            }
            if(code.equals("C")){
                numbers[index-1] = null;
            }
            if(code.equals("D")){
                numbers[index] =String.valueOf( 2 * Integer.parseInt(numbers[index-1]));
            }
        }
        for(String u :numbers){
            System.out.println(u);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sInput = new Scanner(System.in);
        String[] ops = sInput.nextLine().split(" ");
        System.out.println(BasketBall.calPoints(ops));
    }


}
