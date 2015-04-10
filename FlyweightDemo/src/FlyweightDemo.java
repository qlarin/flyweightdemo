
public class FlyweightDemo {

	private static final String forms[] = {"Normal", "Elite"};
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++){
			Wolf wolf = (Wolf)MonsterFactory.getWolf(getRandomForm());
			wolf.setX(getRandomX());
			wolf.setY(getRandomY());
			wolf.spawn();
		}

	}
	
	private static String getRandomForm(){
		return forms[(int)(Math.random()*forms.length)];
	}
	
	private static int getRandomX(){
		return (int)(Math.random()*300);
	}
	private static int getRandomY(){
		return (int)(Math.random()*100);
	}

}
