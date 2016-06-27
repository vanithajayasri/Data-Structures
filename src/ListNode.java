
public class ListNode
{
	private int data;
	private ListNode next;
	
	// setter and getter methods for the linked list
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setNext(ListNode next)
	{
		this.next = next;
		
	}
	
	public ListNode getNext()
	{
		return next;
	}
	
	// function for finding the length of the linked list
	
	public int listLength(ListNode headNode)
	{
		int length = 0;
		ListNode currentNode = headNode;
		while(currentNode != null){
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
