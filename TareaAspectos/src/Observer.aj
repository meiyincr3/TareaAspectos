import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public aspect Observer {
	
	Map<Color, String> getConfig(){
    	Map<Color,String> result = new HashMap<>();
    	result.put(new Color(0, 232, 228), "Cyan Background");
    	result.put(new Color(219, 159, 255), "Purple Background");
    	result.put(new Color(255, 159, 235), "Pink Background");
    	return result;
}
	Map<Color, String> mapC = getConfig();
	
	pointcut cambio (Color color) : args(color) && call(* changeColor*(..));
	after (Color color): cambio (color){
		System.out.println(mapC.get(color));
	}
	
	
	
}


	
