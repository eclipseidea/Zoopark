package zoo_club;

public class Animals /* implements List<Animals> */{

	private String type;
	private String name;

	public Animals(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{type=" + type + ", name=" + name + "}";
	}
}
