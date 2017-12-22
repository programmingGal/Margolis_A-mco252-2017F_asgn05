
public class StrongTag extends DecoratorTag
{
	  public StrongTag(HTMLTag theTag)
	  {
		  this.theTag = theTag;
	  }
	  
	  
	  public String getTag()
	  {
		  return ("<strong>" + theTag.getTag() + "</strong>");
	  }

}

