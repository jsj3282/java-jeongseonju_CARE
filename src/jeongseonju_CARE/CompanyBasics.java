package jeongseonju_CARE;

public class CompanyBasics{
	 private String name;
	 private String position;
	 private int basicSalary;
	 private int extraSalary;
	 private double taxRate;
	 private double totalSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getExtraSalary() {
		return extraSalary;
	}
	public void setExtraSalary(int extraSalary) {
		this.extraSalary = extraSalary;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(int basicSalary) {
		if(basicSalary<=2000000) {
			this.taxRate = 0.01;
		}else if(basicSalary<=4000000) {
			this.taxRate = 0.02;
		}else {
			this.taxRate = 0.03;
		}
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(int basicSalary, int extraSalary, double taxRate) {
		this.totalSalary = basicSalary + extraSalary - (basicSalary + extraSalary) * taxRate;
	}
	
}
