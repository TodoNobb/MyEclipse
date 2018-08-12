package baozhuanglei.test;

import java.util.ArrayList;

public class BoxTest1 {
	public static void main(String[] args) {
		Integer itg=new Integer(32);
		Integer itg2=new Integer("54");
		
		//System.out.println(Integer.SIZE);
		//System.out.println(Integer.MAX_VALUE);
		
		System.out.println(itg.intValue());
		System.out.println(itg2.intValue());
		
		ArrayList al=new ArrayList();
		al.add(itg);
		al.add(itg2);
		
		al.add(3);
		
	}

}
