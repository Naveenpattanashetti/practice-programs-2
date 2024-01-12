package demo.java;

class Computer {
	// NON RETURN TYPE METHOD////
	public void playmusic() {
		System.out.println("playing music..............");

	}

	// RETURN TYPE METHOD////
	public String getpen(int cost) {
		if (cost >= 10)
			return "pen";
		else
			return "nothing";
	}

}

public class OppsConcept {

	public static void main(String[] args) {

		Computer com = new Computer(); /// "COM" IS A REFRENCE VARIABLE// NEW IS CREATING A OBJECT
		com.playmusic();
		String str = com.getpen(5);
		System.out.println(str);
	}

}
