
public class StringBufferAndStringBuilderTest {

	public static void testString()
	{
		String s="Hello";
		String addString="World";
		long startTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			s+=addString;
		}
		long endTime=System.currentTimeMillis();
		long runTime=endTime-startTime;
		System.out.println("testString,运行时间:"+runTime);
	}
	public static void testStringBuffer()
	{
		StringBuffer s=new StringBuffer("Hello");
		String addString="World";
		long startTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			s.append(addString);
		}
		long endTime=System.currentTimeMillis();
		long runTime=endTime-startTime;
		System.out.println("testStringBuffer,运行时间:"+runTime);
	}
	public static void testStringBuilder()
	{
		StringBuilder s=new StringBuilder("Hello");
		String addString="World";
		long startTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			s.append(addString);
		}
		long endTime=System.currentTimeMillis();
		long runTime=endTime-startTime;
		System.out.println("testStringBuilder,运行时间:"+runTime);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testString();
		testStringBuffer();
		testStringBuilder();
	}

}
