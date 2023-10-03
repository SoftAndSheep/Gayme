
public abstract class Item {
	
	private int count;
	
	public Item() {
		count = 0;
	}
	
	public Item(int count) {
		this.count = count;
	}
	
	public abstract void use();
	
	public void addItems(int add) {
		count += add;
	}
	
	public void removeItems(int remove) {
		count -= remove;
		if(count < 0) {
			count = 0;
		}
	}
	
	public int getCount() {
		return count;
	}

}
