
public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;

	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	String getMaster() {
		return master;
	}

	void setMaster(String master) {
		this.master = master;

	}

	int getEyes() {
		return eyes;
	}

	void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;

	}

}
