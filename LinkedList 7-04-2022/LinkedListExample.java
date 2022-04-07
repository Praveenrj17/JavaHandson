import java.util.LinkedList;
public class LinkedListExample {
	void example()
	{
		    LinkedList<String> l= new LinkedList<>();
	        l.add("Audi");
	        l.add("Ford");
	        l.add("Benze");
	        l.add("Rolls Royce");
	        l.add("Lambogini");
	        System.out.println("The Element Before Removal: " +l);
	        l.remove(0);
	        System.out.println("After the Removal: "+l);	        
	}

	public static void main(String[] args) {
		LinkedListExample h = new LinkedListExample();
		h.example();      
	}

}
