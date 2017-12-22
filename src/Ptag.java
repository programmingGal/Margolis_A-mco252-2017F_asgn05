// paragraph tag

public class Ptag extends HTMLTag
{
	private String text;
	private String name;
	private String id;
	
	
	public Ptag(String text,String name, String id)
	{
		 this.name = name;
		  this.id = id;
		  this.text = text;
	}
	
	public String getTag()
	  {
		  return ("<p id=\"" + id + "\" name=\"" + name + "\">" + text+ "</p>");
	  }
}
