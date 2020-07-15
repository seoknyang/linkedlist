import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        System.out.println("0번 인덱스 값 입력 :");
        int num1 = in.nextInt();
        System.out.println("1번 인덱스 값 입력 :");
        int num2 = in.nextInt();
        System.out.println("2번 인덱스 값 입력 :");
        int num3 = in.nextInt();
        System.out.println("특정인덱스에 값 넣기 (1.인덱스값 입력:)");
        int index = in.nextInt();
        System.out.println("특정인덱스에 값 넣기 (2.값 넣기:)");
        int value = in.nextInt();

        Linkedlist numbers = new Linkedlist();
        numbers.addLast(num1);
        numbers.addLast(num2);
        numbers.addLast(num3);
        numbers.add(index, value);
        System.out.println(numbers);
    }
}