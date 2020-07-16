public class Cache {
	private static int MAX_CAPACITY = 0;
	static int count = 0;
	// Implement static block

	static int getMaxCapacity() {
		++count;
		if(count == 1) {
			System.out.print("Enter Max capacity : ");
			int capacity = Console.readInt();
			MAX_CAPACITY = capacity;
		}
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
	}
}