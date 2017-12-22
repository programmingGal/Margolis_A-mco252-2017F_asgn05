
public class ItalicsTag extends DecoratorTag
{
	  public ItalicsTag(HTMLTag theTag)
	  {
		  this.theTag = theTag;
	  }
	  
	  
	  public String getTag()
	  {
		  return ("<i>" + theTag.getTag() + "</i>");
	  }

}
