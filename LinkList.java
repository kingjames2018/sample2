//Day 1 - July 19, 2018 at home 10:28 PM programmed by Kevin Dale T.
//Got help from youtube for refreshment
//Day 2 - July 21, 2018 at home 6L32 PM programmed by Kevin Dale T.
//I'm odd but I included some of the even problems
public interface LinkList
{
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
	//public void remove(int item, int pos); Even

	// pre: pos must be valid
	// removes an item at a specific position
	/*
	public void removeItemAt(int pos) //Even
	{
		//do your codes here!
	}

	// pre: item and pos must be valid
	// inserts an item at a specific postion
	public void insertItemAt(int item, int pos) //Odd
	{
		//do your codes here!
	} // insertItemAt()

	// counts all even items in the Linked List
	public int countEven() //Odd
	{
		//do your codes here!
	} // countEven()
	
	// multiplies 100 to all items in the Linked List
	public void changeAll() //All
	{
		//do your codes here!
	} // changeAll()

	// removes the first even number in the Linked List
	public void removeFirstEven() //odd
	{
		Node prev = head;
		//do your codes here!
	} // removeFirstEven()

	// (bunos)inserts an item after an item in the Linked List
	public void insertAfter(int item, int x)  //Even
	{
		//do your codes here!
	} // insertAfter()

	// removes all negative items in the Linked List
	public void removeAllNegative() //odd
	{
		//do your codes here!
	} // removeAllNegative()
	*/
	
}