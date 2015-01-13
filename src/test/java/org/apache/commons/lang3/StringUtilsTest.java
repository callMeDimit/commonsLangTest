package org.apache.commons.lang3;

import org.junit.Test;

/**
 * Dimit 2015年1月13日
 */
public class StringUtilsTest {
	/**
	 * StringUtils.isEmpty(null) = true StringUtils.isEmpty("") = true
	 * StringUtils.isEmpty(" ") = false StringUtils.isEmpty("bob") = false
	 * StringUtils.isEmpty("  bob  ") = false
	 */
	@Test
	public void isEmpty() {
		System.out.println(StringUtils.isEmpty(""));
	}

	/**
	 * StringUtils.isNotEmpty(null) = false StringUtils.isNotEmpty("") = false
	 * StringUtils.isNotEmpty(" ") = true StringUtils.isNotEmpty("bob") = true
	 * StringUtils.isNotEmpty("  bob  ") = true
	 */
	@Test
	public void isNotEmpty() {
		System.out.println(StringUtils.isNotEmpty(""));
	}

	/**
	 * 字符数组存在任意一个为null 返回true StringUtils.isAnyEmpty(null) = true
	 * StringUtils.isAnyEmpty(null, "foo") = true StringUtils.isAnyEmpty("",
	 * "bar") = true StringUtils.isAnyEmpty("bob", "") = true
	 * StringUtils.isAnyEmpty("  bob  ", null) = true
	 * StringUtils.isAnyEmpty(" ", "bar") = false StringUtils.isAnyEmpty("foo",
	 * "bar") = false
	 */
	@Test
	public void isAnyEmpty() {
		System.out.println(StringUtils.isAnyEmpty(""));
	}

	/**
	 * 是isAnyEmpty取反
	 */
	@Test
	public void isNoneEmpty() {
		System.out.println(StringUtils.isNoneEmpty(""));
	}

	/**
	 * 检查字符串是否全由空格或空字符串组成 StringUtils.isBlank(null) = true
	 * StringUtils.isBlank("") = true StringUtils.isBlank(" ") = true
	 * StringUtils.isBlank("bob") = false StringUtils.isBlank("  bob  ") = false
	 */
	@Test
	public void isBlank() {
		System.out.println(StringUtils.isBlank(""));
	}

	/**
	 * 循环调用isBlank方法
	 * StringUtils.isAnyBlank(null) = true
	 * StringUtils.isAnyBlank(null, "foo") = true
	 * StringUtils.isAnyBlank(null, null) = true 
	 * StringUtils.isAnyBlank("","bar") = true
	 * StringUtils.isAnyBlank("bob", "") = true
	 * StringUtils.isAnyBlank("  bob  ", null) = true
	 * StringUtils.isAnyBlank(" ", "bar") = true
	 * StringUtils.isAnyBlank("foo","bar") = false
	 */
	@Test
	public void isAnyBlank() {
		System.out.println(StringUtils.isAnyBlank(""));
	}
	
	/**
	 * 由isAnyBlank方法取反得到
	 */
	@Test
	public void isNoneBlank() {
		System.out.println(StringUtils.isNoneBlank(""));
	}
	
	/**
	 * 去除字符串首尾空格
	 * StringUtils.trim(null)          = null
     * StringUtils.trim("")            = ""
     * StringUtils.trim("     ")       = ""
     * StringUtils.trim("abc")         = "abc"
     * StringUtils.trim("    abc    ") = "abc"
	 */
	@Test
	public void trim() {
		System.out.println(StringUtils.trim("  	\t \n	aaa "));
	}
	
	/**
	 * StringUtils.trimToNull(null)          = null
     * StringUtils.trimToNull("")            = null（注意这个值与trim的区别）
     * StringUtils.trimToNull("     ")       = null（注意这个值与trim的区别）
     * StringUtils.trimToNull("abc")         = "abc"
     * StringUtils.trimToNull("    abc    ") = "abc"
	 */
	@Test
	public void trimToNull() {
		System.out.println(StringUtils.trimToNull("   "));
	}
	
	/**
	 * 不会返回空只会返回空字符串
	 * StringUtils.trimToEmpty(null)          = ""
     * StringUtils.trimToEmpty("")            = ""
     * StringUtils.trimToEmpty("     ")       = ""
     * StringUtils.trimToEmpty("abc")         = "abc"
     * StringUtils.trimToEmpty("    abc    ") = "abc"
	 */
	@Test
	public void trimToEmpty() {
		System.out.println(StringUtils.trimToEmpty("   "));
	}
	
	/**
	 * 与trim类似。注意区别：字符为控制字符的判定不同
	 */
	@Test
	public void strip() {
		System.out.println(StringUtils.strip("  \t \n	asd "));
	}
	
	@Test
	public void indexOf() {
		System.out.println(StringUtils.indexOf("asdfadaasssdddaa",'a',4));
	}
	
	
}
