package stringbuffer.test1;

import java.util.Arrays;

public class StringTest3 {
	public static void main(String[] args) {
		/*
		 * ��ٷ��������е�6λ����Ѱ�ҷ���������ֵ
		 * */
		for(int i=100000;i<1000000;i++) {
			int t1=0;
			boolean flag=true;
			for(int j=2;j<7;j++) {	
				t1=i*j;
				if(t1>=1000000) {
					flag=false;
					break;
				}
				//�������6λ����������ж���ɵ������Ƿ���ͬ
				//���̣������������������flag=false
				String str1=String.valueOf(i);  //i+"";
				String str2=String.valueOf(t1);
				//�ж���ɲ��ֵ��ַ�ʱ����ͬ�����Ҫ����֮���ٱȽ�
				char[] arr1=str1.toCharArray();
				Arrays.sort(arr1);
				
				char[] arr2=str2.toCharArray();
				Arrays.sort(arr2);
				String str3=new String(arr1);
				String str4=new String(arr2);
				if(!str3.equals(str4)) {
					flag=false;
				}				
			}
			//���������2-6�ĳ˻�������Ҫ���������ֵ
			if(flag) {
				System.out.println(i);
			}
			
		}
		
		
		
	}
	

}
