// Tests Intra-procedural analysis as well as transfer functions of the true and false branches of if statement.
package TestCases;

public class Test6 {
	
	int i;
	/* public void ifTest(PublicTests test1) { */
	/* 	if(test1==null) */
	/* 		test1 = new PublicTests(); */
	/* 	test1.toString(); */
    /*     return; */
    /* } */
	
	public void startTest() {
		PublicTests t1,t2,t3;
		if(i%2==0){
			t1=null;
		} else {
			t1=new PublicTests();
		}
		if(t1==null){//Test for multiple phi nodes in a block
			//t3=new PublicTests();
			t2=new PublicTests(); 
		} else {
			//t3=new PublicTests();
			t2=t1;
		}
		t1.toString();// Null must be present in the points to set.
		t2.toString();// This is a safe dereference.
		//t3.toString();// Unafe dereference.
	}
}
