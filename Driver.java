import java.util.Random;



public class Driver {
	

	public static void main(String[] args) throws Exception
	{
		Random r = new Random(); 
		BinaryTree bt = new BinaryTree();
		for(int i = 0; i < 5000; i++)
		{
		
			bt.add(r.nextInt());
			bt.rebalance();
			
		}
		System.out.println(bt.getMaxDepth()); 
		System.out.println(bt.isBalanced()); 
		bt.displayInOrder();
		
		
		
		
	}

}
