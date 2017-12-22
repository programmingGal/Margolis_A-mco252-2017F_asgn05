// Input tag


public class Intag extends HTMLTag
{
	private String text;
	private String name;
	private String id;
	private String type;
	private String event;
	private String eventValue;
	private String value;
	
	
	public Intag(String text,String name,String id,String type,String event,String eventValue,String value )
	{
		 
		  this.text = text;
		  this.name=name;
		  this.id=id;
		  this.type = type;
		  this.event = event;
		  this.eventValue = eventValue;
		  this.value=value;
	}
	
	public String getTag()
	  {
		  return ("<input name = \"" + name + "\" id=\"" + id + "\" type=\"" + type + "\" value=\"" + value + "\" " +  event + "=\"" + eventValue + "\">" + text+ "</input>");
	  }
}
