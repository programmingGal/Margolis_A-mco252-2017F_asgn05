// Div tag


public class Divtag extends HTMLTag
{
	private String text;
	private String name;
	private String id;
	
	
	public Divtag(String text,String name, String id)
	{
		 this.name = name;
		  this.id = id;
		  this.text = text;
	}
	
	public String getTag()
	  {
		  return ("<div id=\"" + id + "\" name=\"" + name + "\">" + text+ "</div>");
	  }

}
