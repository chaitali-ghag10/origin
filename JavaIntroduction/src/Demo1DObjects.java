
public class Demo1DObjects {

	public static void main(String[] args) {
		Person[] persons = new Person[5];
		
		persons[0] = new Person(12," name1");
		persons[1] = new Person(13," name2");
		persons[2] = new Person(14," name3");
		persons[3] = new Person(14," name4");
		persons[4] = new Person(15," name5");
		
		for(Person p:persons) 
		{
			p.display();
		}
		

	}

}
