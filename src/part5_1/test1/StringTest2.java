package part5_1.test1;

public class StringTest2 {
	/*
	 * ��һ���ַ�����ͳ��Сд��ĸ����д��ĸ���ո����֣������ַ�������
	 * */
	public static void main(String[] args) {
		/*String str1="q12awert@#aq$%$KJUU234523 769  %&#$#$135164   TR";
		int a=0,b=0,c=0,d=0,e=0;
		for(int i=0;i<str1.length();i++) {
			//һ��һ����ȡ���ַ�
			char ch=str1.charAt(i);
			if(ch<='z' && ch>='a') {
				a++;
			}
			else if(ch>='A' && ch<='Z') {
				b++;
			}
			//else if()
		}*/
		
		String str3="��������ѧԺ����Ϊ������ѧ";
		System.out.println(str3.substring(3));
		System.out.println(str3.substring(2,8));
		
	}

}
