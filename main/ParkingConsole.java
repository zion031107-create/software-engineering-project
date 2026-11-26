
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
                inputVehicle(scan);
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
    
private static void inputVehicle(Scanner scan) {

    System.out.println();
    System.out.println("===== 차량 입차 =====");
    System.out.println("1. 내연기관 자동차");
    System.out.println("2. 전기 자동차");

    System.out.print("차량 종류 선택: ");
    String type = scan.nextLine();

    String carType;

    if (type.equals("1")) {
        carType = "내연기관 자동차";
    }
    else if (type.equals("2")) {
        carType = "전기 자동차";
    }
    else {
        System.out.println("잘못된 차량 종류입니다.");
        return;
    }

    System.out.print("차량번호: ");
    String carNumber = scan.nextLine();

    try {
        System.out.print("차량 무게(kg): ");
        double weight = Double.parseDouble(scan.nextLine());

        System.out.print("차량 높이(m): ");
        double height = Double.parseDouble(scan.nextLine());

        if (carNumber.trim().isEmpty() || weight <= 0 || height <= 0) {
            System.out.println("올바른 차량 정보를 입력해주세요.");
            return;
        }

        System.out.println();
        System.out.println("===== 입력 정보 확인 =====");
        System.out.println("차량번호: " + carNumber);
        System.out.println("차량 종류: " + carType);
        System.out.println("무게: " + weight + "kg");
        System.out.println("높이: " + height + "m");
        System.out.println("차량 정보 입력 완료");
        System.out.println("(실제 입차 처리는 아직)");

    } catch (NumberFormatException e) {
        System.out.println("무게와 높이는 숫자로 입력해주세요.");
    }
}

}

