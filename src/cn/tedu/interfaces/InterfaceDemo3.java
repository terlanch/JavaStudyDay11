package cn.tedu.interfaces;
/*
 * �ӿ�---ģ�塢�淶
 */
import java.util.Arrays;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		//int[] arr = {2,5,7,3,4,1};
		//Lambda���ʽ
		Array a =(int[] arr)->{Arrays.sort(arr);};
		//������ֻ��һ��
		//Array a = (int[] arr)->Arrays.sort(arr);
		//���������Ƶ�
		//Array a = (arr)->Arrays.sort(arr);
		//ֻ��һ��������ʱ�����ʡ�ԣ���
		//Array a = arr->Arrays.sort(arr);
		//��ǰ����ֻ��һ�����������ݲ������
		//::---��    ��̬����
		//Array a = Arrays::sort;
		//����
		int[] arr = {2,5,7,3,4,1};
		a.sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}


//
interface Array{
	//����
	void sortArray(int[] arr);
}