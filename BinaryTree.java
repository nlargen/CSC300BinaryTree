
public class BinaryTree 

{
	Node root;



	public BinaryTree()
	{
		this.root = null;

	}

	public void displayInOrder(Node focusNode) 
	{

		if(this.root == null)
		{
			System.out.println("Empty Tree");
		}
		else 
		{
			if(focusNode != null)
			{
				displayInOrder(focusNode.getLeftNode()); 
				System.out.println(focusNode.getPayload());
				displayInOrder(focusNode.getRightNode());
			}


		}
	}

	public void displayPostOrder(Node focusNode)
	{

		if(this.root == null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			if(focusNode != null)
			{

				displayPostOrder(focusNode.getLeftNode()); 
				displayPostOrder(focusNode.getRightNode());
				System.out.println(focusNode.getPayload());
			}
		}
	}

	public void add(int value)
	{
		Node theNode = new Node(value);
		if(this.root == null)
		{
			this.root = theNode;
		}
		else
		{
			this.root.addNode(theNode);
		}
	}




}
