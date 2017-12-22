
public class Program
{
    public static void main (String [] args)
    {
    	    String text = "Hello World!";
    	    try {
				 HTMLTag htag = new Htag (2,text,"Title","main");
	    	     System.out.println(htag.getTag());
    	    }
    	    catch (IllegalArgumentException e)
    	    {
    	    	System.out.println(e.getMessage());
    	    }
    	    
		  
		  HTMLTag ptag = new Ptag ("Hello","Title","main");
		  System.out.println(ptag.getTag());
		  
		  
		  HTMLTag intag;
		  intag = new Intag ("The value of Coffee", "Article Title","111","button","Onclick","Highlight","action");
		  intag = new EmTag(intag);
		  intag = new ATag(intag,"www.aish.com");
		  
		  System.out.println(intag.getTag());
		  
		  HTMLTag divtag;
		  divtag = new Divtag("Good Night","greeting","44");
		  divtag = new StrongTag(divtag);
		  divtag = new ItalicsTag(divtag);
		  divtag = new SmallTag(divtag);
		  divtag = new UTag(divtag);
		  
		  System.out.println(divtag.getTag());
		  
		  
  
    }
}