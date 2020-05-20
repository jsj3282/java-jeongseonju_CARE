package jeongseonju_CARE;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CompanyManagement comm = new CompanyManagement();
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 등록");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 검색");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			int num = input.nextInt();
			switch(num) {
			case 1:
				comm.saveWorker();
				break;
			case 2:
				comm.output();
				break;
			case 3:
				comm.modify();
				break;
			case 4:
				comm.search();
				break;
			case 5:
				System.out.println("사원관리 프로그램을 종료합니다.");
				flag = false;
			}
		}
	}

}
