
<<<<<<< HEAD
public class BinaryTree
=======
public class BinaryTree 
>>>>>>> bdc439b1d5102b46de2d8cb5417e5f9c51015d23
{
	 Node root;
	 

<<<<<<< HEAD
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
	
=======
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
			System.out.println(focusNode.getPayload());
			displayPostOrder(focusNode.getLeftNode()); 
			displayPostOrder(focusNode.getRightNode());
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
>>>>>>> bdc439b1d5102b46de2d8cb5417e5f9c51015d23
}
