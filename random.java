import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        //랜덤숫자 입력
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        
        //랜덤숫자 더하기 맞추면 success 틀리면 fail
        while(true) {
            int num1 = rd.nextInt(10)+1;
            int num2 = rd.nextInt(10)+1;
            System.out.print(num1+"+"+num2+"=");
            int intput = sc.nextInt();
            if(intput == num1+num2) {
                System.out.println("success");
            }else {
                System.out.println("fail");
            }

        }


    }
}
