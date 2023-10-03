import java.util.Objects;

public class Book extends Item {
	private String content;
	
	public Book(String title) {
		super(title);
		this.content = "";
	}
	
	public Book(String title, String content) {
		super(title);
		this.content = content;
	}
	public Book(String title, String content, boolean isQuestItem) {
		super(title, isQuestItem);
		this.content = content;
	}
	
	@Override
	public void use() {
		System.out.println("Reading.");
		System.out.println(getContent());
	}
	
	@Override
	public boolean yeet() {
		if(!isQuestItem()) {
			System.out.println("You yeeted a book. It was mildy effective...");
			return true;
		}else {
			return super.yeet();
		}
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
		return super.equals(obj) && this.content.equals(otherBook.content);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(this.content);
	}
	

}