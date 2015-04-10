
public class Wolf implements Monster{

	private String form;
	private int x, y;
	
	@Override
	public void spawn() {
		System.out.println(form + " monster has spawned, location: [ " + x + ", " + y + " ]");
		
	}
	
	public Wolf(String form){
		this.form = form;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
}
