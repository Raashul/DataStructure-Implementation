public class Node {
	Node left, right;

	int data;

	public Node(int data){
		this.data = data;
		left = null;
		right = null;

	}

	public void insert(int value) {
		if(value <= data){
			if(left == null){
				left = new Node(value);
			}else{
				left.insert(value);
			}
		}else{
			if(right == null){
				right = new Node(value);
			}else{
				right.insert(value);

			}
		}

	}

	public  boolean contains(int value){
		if(value == data){
			return true;
		}else if(value <=data){
			if(left == null){
				return false;
			}else{
				left.contains(value);

			}

		}else{
			if(right == null){
				return false;
			}else if(value > data){
				if(right == null){
					return false;
				}else{
					right.contains(value);
				}
			}
		}

		return false;

	}


	public void printInorder(){
		if(left !=null){
			left.printInorder();
		}
		System.out.println(data);
		if(right != null){
			right.printInorder();
		}
		System.out.println(data);
	}
}










