package stringbuffer.test1;

public class StringBufferTest {
	public static void main(String[] args) {
		/*
		 * String类的对象是不可变的
		 * */
		/*String str1="java";
		//System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		str1=str1+"book";
		//System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);*/
		
		/*String str2=new String("book");
		String str3=new String("book");
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));*/
		
		/*String str1="a";
		long t1=System.currentTimeMillis();
		for(int i=0;i<50000;i++) {
			str1=str1+i;
		}
		long t2=System.currentTimeMillis();
		System.out.println(t2-t1);*/
		
		//StringBuffer在频繁内容变更方面的效率
		StringBuffer sbf1=new StringBuffer("a");
		long t1=System.currentTimeMillis();
		for(int i=0;i<5000000;i++) {
			sbf1=sbf1.append(i);
		}
		long t2=System.currentTimeMillis();
		System.out.println("for循环所需的时间："+(t2-t1));
	}

}
