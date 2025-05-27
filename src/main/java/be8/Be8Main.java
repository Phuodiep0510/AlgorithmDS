package be8;

public class Be8Main {
	public static void main(String[] args) {
		

			String message = "Hello, World!";
			int length = message.length();
			char firstChar = message.charAt(0);
			String sub = message.substring(7);
			String sub2 = message.substring(7, 12);
			int index = message.indexOf("World");
			boolean starts = message.startsWith("Hello");
			String lower = message.toLowerCase();

			System.out.println("Length: " + length);
			System.out.println("First char: " + firstChar);
			System.out.println("Substring: " + sub);
			System.out.println("Substring 2: " + sub2);
			System.out.println("Index of 'World': " + index);
			System.out.println("Starts with 'Hello': " + starts);
			System.out.println("Lowercase: " + lower);
		}
}