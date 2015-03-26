
<<<<<<< HEAD
public class Driver 
{

=======
public class Driver {
	
>>>>>>> bdc439b1d5102b46de2d8cb5417e5f9c51015d23
	public static void main(String[] args) 
	{
		BinaryTree bt = new BinaryTree();
		bt.add(2);
		bt.add(5);
		bt.add(7);
		bt.add(1);
		bt.add(0);
		bt.add(3);
		System.out.println("In order");
		bt.displayInOrder(bt.root);
		System.out.println("Post Order");
		bt.displayPostOrder(bt.root);

	}
<<<<<<< HEAD
=======

>>>>>>> bdc439b1d5102b46de2d8cb5417e5f9c51015d23
}
