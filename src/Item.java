
public abstract class Item {
	
	private boolean isQuestItem;
	private String name;
	
	public abstract void use();
	
	public Item(String name) {
		this.name = name;
		this.isQuestItem = false;
	}
	
	public Item(String name, boolean isQuestItem) {
		this.name = name;
		this.isQuestItem = isQuestItem;
	}
	
	public boolean yeet() {
		if(!isQuestItem) {
			System.out.println("You yeeted. It was mildy effective...");
			return true;
		} else {
			System.out.println("You shall not yeet the unyeetable");
			return false;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isQuestItem() {
		return isQuestItem;
	}

	public void setQuestItem(boolean isQuestItem) {
		this.isQuestItem = isQuestItem;
	}

	
}
