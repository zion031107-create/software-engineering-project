
package main;

import java.util.Scanner;

public class ParkingConsole {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("    회사 주차장 관리 시스템");
            System.out.println("==============================");

            System.out.println("1. 차량 입차");
            System.out.println("2. 차량 출차");
            System.out.println("3. 임직원 등록 및 조회");
            System.out.println("4. 손님 차량 등록");
            System.out.println("5. 주차 공간 현황 조회");
            System.out.println("6. 주차 차량 검색");
            System.out.println("0. 프로그램 종료");

            System.out.println("==============================");
            System.out.print("메뉴 번호 입력: ");

            String menu = scan.nextLine();

            if (menu.equals("1")) {
                System.out.println("차량 입차 메뉴입니다.");
            }
            else if (menu.equals("2")) {
                System.out.println("차량 출차 메뉴입니다.");
            }
            else if (menu.equals("3")) {
                System.out.println("임직원 등록 및 조회 메뉴입니다.");
            }
            else if (menu.equals("4")) {
                System.out.println("손님 차량 등록 메뉴입니다.");
            }
            else if (menu.equals("5")) {
                System.out.println("주차 공간 현황 메뉴입니다.");
            }
            else if (menu.equals("6")) {
                System.out.println("주차 차량 검색 메뉴입니다.");
            }
            else if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못된 메뉴 번호입니다.");
            }
        }

        scan.close();
    }
}
