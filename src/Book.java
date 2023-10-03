import java.util.Objects;

public class Book extends Item {

	private String title;
	private String content;
	
	public Book(String title) {
		this.content = "";
		this.title = title;
	}
	
	public Book(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	@Override
	public void use() {
		System.out.println("Reading.");
		System.out.println(getContent());
	}
	
	public void yeet() {
		System.out.println("You threw a book. It was mildy effective...");
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Book)) {
			return false;
		}
		final Book otherBook = (Book) obj;
		return this.title.equals(otherBook.title) && this.content.equals(otherBook.content);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.title, this.content);
	}
	

}