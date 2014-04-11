package ch3;

class person{
	person(){
		System.out.println("person   "+this.getClass());
	}
	private void print()
	{
		System.out.println("Person----print()");
	}
	public void fun()
	{
		System.out.println(this.getClass());
	}
}
class student extends person{
	student()
	{
		System.out.println("student   "+this.getClass());
	}
	public void print()
	{
		System.out.println(this.getClass());
	}
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		person std=new student();
		System.out.println(System.getProperty("file.encoding"));
				
		/*byte input[]={25,40,70,100};
		String str=bytesToHexString(input);
		System.out.println(str);*/
		
	}
	
/*	public static String bytesToHexString(byte[] src){  
	    StringBuilder stringBuilder = new StringBuilder("");  
	    if (src == null || src.length <= 0) {  
	        return null;  
	    }  
	    for (int i = 0; i < src.length; i++) {  
	        int v = src[i] & 0xFF;  
	        String hv = Integer.toHexString(v);  
	        if (hv.length() < 2) {  
	            stringBuilder.append(0);  
	        }  
	        stringBuilder.append(hv);  
	    }  
	    return stringBuilder.toString();  
	}  */

}
