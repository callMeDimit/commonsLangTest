package org.apache.commons.lang3;

import java.util.Map;

import org.junit.Test;

/**
 * Dimit 2015年1月13日
 */
public class ArrayUtilTest {

	/**
	 * 将二维数组转换为map
	 */
	@Test
	public void toMap() {
		Map<Object,Object> colorMap = ArrayUtils.toMap(new String[][] {{"RED", "#FF0000"},{"GREEN", "#00FF00"},{"BLUE", "#0000FF"}});
		System.out.println(colorMap);
	}
	
	/**
	 * 数组元素的浅克隆
	 */
	@Test
	public void cloneTest() {
		String [] aa = new String []{"aaa","vvv"};
		String [] bb = 	ArrayUtils.clone(aa);
		bb[0] = "wwww";
		printArray(aa);
		printArray(bb);
		System.out.println("-----------------------------");
		Bean b1 = new Bean(1, "aaa");
		Bean b2 = new Bean(2, "bbbb");
		Bean [] a1 = new Bean [] {b1,b2};
		Bean [] a2 = ArrayUtils.clone(a1);
		a2[0].setId(3);
		a2[0].setName("ccc");
		printArray(a1);
		printArray(a2);
		
	}
	private <T> T[] printArray(T[] array) {
		for(T t : array) {
			System.out.println(t.toString());
		}
		return null;
	}
	
	/**
	 * 检查两个数组长度是否相等[注意空数组和长度为0的数组比较也会返回true]
	 */
	@Test
	public void isSameLength() {
		String [] aa = new String []{};
		String [] bb = 	null;
		System.out.println(ArrayUtils.isSameLength(aa, bb));
	}
	
	/**
	 * 对给定数组的元素进行逆向排序
	 */
	@Test
	public void reverse() {
		String [] aa = new String []{"aaaa","bbbb","cccc"};
		ArrayUtils.reverse(aa);
		printArray(aa);
	}

}

