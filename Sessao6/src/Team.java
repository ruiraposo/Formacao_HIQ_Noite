
public class Team {
	
	private final int id;
	private String name;
	
	public Team ( int id ){
		this.id = id;
	}
	
	public Team ( int id, String name ){
		this(id); // invoca o construtor de cima,  e é sempre a primeira instrução para invocar o constructor
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
