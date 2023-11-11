package com.KoreaIT.java.AM;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    System.out.println("== 프로그램 시작 ==");
    System.out.println("== 프로그램 종료 ==");
    Scanner sc = new Scanner(System.in);
    System.out.print("명령어 ) ");
    //  String cmd = sc.nextLine();
    //  System.out.printf("%s\n",cmd);
    int num = sc.nextInt();
    System.out.printf("%d\n", num);
    sc.close();

  }
}
