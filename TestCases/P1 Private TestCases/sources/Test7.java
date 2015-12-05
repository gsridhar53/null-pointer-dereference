package TestCases;

public class Test7 {
	
	int i;

	public PublicTests recursiveTest(PublicTests test1) {
		PublicTests t2= new PublicTests();
		if(i%2==0){
			test1 = new PublicTests();
			t2 = test1;
			test1 = recursiveTest(test1);
			test1.toString();
			
		}
		t2.toString();
		if (test1==t2){
		/* test1.toString(); */

        return test1;
		}
		else 
			return t2;
    }
	
    public void startTest() {
	    PublicTests t1 = null;
	    PublicTests t2 = recursiveTest(t1);
	    t2.toString();
	    
	    
    }
}
