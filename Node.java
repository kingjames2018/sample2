//Day 1 - July 19, 2018 at home 10:28 PM programmed by Kevin Dale T.
//Got help from youtube for refreshment
//Day 2 - July 21, 2018 at home 6L32 PM programmed by Kevin Dale T.
//I'm odd but I included some of the even problems
public class Node {
	private int item;
	private Node next;

  
	public Node()
	{
		this(0,null);
		}
  
	public Node(int item,Node next)
	{
			this.item = item;
			this.next = next;
			}
	public Node(int item)
	{
		this(item,null);
	}
	public int getItem()
	{
		return item;
	}
	public Node getNext() {
		return next;
	}
	public void setItem(int item)
	{
		this.item = item;
		}
	public void setNext(Node next)
	{
		this.next = next;}
	}
