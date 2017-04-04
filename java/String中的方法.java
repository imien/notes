public char charAt(int index) 返回字符串中index位置的字符

public int length() 返回字符串的长度
public boolean isEmpty() 判断字符串长度是否为0

public char[] toCharArray() 将字符串转化为字符数组

public int indexOf(String str) 返回字符串中第一次出现字串str的位置
public int indexOf(String str,int fromIndex) 返回字符串从fromIndex开始第一次出现子串str的位置
public int lastIndexOf(String str) 返回字符串中最后一次出现字串str的位置
public int lastIndexOf(String str, int fromIndex) 返回字符串从fromIndex开始最后一次出现子串str的位置

public boolean equals(Object object) 当object不为空并且与当前String对象一样返回true,否则返回false
public boolean equalsIgnoreCase(String another) 比较字符串与another是否一样（忽略大小写）

public String replace(char oldchar,char newChar) 在字符串中用newChar字符替换oldChar字符

public boolean startsWith(String prefix) 判断字符串是否以prefix字符串开头
public boolean endsWith(String suffix) 判断一个字符串是否以suffix字符串结尾

public String toUpperCase() 将该字符串转换为大写形式
public String toLowerCase() 将该字符串转换为小写形式

public String substring(int beginIndex) 获取从beginIndex开始到结尾的子串
public String substring(int beginIndex, int endIndex) 获取从beginIndex开始到endsIndex的子串

public String trim() 去掉开头和结尾的空格

public String[] split(String regex) 返回以regex分割后的字符串数组

public String concat(String str) 字符串拼接，返回拼接后的字符串

public boolean contains(CharSequence s) 判断是否包含某个字符串

public int compareTo(String anotherString) 字符串比较，相等返回0，否则返回第一个不等字符的差，若一个字符串是另一个的子串，则返回它们的长度差
public int compareToIgnoreCase(String str) 字符串比较，忽略大小写

public byte[] getBytes() 将该String对象转换成byte数组
public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
该方法将字符串拷贝到字符数组中。srcBegin为拷贝的起始位置、srcEnd为拷贝的结束位置、字符串数值dst为目标字符数组、dstBegin为目标字符数组的拷贝起始位置

public static String format(String format, Object... args) 返回指定的格式化的字符串
eg. System.out.println(String.format("this is %d %s", 9, "圆")) 输出：this is 9 圆

public static String valueOf(boolean b) 将各种不同类型转换成Java字符串
public static String valueOf(char c)
public static String valueOf(char[] data)
public static String valueOf(char[] data, int offset, int count)
public static String valueOf(double d)
public static String valueOf(float f)
public static String valueOf(int i)
public static String valueOf(long l)
public static String valueOf(Object obj)
