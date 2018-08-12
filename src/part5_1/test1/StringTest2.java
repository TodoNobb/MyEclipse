package part5_1.test1;

public class StringTest2 {
	/*
	 * 从一个字符串中统计小写字母，大写字母，空格，数字，其他字符的数量
	 * */
	public static void main(String[] args) {
		/*String str1="q12awert@#aq$%$KJUU234523 769  %&#$#$135164   TR";
		int a=0,b=0,c=0,d=0,e=0;
		for(int i=0;i<str1.length();i++) {
			//一个一个的取出字符
			char ch=str1.charAt(i);
			if(ch<='z' && ch>='a') {
				a++;
			}
			else if(ch>='A' && ch<='Z') {
				b++;
			}
			//else if()
		}*/
		
		String str3="西安文理学院升级为西安大学";
		System.out.println(str3.substring(3));
		System.out.println(str3.substring(2,8));
		
	}

}
