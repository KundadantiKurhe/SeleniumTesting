import org.testng.annotations.BeforeMethod;

public class PS {
	public void doThis() {
		System.out.println("I am here");
	}
	
	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first");
	}
	
	public static void main(String[] args) {
		PS2 ps2 = new PS2(3);   // constructor
		int a = 3;
		System.out.println(ps2.increment(a));
	}
}
