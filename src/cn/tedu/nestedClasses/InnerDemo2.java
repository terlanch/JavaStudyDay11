package cn.tedu.nestedClasses;
/*
 * ��̬�ڲ���
 * 
 * 
 * 		A.B.i---A�����Ƕ���B���������ԣ�i������B������
 * 				A�������࣬B�����Ǿ�̬���ԣ�i������B������
 * 				A�������ⲿ�࣬B�����Ǿ�̬�ڲ��࣬i������B�ľ�̬����
 */


public class InnerDemo2 {
	public static void main(String[] args) {
		//������̬�ڲ������
		Outer3.Inner3 in = new Outer3.Inner3();
		in.n();
		Outer3 o3 = new Outer3();
		System.out.println(o3.a.i);	
		System.out.println(Outer3.a.i);
	}

}

//�ⲿ��
class Outer3{
	
	//����
	static A a = new A();
	static int j = 1;
	
	//��̬�ڲ���
	//���Զ������е����Ժͷ��� �Լ���̬����
	//���Ա�����Ȩ�����η������Լ�final��abstract����
	//���Լ̳к�ʵ��
	//ֻ���õ��ⲿ������о�̬���Ժͷ���
	static class Inner3 extends InnerDemo2 implements Cloneable{
		static int i = 1;
		public void n(){
			System.out.println(j);
		}
	}
	
	
	//����
	public void m(){}
}

class A{
	int i;
}
