//Tests for transfer functions for if node as well as return statement.
package TestCases;

public class Test9 {
	Test8 t8;
	public void startTest(){
		Test9 t9=new Test9();
		t9.t8=new Test8();
		t9.t8=retTest(t9.t8);
		t9.t8.toString();//May be a null dereference.
		}
	private Test8 retTest(Test8 t) {
		// TODO Auto-generated method stub
		if(t!=null){
			return null;
		}
		else
			return t;
	}
}
