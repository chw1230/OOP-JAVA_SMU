package task.week4;

import java.util.Scanner;

public class AccountManager_week4Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔액
        int money; // 금액( 출금 혹은 예금 )

        while (true) {
            System.out.println("\n---------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------------");

            System.out.print("선택> ");
            int n = Integer.parseInt(sc.nextLine()); // 선택 사항 입력받기

            if (n == 1) {
                System.out.print("예금액> ");
                money = Integer.parseInt(sc.nextLine());
                balance += money;

            } else if (n == 2) {
                System.out.print("출금액> ");
                money = Integer.parseInt(sc.nextLine());
                if (money > balance) { // 잔고 보다 출금액이 더 큰경우 출금을 막기
                    System.out.println("잔고보다 출금액이 더 커 출금이 불가능합니다.");
                } else {
                    balance -= money;
                }

            } else if (n == 3) {
                System.out.println("잔고> " + balance);

            } else if (n == 4) {
                System.out.println("프로그램 종료");
                break;

            } else {
                System.out.println("잘못된 숫자 입력, 1 ~ 4 사이의 숫자를 입력하세요.");

            }
        }
    }
}