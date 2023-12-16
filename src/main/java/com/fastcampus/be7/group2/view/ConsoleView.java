package com.fastcampus.be7.group2.view;

import java.util.Scanner;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */
public class ConsoleView {

    Scanner scanner = new Scanner(System.in);

    public String getCountry() {
        System.out.print("지역을 입력해주세요(시 또는 구 또는 동 : ");
        return scanner.nextLine();
    }

}
