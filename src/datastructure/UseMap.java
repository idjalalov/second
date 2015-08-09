package datastructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Use nested Map. Map<String, List<string>> list = new HAshMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		List<String> SpainTeams = new ArrayList<String>();
		SpainTeams.add("Real Madrid");
		SpainTeams.add("Barcelona");
		SpainTeams.add("Benfica");
		
		
		List<String> EnglandTeams = new ArrayList<String>();
		EnglandTeams.add("Arsenal");
		EnglandTeams.add("Chelsea");
		EnglandTeams.add("Mancester United");
		
		List<String> ItalianTeams = new ArrayList<String>();
		ItalianTeams.add("Milan");
		ItalianTeams.add("Juventus");
		ItalianTeams.add("Inter");
		
		
		
		Map<String, List<String>> country = new LinkedHashMap<String, List<String>>();
		
		country.put("Spain", SpainTeams);
		country.put("England", EnglandTeams);
		country.put("Italy", ItalianTeams);
		
		for(Entry<String, List<String>> key:country.entrySet()){
			
			System.out.println(key.getKey()+ "---->"+ key.getValue());
		}

		
	}

}
