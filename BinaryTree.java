
public class BinaryTree 

{
	private boolean isEmpty;
	private int payload;
	private BinaryTree leftTree;
	private BinaryTree rightTree;
	private int depth; 

	public BinaryTree()
	{
		this(0); 
	}
	public BinaryTree(int depth)
	{
		this.isEmpty = true;
		this.leftTree = null;
		this.rightTree = null;
		this.depth = depth; 
	}

	public boolean search(int value)
	{
		if(value == this.payload)
		{
			return true; 
		}
		else if (value < this.payload)
		{
			if(this.leftTree == null)
			{
				return false; 
			}
			else 
			{
				return this.leftTree.search(value); 
			}
		}
		else if (value > this.payload)
		{
			if(this.rightTree == null)
			{
				return false; 
			}
			else 
			{
				return this.rightTree.search(value); 
			}
		}
		return false; 

	}



	private void visitInOrder()
	{
		if(this.leftTree != null)
		{
			this.leftTree.visitInOrder();
		}
		System.out.println(this.payload);
		if(this.rightTree != null)
		{
			this.rightTree.visitInOrder();
		}
	}

	public void displayInOrder()
	{
		System.out.println("**** In Order ****");
		if(this.isEmpty)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			this.visitInOrder();
		}
	}

	private void visitPreOrder()
	{
		System.out.println(this.payload);
		if(this.leftTree != null)
		{
			this.leftTree.visitPreOrder();
		}
		if(this.rightTree != null)
		{
			this.rightTree.visitPreOrder();
		}
	}

	public void displayPreOrder()
	{
		System.out.println("**** Pre Order ****");
		if(this.isEmpty)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			this.visitPreOrder();
		}
	}

	private void visitPostOrder()
	{
		if(this.leftTree != null)
		{
			this.leftTree.visitPostOrder();
		}
		if(this.rightTree != null)
		{
			this.rightTree.visitPostOrder();
		}
		System.out.println(this.payload);
	}

	public void displayPostOrder()
	{
		System.out.println("**** Post Order ****");
		if(this.isEmpty)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			this.visitPostOrder();
		}
	}
	public int getMaxDepth()
	{
		if(this.leftTree == null && this.rightTree == null)
		{
			return this.depth;
		}
		else if(this.leftTree == null)
		{
			return this.rightTree.getMaxDepth();
		}
		else if(this.rightTree == null)
		{
			return this.leftTree.getMaxDepth();
		}
		else
		{
			return Math.max(this.leftTree.getMaxDepth(), this.rightTree.getMaxDepth());
		}
	}

	public boolean isBalanced()
	{
		if(this.isEmpty)
		{
			return true;
		}
		else
		{
			//boolean-expr?true-val:false-val
			int currMaxLeftDepth = this.leftTree == null?0:this.leftTree.getMaxDepth();
			int currMaxRightDepth = this.rightTree == null?0:this.rightTree.getMaxDepth();
			System.out.println("Max Left = " + currMaxLeftDepth);
			System.out.println("Max Right = " + currMaxRightDepth);
			return Math.abs(currMaxLeftDepth - currMaxRightDepth) <= 1;
		}
	}
	public void rebalance()
	{
		int currMaxLeftDepth = this.leftTree == null?0:this.leftTree.getMaxDepth();
		int currMaxRightDepth = this.rightTree == null?0:this.rightTree.getMaxDepth();
		int depthDiff = (currMaxLeftDepth - currMaxRightDepth);
		if(depthDiff == 2)
		{
			if(currMaxLeftDepth >= currMaxRightDepth)
			{
				this.rightTree = this.leftTree; 
			}
			else 
			{
				this.rightTree = this.leftTree; 
				this.rightTree = this.leftTree; 
			}
		}
		else if(depthDiff == -2)
		{
			if(currMaxRightDepth >= currMaxLeftDepth)
			{
				this.leftTree = this.rightTree; 
			}
			else
			{
				this.leftTree = this.rightTree; 
				this.leftTree = this.rightTree; 
			}
		}




	}

	public void add(int value)
	{

		if(this.isEmpty)
		{
			this.payload = value;
			this.isEmpty = false;
		}
		else
		{
			if(value <= this.payload)
			{
				if(this.leftTree == null)
				{
					this.leftTree = new BinaryTree(this.depth+1);	
				}
				this.leftTree.add(value);
			}
			else
			{
				if(this.rightTree == null)
				{
					this.rightTree = new BinaryTree(this.depth+1);
				}
				this.rightTree.add(value);
			}
		}




	}
}
