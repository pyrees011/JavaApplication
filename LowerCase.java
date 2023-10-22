package demo;

import java.util.ArrayList;
import java.util.List;

public class LowerCase {
	
	List<String> couleurs = new ArrayList<String>();
	public void lowercase() {
		
		    couleurs.add("Orange");
		    couleurs.add("BlUe");
		    couleurs.add("PINK");
		for(String i : couleurs) {
			System.out.print(i.toLowerCase() + "\n");
		}
		
	}
}
