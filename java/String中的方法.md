public char charAt(int index) �����ַ�����indexλ�õ��ַ�

public int length() �����ַ����ĳ���
public boolean isEmpty() �ж��ַ��������Ƿ�Ϊ0

public char[] toCharArray() ���ַ���ת��Ϊ�ַ�����

public int indexOf(String str) �����ַ����е�һ�γ����ִ�str��λ��
public int indexOf(String str,int fromIndex) �����ַ�����fromIndex��ʼ��һ�γ����Ӵ�str��λ��
public int lastIndexOf(String str) �����ַ��������һ�γ����ִ�str��λ��
public int lastIndexOf(String str, int fromIndex) �����ַ�����fromIndex��ʼ���һ�γ����Ӵ�str��λ��

public boolean equals(Object object) ��object��Ϊ�ղ����뵱ǰString����һ������true,���򷵻�false
public boolean equalsIgnoreCase(String another) �Ƚ��ַ�����another�Ƿ�һ�������Դ�Сд��

public String replace(char oldchar,char newChar) ���ַ�������newChar�ַ��滻oldChar�ַ�

public boolean startsWith(String prefix) �ж��ַ����Ƿ���prefix�ַ�����ͷ
public boolean endsWith(String suffix) �ж�һ���ַ����Ƿ���suffix�ַ�����β

public String toUpperCase() �����ַ���ת��Ϊ��д��ʽ
public String toLowerCase() �����ַ���ת��ΪСд��ʽ

public String substring(int beginIndex) ��ȡ��beginIndex��ʼ����β���Ӵ�
public String substring(int beginIndex, int endIndex) ��ȡ��beginIndex��ʼ��endsIndex���Ӵ�

public String trim() ȥ����ͷ�ͽ�β�Ŀո�

public String[] split(String regex) ������regex�ָ����ַ�������

public String concat(String str) �ַ���ƴ�ӣ�����ƴ�Ӻ���ַ���

public boolean contains(CharSequence s) �ж��Ƿ����ĳ���ַ���

public int compareTo(String anotherString) �ַ����Ƚϣ���ȷ���0�����򷵻ص�һ�������ַ��Ĳ��һ���ַ�������һ�����Ӵ����򷵻����ǵĳ��Ȳ�
public int compareToIgnoreCase(String str) �ַ����Ƚϣ����Դ�Сд

public byte[] getBytes() ����String����ת����byte����
public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
�÷������ַ����������ַ������С�srcBeginΪ��������ʼλ�á�srcEndΪ�����Ľ���λ�á��ַ�����ֵdstΪĿ���ַ����顢dstBeginΪĿ���ַ�����Ŀ�����ʼλ��

public static String format(String format, Object... args) ����ָ���ĸ�ʽ�����ַ���
eg. System.out.println(String.format("this is %d %s", 9, "Բ")) �����this is 9 Բ

public static String valueOf(boolean b) �����ֲ�ͬ����ת����Java�ַ���
public static String valueOf(char c)
public static String valueOf(char[] data)
public static String valueOf(char[] data, int offset, int count)
public static String valueOf(double d)
public static String valueOf(float f)
public static String valueOf(int i)
public static String valueOf(long l)
public static String valueOf(Object obj)