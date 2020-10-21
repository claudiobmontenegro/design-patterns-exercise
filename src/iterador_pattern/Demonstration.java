package iterador_pattern;

public class Demonstration {
	public static void main(String[] args) {
		CollectionofNames cmpnyRepository = new CollectionofNames();

		for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
