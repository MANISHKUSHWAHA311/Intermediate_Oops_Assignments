package oopsAssignment;

abstract class Persistence{
	abstract public String persist();
}
class FilePersistence extends Persistence{
	public String persist() {
		return "I am a persist method in class FilePersistence";
	}
}

class DatabasePersistence extends Persistence{
	public String persist() {
		return "I am a persist method in class DatabasePersistence";
		
	}
}


public class Assignment2Q6 {
	public static void main(String []args) {
		Persistence file = new FilePersistence();
		System.out.println(file.persist());
		
		Persistence database=new DatabasePersistence();
		System.out.println(database.persist());

	}

}
