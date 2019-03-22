package cn.tedu.interfaces;
/*
 * JDK1.8�ڽӿ��е�������
 * 	������ʵ�巽����ͨ��static��default��������ɵ�
 * 
 * 	Lambda���ʽ---������д���ӿڣ����󷽷����涨�ӿ�
 * 				��ֻ����һ�����󷽷�������ӿھͽ���
 * 				����ʽ�ӿ�---����ʽ���
 */
public class InterfaceDemo2 {
	public static void main(String[] args) {
		//Lambda���ʽ
		//(�����б�)->{��д�ķ�����}
		//Calc c = (int x,int y)->{return x>y?x:y;};
		//���������ֻ��һ�仰�Ϳ���ʡ��{}�Լ�return
		//Calc c = (int x,int y)->x>y?x:y;
		//��ǰ����󷽷��Ĳ������Ϳ����Ƶ���������Ҫ������
		//Lambda���ʽʹ�õ�ǰ��ӿ�����ֻ��һ�����󷽷�
		Calc c = (x,y)->x>y?x:y;
		System.out.println(c.getMax(6, 8));
	}
}

//������ Calc
//����ʽ�ӿ�----ֻ��һ�����󷽷�---����ʽ���
@FunctionalInterface
interface Calc{
	//���
	//ʵ�巽��---Ĭ�Ϸ���
	public default int getSum(int n,int m){
		return m+n;
	}
	
	//���
	//ʵ�巽��---��̬����
	public static int getCheng(int n,int m){
		return m*n;
	}
	
	//���󷽷�
	int getMax(int n,int m);
}
