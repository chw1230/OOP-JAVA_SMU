package task.week12;

import java.util.Scanner;

public class BankApplication {

    private static Account[] accountArray = new Account[100]; 
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;

        while (run) {
            System.out.println("======================================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("======================================================");
            System.out.print("선택 > ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            switch (selectNo) {
                case 1 -> createAccount();
                case 2 -> accountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> {
                    System.out.println("프로그램 종료");
                    run = false;
                }
                default -> System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    // 계좌 생성하기
    private static void createAccount() {
        System.out.println("---------------");
        System.out.println("계좌생성");
        System.out.println("---------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("계좌주인: ");
        String owner = scanner.nextLine();

        System.out.print("초기 입금액: ");
        long balance;
        try { // 타입에 따른 에러 처리하기
            balance = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("입력한 금액이 너무 큽니다. 이렇게 큰 금액은 입력할 수 없습니다.");
            return; // 계좌 생성 취소 후 메뉴로 돌아가도록 하기
        }

        Account newAccount = new Account(ano, owner, balance);

        // 배열에 저장하기
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록
    private static void accountList() {
        System.out.println("---------------");
        System.out.println("계좌목록");
        System.out.println("---------------");

        for (Account account : accountArray) {
            if (account != null) {
                System.out.println(
                        account.getAno() + "\t" +
                        account.getOwner() + "\t" +
                        account.getBalance()
                );
            }
        }
    }

    // 예금
    private static void deposit() {
        System.out.println("---------------");
        System.out.println("예금");
        System.out.println("---------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("예금액: ");
        long money;
        try {
            money = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("입력한 금액이 너무 큽니다. 이렇게 큰 금액은 입력할 수 없습니다.");
            return; // 예금 취소
        }

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        account.setBalance(account.getBalance() + money);
        System.out.println("예금이 성공되었습니다.");
    }

    // 출금
    private static void withdraw() {
        System.out.println("---------------");
        System.out.println("출금");
        System.out.println("---------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("출금액: ");
        long money;
        try {
            money = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("입력한 금액이 너무 큽니다. 이렇게 큰 금액은 입력할 수 없습니다.");
            return; // 출금 취소
        }

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        if (account.getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        account.setBalance(account.getBalance() - money);
        System.out.println("출금이 성공되었습니다.");
    }

    // 계좌번호로 계정 찾기
    private static Account findAccount(String ano) {
        for (Account account : accountArray) {
            if (account != null && account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
}