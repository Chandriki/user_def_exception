package chandriki2;

public class user_def_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            try {
            	fun();
            }
            catch(Exception e){
              System.out.println(e);           
              }
	}
	
	static void fun() throws Exception{
		throw new Exception();
	}
	

	class Myexcep extends Exception{
		public String m()
		{
			return "My excep occur";
		}
	}
}
