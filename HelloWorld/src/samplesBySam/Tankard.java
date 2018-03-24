package samplesBySam;

public class Tankard extends Cup {

	public Tankard(boolean filled, int capacity, String color, String contents, String design) {
		super(filled, capacity, color, contents);
		this.filled = filled;
		this.capacity = capacity;
		this.color = color;
		this.contents = contents;
		this.design = design; // idea is you call print("it is a ... with a "+tankard.design);
	}

	public Tankard() {
		// TODO Auto-generated constructor stub
	}
	public void sip(int gulp) {
		if (capacity>0) {
			System.out.println("You chug that tankard like a champion.");
			capacity=capacity-gulp;
			if (capacity<0){
				capacity = 0;
			}
		}
	}
}
