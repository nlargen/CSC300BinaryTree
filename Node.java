
<<<<<<< HEAD
public class Node
{
	
=======
public class Node 
{

>>>>>>> bdc439b1d5102b46de2d8cb5417e5f9c51015d23
	private int payload;
	private Node leftNode;
	private Node rightNode;
	
	public Node(int payload)
	{
		this.payload = payload;
		this.leftNode = null;
		this.rightNode = null;
	}

<<<<<<< HEAD
	public void visitInorder()
	{
		if(this.leftNode != null)
		{
			this.leftNode.visitInorder();
			
		}
		System.out.println(this.payload);
		if(this.rightNode != null)
		{
			this.rightNode.visitInorder();
		}
	}
=======
>>>>>>> bdc439b1d5102b46de2d8cb5417e5f9c51015d23
	public void addNode(Node n)
	{
		if(n.getPayload() <= this.payload)
		{
			if(this.leftNode == null)
			{
				this.leftNode = n;
			}
			else
			{
				this.leftNode.addNode(n);
			}
		}
		else
		{
			if(this.rightNode == null)
			{
				this.rightNode = n;
			}
			else
			{
				this.rightNode.addNode(n);
			}
		}
	}
	
	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public int getPayload() {
		return payload;
	}
	
<<<<<<< HEAD

=======
	
>>>>>>> bdc439b1d5102b46de2d8cb5417e5f9c51015d23
}
