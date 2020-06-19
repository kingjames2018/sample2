//Day 1 - July 19, 2018 at home 10:28 PM programmed by Kevin Dale T.
//Got help from youtube for refreshment
//Day 2 - July 21, 2018 at home 6L32 PM programmed by Kevin Dale T.
//I'm odd but I included some of the even problems
//Hey I'm back its been 2 years since I have last access you
/*
Methods I'm done with:
   public void addFront(int items);
	public int countOdd();
   public int countEven();
	public void addLast(int items);
   public boolean isEmpty();
	public void removeFront();
	public void removeLast();
	public void removeEven();
   public void removeOdd();
	public void removeItemAt(int pos);
   public void removeAllNegative();
   public void insertItemAt(int item, int pos);
   public void changeAll();
   public void removeFirstEven();
*/


public class  LinkedLists implements LinkList
{
	private int count;
	private int odd;
	private int even;
	private Node head;
	public LinkedLists()
	{
		head = new Node();
		count = 0;
		odd = 0;
      even = 0;
	}
   
   public boolean isEmpty()
   {
      return count==0;
   }
	
	public LinkedLists(int count,Node head)
	{
		this.count = count;
		this.head = head;
	}
   
   public void changeAll()
   {
      Node current = head;
      while(current!=null)
      {
         current.setItem(current.getItem()*100);
         current = current.getNext();
      }
   }
   
   public void removeFirstEven()
   {
      int a = 0;
      int b = 0;
      Node previous = null;
      if(head==null)
      {
         return;
      }
      while(head!=null&&head.getItem()%2==0)
      {
         Node temp = head;
         head = head.getNext();
         temp.setNext(null);
         even--;
         b++;
      }
      if(b==1)
      {
         return;
      }
      Node step = head;
      while(step!=null)
      {
         if(step.getItem()%2==0)
         {
            Node temp = step;
            step = step.getNext();
            previous.setNext(step);
            temp.setNext(null);
            even--;
            a++;
         }
         if(a==1)
         {
            return;
         }
         else
         {
            previous = step;
            step = step.getNext();
         }
      }
   }
   
   public void removeAllNegative()
   {
      Node previous = null;
      if(head==null)
      {
         return;
      }
      while(head!=null&&head.getItem()<0)
      {
         Node temp = head;
         head = head.getNext();
         temp.setNext(null);
         count--;
      }
      Node step = head;
      while(step!=null)
      {
         if(step.getItem()<0)
         {
            Node temp = step;
            step = step.getNext();
            previous.setNext(step);
            temp.setNext(null);
            count--;
         }
         else
         {
            previous = step;
            step = step.getNext();
         }
      }
   }
   
   public void insertItemAt(int item, int pos)
   {
      Node temp = new Node(item);
      Node previous = head;
      Node current = null;
      int counter = 1;
      while(counter<pos-1)
      {
         previous = previous.getNext();
         counter++;
      }
      current = previous.getNext();
      temp.setNext(current);
      previous.setNext(temp);
      count++;
   }
   
   public void removeEven()
   {
      Node previous = null;
      if(head==null)
      {
         return;
      }
      while(head!=null&&head.getItem()%2==0)
      {

         Node temp = head;
         head = head.getNext();
         temp.setNext(null);
         even--;
      }
      Node step = head;
      while(step!=null)
      {
         if(step.getItem()%2==0)
         {
            Node temp = step;
            step = step.getNext();
            previous.setNext(step);
            temp.setNext(null);
            even--;
         }
         else
         {
            previous = step;
            step = step.getNext();
         }
      }
   }
   
   public void removeOdd()
   {
       Node previous = null;
      if(head==null)
      {
         return;
      }
      while(head!=null&&head.getItem()%2==1)
      {
         Node temp = head;
         head = head.getNext();
         temp.setNext(null);
         odd--;
      }
      Node step = head;
      while(step!=null)
      {
         if(step.getItem()%2==1)
         {
            Node temp = step;
            step = step.getNext();
            previous.setNext(step);
            temp.setNext(null);
            odd--;
         }
         else
         {
            previous = step;
            step = step.getNext();
         }
      }
   }
   
   public void removeItemAt(int pos)
   {
      Node current = null;
      Node previous = head;
      int counter = 1;
      while(counter<pos-1)
      {
         previous = previous.getNext();
         counter++;
      }
      current = previous.getNext();
      previous.setNext(current.getNext());
      current.setNext(null);
      count--;
   }
   
   public int countOdd()
	{
		return odd;
	}
   
   public int countEven()
   {
      return even;
   }
	
	public String toString()
	{
      odd = 0;
      even = 0;
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		Node p = head;
		while(p!=null)
		{
			if(p.getItem()%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			sb.append(p.getItem()+",");
			p = p.getNext();
		}
		sb.append(")");
		return sb.toString();
	}
   
	
	public void addFront(int items)
	{
      Node temp = new Node(items);
      temp.setNext(head);
      head = temp;
      
		//head.setNext(new Node(items,head.getNext()));
		count++;
	}
   
   public void addLast(int items)
   {
      Node temp = new Node(items);
      Node current = head;
      while(current.getNext()!=null)
      {
         current = current.getNext();
      }
      current.setNext(temp);
      count++;
   }
   
   public void removeFront()
   {
      Node temp = head;
      head = head.getNext();
      temp.setNext(null);
      count--;
   }
   
   public void removeLast()
   {
      Node last = head;
      Node previous = null;
      while(last.getNext()!=null)
      {
         previous = last;
         last = last.getNext();
      }
      previous.setNext(null);
      count--;
   }
   
   public static void main(String[] args)
	{
		LinkedLists s = new LinkedLists();
      s.addFront(3);
		s.addFront(5);
		s.addFront(7);
		s.addFront(9);
		s.addFront(11);
      s.addLast(13);
      s.addLast(15);
      s.addFront(14);
      s.addFront(16);
      s.addFront(18);
      s.addFront(-2);
      s.addFront(-17);
      s.addLast(-14);
      System.out.print("Original List: ");
      System.out.print(s);
      System.out.println();
      System.out.println("Number of odd numbers: "+s.countOdd());
      System.out.println("Number of even numbers: "+s.countEven());
      System.out.println();
      //Just choose from the methods you want to execute
      //s.removeAllNegative();
      //s.removeLast();
      //s.removeFront();
      //s.removeItemAt(2);
      //s.removeOdd();
      //s.changeAll();
      //s.removeEven();
      //s.removeFirstEven();
      //s.insertItemAt(23,1);
      System.out.print("Updated List: ");
      System.out.print(s);
      System.out.println();
      System.out.println("Number of odd numbers: "+s.countOdd());
      System.out.println("Number of even numbers: "+s.countEven());
      
	}
}
		
		

		