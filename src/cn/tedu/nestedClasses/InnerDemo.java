package cn.tedu.nestedClasses;
/*
 * �ڲ���
 * 		���ڲ�����
 * 			�������ֲ����ڲ���--->������	
 * 			��Ա�ڲ���----InnerDemo1
 * 			��̬�ڲ���----InnerDemo2
 * 			�����ڲ���----InnerDemo3
 * 
 * 		�ӿ��ڲ����� 
 */
public class InnerDemo {
	
	public static void main(String[] args) {
		//�ⲿ��Ķ���
		Outer1 out1 = new Outer1();
		out1.m();
	}

}

//�ⲿ��
class Outer1{
	
	//����
	static int j = 1;
	
	//����
	public void m(){
		int k = 1;//��JDK1.8��ǰ��Ҫ�ֶ����final---��ʾ����
				  //��JDK1.8�����Ժ���Ҫ�ֶ���ӣ��ײ�Ĭ�����---��ʽ����
		//�������ڲ���
		//���Զ���Ǿ�̬�����Ժͷ���
		//���Զ��徲̬����
		//���Ա�final ����abstract���������
		//���ܷ���Ȩ�����η�����
		//���Խ��м̳к�ʵ��
		//�����õ��ⲿ����������Ժͷ���
		//ֻ���õ��������еĳ���---final����
		 class Inner1 extends InnerDemo implements Cloneable{
			final static int i = 10;
			int l =10;
			public void mn(){
				System.out.println(j);
				System.out.println(k);
				n();
			}	
		}
		
		//���������ڲ���Ķ���
		Inner1 in = new Inner1();
		in.mn();
	}
	
	public void n(){
		
	}
}
