package samplesBySam;
// The cup class should be inherited later by Mug, Tankard, Jug, etc.
public class Cup {
	protected int capacity;
	protected boolean filled;
	protected String color, contents;
	protected String token = "a";
	protected String design;
	public Cup(boolean filled, int capacity, String color, String contents){ // specify constructor
		this.capacity = capacity;
		this.filled = filled;
		this.color =  color;
		this.contents = contents;
		System.out.println("[Cup created successfully]");
	}
	public Cup(){ // unspecified new cup.
		this.setCapacity(0);
		this.setColor("beige");
		this.setFilled(false);
		System.out.println("[Unspecified new Cup created successfully]");
	}
	public void description() {
		if (!filled) {
			System.out.println("I'm an empty "+color+" cup.");
		}
		else {
			System.out.println("A(n) "+color+" cup with a "+design+" It Holds "+capacity+" ml of something.");
		}
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setFilled(boolean f) {
		filled = f;
	}
	public boolean getFilled() {
		return filled;
	}
	public void setCapacity(int c) {
		capacity = c;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setContents(String c) {
		contents = c;
	}
	public String getContents(String pass) {
		if (pass.equals(token)) {
			return contents;
		}
		return "error! Wrong password.";
	}
	public void sip(int gulp) {
		if (capacity>0) {
			System.out.println("Thou drinkest from thy cup.");
			capacity=capacity-gulp;
			if (capacity<0){
				capacity = 0;
			}
		}
		else {
			System.out.println("The cup is bone dry.");
		}
	}
}
