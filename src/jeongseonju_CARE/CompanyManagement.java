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
			System.out.print("�̸� : ");
			name = input.next();
			for (int i = 0; i < arr.size(); i++) {
				if (name.equals(arr.get(i).getName())) {
					System.out.println("���� �̸��� �ֽ��ϴ�. �ٽ� �Է����ּ���");
				}
			}break;
		}
		comb.setName(name);
		System.out.print("���� : ");
		position = input.next();
		comb.setPosition(position);
		System.out.print("�⺻�� : ");
		basicSalary = input.nextInt();
		comb.setBasicSalary(basicSalary);
		System.out.print("���� : ");
		extraSalary = input.nextInt();
		comb.setExtraSalary(extraSalary);
		comb.setTaxRate(basicSalary);
		comb.setTotalSalary(basicSalary, extraSalary, comb.getTaxRate());
		arr.add(comb);
		
	}

	@Override
	public void modify() {
		System.out.print("������ ����� �̸��� �Է� : ");
		name = input.next();
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getName())) {
				arr.get(i).setName(name);
				System.out.print("������ ����� ���� : ");
				position = input.next();
				arr.get(i).setPosition(position);
				System.out.print("������ ����� �⺻�� : ");
				basicSalary = input.nextInt();
				arr.get(i).setBasicSalary(basicSalary);
				System.out.print("������ ����� ���� : ");
				extraSalary = input.nextInt();
				arr.get(i).setExtraSalary(extraSalary);
				arr.get(i).setTaxRate(basicSalary);
				arr.get(i).setTotalSalary(basicSalary, extraSalary, arr.get(i).getTaxRate());
			}
		}
	}

	@Override
	public void search() {
		System.out.print("�˻��� ����� �̸��� �Է� : ");
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
		System.out.println("�̸�\t����\t�⺻��\t\t����\t\t����\t����");
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
