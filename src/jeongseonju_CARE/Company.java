package jeongseonju_CARE;

public interface Company {	//���� ����
	
	//�Է�
	public void saveWorker();    //���� �Ѹ��� �� ���� �޼ҵ�
	
	//����
	public void modify();   //Ư�� ������ ����, �⺻��, ���� ���� �޼ҵ�
	public void search();   //�̸� ������ �ش� ���� ���� ���� ã�� & �ش� �� ��� �޼ҵ�
	
	//���
	public void outputTitle();  //��µǴ� �������� Ÿ��Ʋ ��� �޼ҵ�
	public void output();        //��� ������ ���� ��� �޼ҵ�
}
