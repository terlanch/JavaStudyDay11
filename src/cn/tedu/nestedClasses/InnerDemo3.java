package cn.tedu.nestedClasses;

public class InnerDemo3 {
	
	Inner4 in4 = new Inner4() {
		
		@Override
		void n() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		void m() {
			// TODO Auto-generated method stub
			
		}
	};
	public static void main(String[] args) {
		//�����ڲ���---{}
		//�����ڲ����ڽ��з�������д
		//��final���ε��಻�ܱ��̳У��ܱ��̳е�������ܱ�ʵ�ֵĽӿڶ����Ծ��������ڲ������ʽ
		//��������ڲ����ڷ����ж���ͺͷ����ڲ���ʹ��һ�£�����ڳ�Աλ�þͺͳ�Ա�ڲ���ʹ�÷���һ��
		//�����ڲ��ഴ���Ķ���in
		
		Inner4 in = new Inner4() {
			
			int i = 1;
			
			@Override
			void n() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void m() {
				// TODO Auto-generated method stub
				System.out.println(1);
			}
		};
		in.m();
		
		//��ͨ��Ҳ���������ڲ���
		Inner5 in5 = new Inner5(){};
		//�ӿ�Ҳ�������ڲ���
		Inner6 in6 = new Inner6() {
		};
	}
	
}

interface Inner6{}

class Inner5{}

//
abstract class Inner4{
	abstract void m();
	abstract void n();
}
