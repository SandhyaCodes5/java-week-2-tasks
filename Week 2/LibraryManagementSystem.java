package myPackage;
import java.util.ArrayList;
import java.util.List;
class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean available;
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public boolean getAvailable() {
		return available;
	}
}
abstract class User {
	private int userId;
	private String name;
	User (int userId, String name){
		this.userId = userId;
		this.name = name;
	}
	abstract void displayUserDetails(); 
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
}
class StudentUser extends User{
	private String course;
	StudentUser(String name, int userId, String course) {
		super(userId, name);
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void displayUserDetails() {
		System.out.println("User name: " + getName());
		System.out.println("User id: " + getUserId());
		System.out.println("Course: " + course);
	}
	
}
class Library {
	private List<Book> books = new ArrayList<>();
	public void addBook(Book book) {
		books.add(book);
		System.out.println("A book is added in the library");
	}
	public void borrowBook(int bookId) { 
		boolean found = false;
		for (Book book: books) {
			if(book.getBookId() == bookId) {
				found = true;
				if(book.getAvailable()) {
					book.setAvailable(false);
					System.out.println("Borrowed successfully");
				} else {
					System.out.println("Already borrowed");
				}
			}
		}
		if (!found) {
			System.out.println("Book id doesn't match");
		}
	}
	public void returnBook(int bookId) {
		boolean found = false;
		for(Book book : books) {
			if(book.getBookId() == bookId){
				found = true;
				if(book.getAvailable()) {
					System.out.println("Book is already available");
				}else {
					book.setAvailable(true);
					System.out.println("Book is now available");
				}
			}
		}
		if(!found) {
			System.out.println("Book id doesn't match");
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Book b = new Book();
		User u= new StudentUser("Sandhya",12,"B.Tech");
		Library l = new Library();
		b.setBookId(234);
		b.setTitle("Merchant of Venice");
		b.setAuthor("William Shakespeare");
		b.setAvailable(true);
		System.out.println(b.getBookId());
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getAvailable());
		u.displayUserDetails();
		l.addBook(b);
        l.borrowBook(234);
        l.returnBook(234);
	}

}
