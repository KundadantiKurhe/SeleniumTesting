
public class PS2 extends PS3 {
	int a;
	
	public PS2(int a){  // Parameterized constructor
		super(a);
		this.a = a; 
	}
	
	public int increment(int a2){
		a = a+1;
		return a;
	}
	
	public int decrement(){
		a = a-1;
		return a;
	}
}
