package testing;

public class Child extends Parent
{
    
	 public void add(int a, int b)
	    {
	    	int c=a+b;
	    	System.out.println("This is addition in child class");
	    }
	    
	 public void mul(int a, int b, int c)
	    {
	    	c=a*b;
	    }
	    
	 
	    
	public static void main(String[] args) 
	{
	 Parent p = new Child();
	 p.add(2, 3,5);
      
	}

}
