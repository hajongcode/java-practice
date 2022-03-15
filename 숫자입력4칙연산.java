import java.util.Scanner;

public class 숫자입력4칙연산 {
    public static void main(String[] args) {
        //스캐너 기능
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");    
        int num2 = sc.nextInt();
        //입력문으로 사칙연산
        System.out.println("두수의 더하기 : "+ (num1+num2));
        System.out.println("두수의 빼기 : "+ (num1-num2));
        System.out.println("두수의 곱하기 : "+ (num1*num2));
        System.out.println("두수의 나누기 : "+ (num1/num2));
        
    }
}
