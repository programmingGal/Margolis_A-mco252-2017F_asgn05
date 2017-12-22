
public class EmTag extends DecoratorTag
{
	  public EmTag(HTMLTag theTag)
	  {
		  this.theTag = theTag;
	  }
	  
	  
	  public String getTag()
	  {
		  return ("<em>" + theTag.getTag() + "</em>");
	  }
  
}
