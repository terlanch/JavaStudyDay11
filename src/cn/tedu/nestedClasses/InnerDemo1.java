package cn.tedu.nestedClasses;

public class InnerDemo1 {
	
	public static void main(String[] args) {
		//������Ա�ڲ���Ķ���
		Outer2.Inner2 in = new Outer2().new Inner2(); 
		
	}

}

//�ⲿ��
class Outer2{
	//����
	static int i = 10;
	
	//��Ա�ڲ���
	//���Զ���Ǿ�̬�����Ժͷ����Լ���̬����
	//���Ա�����Ȩ�����η��Լ�final��abstract����
	//���Լ̳к�ʵ��
	//�����õ��ⲿ�����е����Ժͷ���
	class Inner2 extends InnerDemo1 implements Cloneable{
		static final int j = 10;
		public void n(){
			System.out.println(i);
			m();
		}
	}
	
	
	//����
	public void m(){}
}