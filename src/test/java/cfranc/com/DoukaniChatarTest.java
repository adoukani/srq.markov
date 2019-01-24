package cfranc.com;

import static org.junit.Assert.*;

import java.util.*;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class DoukaniChatarTest {
	
	@Test
	public void test_Il_Etait_Une___Etait_Une_Fois() {
		Couple c1 = new Couple("Il", "était");
		Couple c2 = new Couple("était", "une");
		Couple c3 = new Couple("une", "fois");
		List<String> list1 = new ArrayList<String>();
		list1.add("une");
		Markov m1 = new Markov();
		m1.couples.put(c1, list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("fois");
		//Markov m2 = new Markov();
		m1.couples.put(c2, list2);
		
		assertEquals(2, m1.couples.size());

		
	}

	
	@Test
	public void test_hashcode_Il_Etait() {
		
		String mot1 = "Il";
		String mot2 = "était";
		Couple c1 = new Couple(mot1, mot2);
		assertEquals(mot1.hashCode()+mot2.hashCode(), c1.hashCode());
		
	}
	
	
	@Test
	public void test_generateText_Il_Etait_Une() {
		Couple c1 = new Couple("Il", "était");
		Couple c2 = new Couple("était", "une");
		List<String> list1 = new ArrayList<String>();
		list1.add("une");
		Markov m1 = new Markov();
		m1.couples.put(c1, list1);
		String s = new String(generateText(c1, 3));
		
		assertEquals("Il était une", s);
		
		
		
	}
	
	

}
