
public class SmallTag extends DecoratorTag
{
	  public SmallTag(HTMLTag theTag)
	  {
		  this.theTag = theTag;
	  }
	  
	  
	  public String getTag()
	  {
		  return ("<small>" + theTag.getTag() + "</small>");
	  }

}

