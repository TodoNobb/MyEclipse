package stringbuffer.test1;

import java.util.Arrays;

public class StringTest3 {
	public static void main(String[] args) {
		/*
		 * 穷举法，在所有的6位数中寻找符合条件的值
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
				//如果还是6位数，则继续判断组成的数符是否相同
				//挑刺，如果不符合条件，则flag=false
				String str1=String.valueOf(i);  //i+"";
				String str2=String.valueOf(t1);
				//判断组成部分的字符时候相同，务必要排序之后再比较
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
			//如果连续和2-6的乘积，符合要求，则输出该值
			if(flag) {
				System.out.println(i);
			}
			
		}
		
		
		
	}
	

}
