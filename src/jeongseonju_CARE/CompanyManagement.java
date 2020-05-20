package jeongseonju_CARE;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyManagement implements Company {

	
	Scanner input = new Scanner(System.in);
	ArrayList<CompanyBasics> arr = new ArrayList<CompanyBasics>();
	String name;
	String position;
	int basicSalary;
	int extraSalary;
	
	@Override
	public void saveWorker() {
		CompanyBasics comb = new CompanyBasics();
		while (true) {
			System.out.print("이름 : ");
			name = input.next();
			for (int i = 0; i < arr.size(); i++) {
				if (name.equals(arr.get(i).getName())) {
					System.out.println("같은 이름이 있습니다. 다시 입력해주세요");
				}
			}break;
		}
		comb.setName(name);
		System.out.print("직급 : ");
		position = input.next();
		comb.setPosition(position);
		System.out.print("기본급 : ");
		basicSalary = input.nextInt();
		comb.setBasicSalary(basicSalary);
		System.out.print("수당 : ");
		extraSalary = input.nextInt();
		comb.setExtraSalary(extraSalary);
		comb.setTaxRate(basicSalary);
		comb.setTotalSalary(basicSalary, extraSalary, comb.getTaxRate());
		arr.add(comb);
		
	}

	@Override
	public void modify() {
		System.out.print("수정할 사원의 이름을 입력 : ");
		name = input.next();
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getName())) {
				arr.get(i).setName(name);
				System.out.print("수정할 사원의 직급 : ");
				position = input.next();
				arr.get(i).setPosition(position);
				System.out.print("수정할 사원의 기본급 : ");
				basicSalary = input.nextInt();
				arr.get(i).setBasicSalary(basicSalary);
				System.out.print("수정할 사원의 수당 : ");
				extraSalary = input.nextInt();
				arr.get(i).setExtraSalary(extraSalary);
				arr.get(i).setTaxRate(basicSalary);
				arr.get(i).setTotalSalary(basicSalary, extraSalary, arr.get(i).getTaxRate());
			}
		}
	}

	@Override
	public void search() {
		System.out.print("검색할 사원의 이름을 입력 : ");
		name = input.next();
		outputTitle();
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getName())) {
				System.out.print(arr.get(i).getName() + "\t");
				System.out.print(arr.get(i).getPosition() + "\t");
				System.out.print(arr.get(i).getBasicSalary() + "\t");
				System.out.print(arr.get(i).getExtraSalary() + "\t");
				System.out.print(arr.get(i).getTaxRate() + "\t");
				System.out.println(arr.get(i).getTotalSalary());
				
			}
		}

	}

	@Override
	public void outputTitle() {
		System.out.println("이름\t직급\t기본급\t\t수당\t\t세율\t월급");
		System.out.println("-----------------------------------------------------------");
	}

	@Override
	public void output() {
		outputTitle();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i).getName() + "\t");
			System.out.print(arr.get(i).getPosition() + "\t");
			System.out.print(arr.get(i).getBasicSalary() + "\t");
			System.out.print(arr.get(i).getExtraSalary() + "\t");
			System.out.print(arr.get(i).getTaxRate() + "\t");
			System.out.println(arr.get(i).getTotalSalary());
		}

	}

}
