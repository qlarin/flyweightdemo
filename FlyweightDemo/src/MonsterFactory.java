import java.util.HashMap;


public class MonsterFactory {

	private static final HashMap<String, Monster> wolfMap = new HashMap();
	
	public static Monster getWolf(String form){
		Wolf wolf = (Wolf) wolfMap.get(form);
		
		if(wolf == null){
			wolf = new Wolf(form);
			wolfMap.put(form,  wolf);
			System.out.println(form + " wolf has appeared!");
		}
		return wolf;
	}
}
