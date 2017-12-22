
public class UTag extends DecoratorTag
{
	  public UTag(HTMLTag theTag)
	  {
		  this.theTag = theTag;
	  }
	  
	  
	  public String getTag()
	  {
		  return ("<u>" + theTag.getTag() + "</u>");
	  }

}

