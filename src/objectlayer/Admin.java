package objectlayer;

public class Admin extends User {

	public Admin(String fname, String lname, String email, String pwd, Status status) {
		super(fname, lname, email, pwd, status, UserType.ADMIN);
	}
	
	public int addBook(Book b) {
		return getPersist().addBook(b);
	}
		
}