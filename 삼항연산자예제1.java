import java.util.Scanner;

public class 삼항연산자예제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력 :");

        int num = sc.nextInt();
        //짝수 홀수 구하기
        String res = (num%2 == 0 ? "짝수" : "홀수");

        System.out.print(res);



        
    }
}
