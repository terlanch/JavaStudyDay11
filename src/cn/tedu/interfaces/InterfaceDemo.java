package cn.tedu.interfaces;
/*
 * interface(�ӿ�)
 * 
 * 		��������������еķ������ǳ��󷽷����Ͱѳ������ɽӿ�
 * 		��interface����ʾ������ӿ�֮��ͨ��implement����ʾʵ
 * 		�֣����һ����ͨ��ʵ�ֽӿھ�Ҫ�ѽӿ������еĳ��󷽷���
 * 		����д��������붼��д��Ҫ����ͨ���ɳ����ࡣ�ӿ����
 * 		��֮�������̳�
 * 			�ӿ��ж��ǳ��󷽷�����һ�� �����jdk1.8��ǰ �ӿ���
 * 		ֻ���г��󷽷���jdk1.8��ʼ������ӿ��п���ȥ����ʵ�巽
 * 		����static ���� Ĭ�ϣ�
 * 			�ӿ��ܶ��Թ��췽���𣿲��ܣ����޷���������
 */


public class InterfaceDemo {

}
//ͼ����
//�ӿ� ---interface---�ӿڲ�����
//�ӿ������̳�
interface Shape extends Cloneable{
	
	//û�й��췽��
	//public Shape(){}
	//�ܳ������
	//���󷽷�
	public double getArea();
	//���󷽷�
	public double getGirth();
	
	
}
//����ͽӿ�֮��������ֹ�����ϵ��ͨ��implements---ʵ��
//�����ͨ��ʵ���˽ӿھ�Ҫ��д���еĳ��󷽷���
//������붼��д�Ͱ���ͨ���ɳ�����
class Rectangle implements Shape,Cloneable{

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getGirth() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
