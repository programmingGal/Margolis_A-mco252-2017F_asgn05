
public class ATag extends DecoratorTag
{
	String href;
	
	  public ATag(HTMLTag theTag,String href)
	  {
		  this.theTag = theTag;
		  this.href=href;
	  }
	  
	  
	  public String getTag()
	  {
		  return ("<a href=\"" + href+"\">" + theTag.getTag() + "</a>");
	  }

}
