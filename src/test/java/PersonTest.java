import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	@Test
	public void test() {
Person p=new Person("Senay", "Mersie", 30, 'M');
assertEquals(p.getFirstName().equals("Senay"),true);

	}

}
