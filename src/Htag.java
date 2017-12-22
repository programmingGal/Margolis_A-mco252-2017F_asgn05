// HeaderTag

public class Htag extends HTMLTag
{  
	private int size;
	private String text;
	private String name;
	private String id;
	
	// set values in the constructor
  public Htag(int size,String text,String name,String id)
  {   
	  if (size < 1 || size > 6)
	  {
		  throw new IllegalArgumentException("Header tags can be size 1-6 only.");
	  }
	  
	  this.size = size;
	  this.name = name;
	  this.id = id;
	  this.text = text;
  }
  
  public String getTag()
  {
	  return ("<h" + size + " id=\"" + id + "\" name=\"" + name + "\">" + text+ "</h"  + size + ">");
  }
}
