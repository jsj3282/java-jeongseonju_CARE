package jeongseonju_CARE;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CompanyManagement comm = new CompanyManagement();
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. ���");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �˻�");
			System.out.println("5. ����");
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
				System.out.println("������� ���α׷��� �����մϴ�.");
				flag = false;
			}
		}
	}

}
