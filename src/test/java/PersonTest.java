import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p=new Person("Tesfa", "Mers", 30, 'M');
	@Test
	public void testFirstName() {
p.setFirstName("Senay");
assertEquals(p.getFirstName().equals("Senay"),true);
	}
	@Test
	public void testLastName() {
		p.setLastName("Mersie");
		assertEquals(p.getLastName().equals("Mersie"),true);
			}
	@Test
	public void testAge() {
p.setAge(31);
//assertTrue(p.getAge()==31);
assertEquals(p.getAge(),31);
	}
	@Test
	public void testGender() {
	p.setGender('M');
//assertTrue(p.getGender()=='M');
assertEquals(p.getGender(),'M');
	
	}
}
