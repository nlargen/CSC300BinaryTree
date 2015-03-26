
public class BinaryTree 

{
	Node root;



	public BinaryTree()
	{
		this.root = null;

	}

	public void displayInOrder(Node D2F) 
	{

		if(this.root == null)
		{
			System.out.println("Empty Tree");
		}
		else 
		{
			if(D2F != null)
			{
				displayInOrder(D2F.getLeftNode()); 
				System.out.println(D2F.getPayload());
				displayInOrder(D2F.getRightNode());
			}


		}
	}

	public void displayPostOrder(Node D2F)
	{

		if(this.root == null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			if(D2F != null)
			{

				displayPostOrder(D2F.getLeftNode()); 
				displayPostOrder(D2F.getRightNode());
				System.out.println(D2F.getPayload());
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
