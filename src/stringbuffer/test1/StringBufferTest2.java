package stringbuffer.test1;

public class StringBufferTest2 {
	public static void main(String[] args) {
		StringBuffer sbf2=new StringBuffer("bockthis");
		sbf2.append("java");
		System.out.println(sbf2.codePointAt(2));
		
		sbf2.insert(2, "нд");
		System.out.println(sbf2.toString());
		sbf2.replace(1, 3, "WWW");
		System.out.println(sbf2.toString());
		System.out.println(sbf2.reverse());
		System.out.println(sbf2.toString());
		
	}

}
