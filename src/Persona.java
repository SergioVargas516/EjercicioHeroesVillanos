public class Persona
{

	private String name, city;
	private int edad;
	
	
	public Persona(String name, String city, int edad) {
		super();
		this.name = name;
		this.city = city;
		this.edad = edad;
	}

	
	
	@Override
	public String toString()
	{
		return "Nombre=" + name + "\nCiudad=" + city + "\nEdad=" + edad;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
