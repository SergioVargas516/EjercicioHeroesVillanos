import java.util.Scanner;
public class Main 
{
	public static void menu()
	{
		System.out.println("Opciones del programa");
		System.out.println("1. Crear Heroes");
		System.out.println("2. Crear Villanos");
		System.out.println("3. Mostrar Heroes");
		System.out.println("4. Mostrar Villanos");
		System.out.println("-1. Para salir del programa");
	}

	public static void main(String[] args)
	{
		int llave = 0;	
		int cantidad =  0;
		Scanner entrada = new Scanner(System.in);
		Persona p1 = new Persona(null, null, 0);
		Hero_Villan hero1 = new Hero_Villan(null, null, args);				
		Persona p2 = new Persona(null, null, 0);
		Hero_Villan hero2 = new Hero_Villan(null, null,args);
		Persona p3 = new Persona(null, null, 0);
		Hero_Villan villan1 = new Hero_Villan(null, null,args);
		Persona p4 = new Persona(null, null, 0);		
		Hero_Villan villan2 = new Hero_Villan(null, null,args);
		do 
		{
			menu();		
			System.out.println("Ingrese su eleccion: ");		
			llave =entrada.nextInt();
			
			switch(llave)
			{
			//Tomar datos
			case 1: 
				
				System.out.println("1. Crear Heroe #1");
				System.out.println("2. Crear Heroe #2");
				System.out.println("Ingrese su eleccion: ");		
				llave =entrada.nextInt();
				switch(llave)
				{
				case 1: 
					//Heroe #1
					System.out.println("Ingrese los siguientes datos.");
					System.out.println("El nombre real del Heroe: ");
					p1.setName(entrada.nextLine());
					System.out.println("Su edad: ");
					p1.setEdad(entrada.nextInt());
					System.out.println("La ciudad a la que pertenece: ");
					p1.setCity(entrada.nextLine());
					
					System.out.println("El nombre de pila del Heroe: ");
					hero1.setFakeName(entrada.nextLine());
					System.out.println("Franquicia a la que pertenece: ");
					hero1.setFranquicia(entrada.nextLine());
					System.out.println("Numero de habilidades: ");
					cantidad=entrada.nextInt();
					System.out.println("Sus habilidades especiales: ");
					for (int i = 0; i < cantidad; i++) 
					{
			            System.out.print("Ingrese el poder " + (i + 1) + ": ");
			            //hero1.setPowers(new String [i], entrada.nextLine());
			            
			        }
											
					break;
					
				case 2:
					//Heroe #2
					
					System.out.println("Ingrese los siguientes datos.");
					System.out.println("El nombre real del Heroe: ");
					p2.setName(entrada.nextLine());
					System.out.println("Su edad: ");
					p2.setEdad(entrada.nextInt());
					System.out.println("La ciudad a la que pertenece: ");
					p2.setCity(entrada.nextLine());
					
					System.out.println("El nombre de pila del Heroe: ");
					hero2.setFakeName(entrada.nextLine());
					System.out.println("Franquicia a la que pertence");
					hero2.setFranquicia(entrada.nextLine());
					System.out.println("Numero de habilidades: ");
					cantidad=entrada.nextInt();
					System.out.println("Sus habilidades especiales: ");
					for (int i = 0; i < cantidad; i++) 
					{
			            System.out.print("Ingrese el poder " + (i + 1) + ": ");
			            //hero2.setPowers(new String [i], entrada.nextLine());
			            
			        }
					
					break;
					
				default: 
					System.out.println("Opcion Invalida");
					System.out.println("Ingrese su eleccion: ");		
					llave =entrada.nextInt();
					break;
				
				}
				
				
			
			case 2:	

				System.out.println("1. Crear Villano #1");
				System.out.println("2. Crear Villano #2");
				System.out.println("Ingrese su eleccion: ");		
				llave =entrada.nextInt();
				
				switch(llave)
				{
				case 1:
					//Villano #1
					
					System.out.println("Ingrese los siguientes datos.");
					System.out.println("El nombre real del Villano: ");
					p3.setName(entrada.nextLine());
					System.out.println("Su edad: ");
					p3.setEdad(entrada.nextInt());
					System.out.println("La ciudad a la que pertenece: ");
					p3.setCity(entrada.nextLine());
					
					System.out.println("El nombre de pila del Villano: ");
					villan1.setFakeName(entrada.nextLine());
					System.out.println("Fanquicia a la que pertenece: ");
					villan1.setFranquicia(entrada.nextLine());
					System.out.println("Numero de habilidades: ");
					cantidad=entrada.nextInt();
					System.out.println("Sus habilidades especiales: ");
					for (int i = 0; i < cantidad; i++) 
					{
			            System.out.print("Ingrese el poder " + (i + 1) + ": ");
			            //villan1.setPowers(new String [i], entrada.nextLine());
			            
			        }
					
					break;
					
				case 2:
					//Villano #2
										
					System.out.println("Ingrese los siguientes datos.");
					System.out.println("El nombre real del Villano: ");
					p4.setName(entrada.nextLine());
					System.out.println("Su edad: ");
					p4.setEdad(entrada.nextInt());
					System.out.println("La ciudad a la que pertenece: ");
					p4.setCity(entrada.nextLine());
					
					System.out.println("El nombre de pila del Villano: ");
					villan2.setFakeName(entrada.nextLine());
					System.out.println("Franquicica a la que pertenece: ");
					villan2.setFranquicia(entrada.nextLine());
					System.out.println("Numero de habilidades: ");
					cantidad=entrada.nextInt();
					System.out.println("Sus habilidades especiales: ");
					for (int i = 0; i < cantidad; i++) 
					{
			            System.out.print("Ingrese el poder " + (i + 1) + ": ");
			            //villan2.setPowers(new String [i], entrada.nextLine());
			            
			        }
					
					break;
					
				default: 
					System.out.println("Opcion Invalida");
					System.out.println("Ingrese su eleccion: ");		
					llave =entrada.nextInt();
					break;	
				}
				
			//Mostrar datos
			case 3:
				
				System.out.println("1. Mostrar Heroe #1");
				System.out.println("2. Mostrar Heroe #2");
				System.out.println("Ingrese su eleccion: ");		
				llave =entrada.nextInt();
				switch(llave)
				{
				
				case 1:
					//Heroe #1					
					System.out.println("Datos Reales");
					System.out.println("**************");
					System.out.println("Nombre: "+ p1.getName());
					System.out.println("Edad: "+ p1.getEdad());
					System.out.println("Ciudad: "+ p1.getCity()+"\n");
					System.out.println("Datos de su alter ego");
					System.out.println("**************");
					System.out.println("Nombre: "+ hero1.getFakeName());
					System.out.println("Franquicia: "+ hero1.getFranquicia());
					System.out.println("Poderes: "+ hero1.getPowers());
					System.out.println("**************"+"\n");
					
					break;
					
				case 2:
					//Heroe #2
					System.out.println("Datos Reales");
					System.out.println("**************");
					System.out.println("Nombre: "+ p2.getName());
					System.out.println("Edad: "+ p2.getEdad());
					System.out.println("Ciudad: "+ p2.getCity()+"\n");
					System.out.println("Datos de su alter ego");
					System.out.println("**************");
					System.out.println("Nombre: "+ hero2.getFakeName());
					System.out.println("Franquicia: "+ hero2.getFranquicia());
					System.out.println("Poderes: "+ hero2.getPowers());
					System.out.println("**************"+"\n");
					
					break;
					
				default: 
					System.out.println("Opcion Invalida");
					System.out.println("Ingrese su eleccion: ");		
					llave =entrada.nextInt();
					break;
				}
				
				break;
				
			case 4:
				
				System.out.println("1. Mostrar Villano #1");
				System.out.println("2. Mostrar Villano #2");
				System.out.println("Ingrese su eleccion: ");		
				llave =entrada.nextInt();
				
				switch(llave)
				{
				case 1:
					//Villano #1
					System.out.println("Datos Reales");
					System.out.println("**************");
					System.out.println("Nombre: "+ p3.getName());
					System.out.println("Edad: "+ p3.getEdad());
					System.out.println("Ciudad: "+ p3.getCity()+"\n");
					System.out.println("Datos de su alter ego");
					System.out.println("**************");
					System.out.println("Nombre: "+ villan1.getFakeName());
					System.out.println("Franquicia: "+ villan1.getFranquicia());
					System.out.println("Poderes: "+ villan1.getPowers());
					System.out.println("**************"+"\n");
					
					break;
					
				case 2:
					//Villano #2
					System.out.println("Datos Reales");
					System.out.println("**************");
					System.out.println("Nombre: "+ p4.getName());
					System.out.println("Edad: "+ p4.getEdad());
					System.out.println("Ciudad: "+ p4.getCity()+"\n");
					System.out.println("Datos de su alter ego");
					System.out.println("**************");
					System.out.println("Nombre: "+ villan2.getFakeName());
					System.out.println("Franquicia: "+ villan2.getFranquicia());
					System.out.println("Poderes: "+ villan2.getPowers());
					System.out.println("**************"+"\n");
									
					break;
					
				default: 
					System.out.println("Opcion Invalida");
					System.out.println("Ingrese su eleccion: ");		
					llave =entrada.nextInt();
					break;
					
				}
				
				break;
				
			default: 
				System.out.println("Opcion Invalida");
				System.out.println("Ingrese su eleccion: ");		
				llave =entrada.nextInt();			
				break;				
			}
			
		}while(llave != -1 );
		
	}

}
