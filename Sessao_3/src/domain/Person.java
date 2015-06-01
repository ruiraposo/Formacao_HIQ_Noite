package domain;

public class Person {
	
	private String name;
	private int age;
	
	public Person ( String nome, int age ) {
		setName( nome); // é uma boa pratica porque podemos ter logica associada no setters
		setAge( age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome; // o this é a referencia para a própria instancia
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age*10;
	}

}
