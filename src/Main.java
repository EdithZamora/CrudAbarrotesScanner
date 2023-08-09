import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaracion de variables
		long codigoBarras;
		String nombre;
		String marca;
		float precio;
		float existencia;
		int status;

		// reserva de spacio en memoria
		Productos producto = null;
		// Scanner es una libreria ---es un conjunto de clases desarrollado por alguien
		// mas para que nuestra aplicación funcione correctamente
		Scanner lectura = null;

		// declarar la lista
		List<Productos> list = new ArrayList<Productos>();
		int menu, indice, submenu;
		do {
			System.out.println("Menu principal");
			System.out.println("1.- Alta");
			System.out.println("2.- buscar");
			System.out.println("3.- Editar");
			System.out.println("4.- Eliminar");
			System.out.println("5.- Mostrar");
			System.out.println("6.- Contar");
			System.out.println("7.- Vaciar");

			System.out.println("8.- Buscar por nombre");
			System.out.println("9.- eliminar por nombre");

			System.out.println("10.- Salir");

			lectura = new Scanner(System.in);
			menu = lectura.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Ingrese el codigo de barra");
				lectura = new Scanner(System.in);
				codigoBarras = lectura.nextLong();

				System.out.println("Ingrese el nombre");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Ingrese la marca");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				System.out.println("Ingrese el precio");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				System.out.println("Ingrese existencia");
				lectura = new Scanner(System.in);
				existencia = lectura.nextFloat();

				System.out.println("Ingrese el status");
				lectura = new Scanner(System.in);
				status = lectura.nextInt();

				// agregar
				producto = new Productos(codigoBarras, nombre, marca, precio, existencia, status);
				list.add(producto);
				break;
			case 2:
				System.out.println("Ingrese la posicion que desee buscar");
				for (int i = 0; i < list.size(); i++) {
					System.out.printf("\n[%d]" + list.get(i).getNombre(), i);
				}
				System.out.println("Ingrese el indice a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Buscar por indice
				producto = list.get(indice);
				System.out.println("Se encontro el producto: " + producto.getNombre());

				break;
			case 3:
				// posiciones
				System.out.println("posisciones en la lista");
				for (int i = 0; i < list.size(); i++) {
					System.out.printf("\n[%d]" + list.get(i).getNombre(), i);
				}

				System.out.println("\n Ingrese el indice a editar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				// buscar por indice
				producto = list.get(indice);
				// busca por codigo de barra
				System.out.println("se encontro producto a editar" + producto.getCodigoBarras());

				do {
					System.out.println("submenu a editar");
					System.out.println("1.- Nombre");
					System.out.println("2.- precio");
					System.out.println("3.- regresar al menu principal");
					lectura = new Scanner(System.in);
					submenu = lectura.nextInt();

					switch (submenu) {
					case 1:
						System.out.println("Ingrese el nuevo nombre");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();

						// Editamos
						producto.setNombre(nombre);
						list.set(indice, producto);
						System.out.println("Se edito correctamente: " + producto.getNombre());
						break;
					case 2:

						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();

						// Editamos
						producto.setPrecio(precio);
						list.set(indice, producto);
						System.out.println("Se edito correctamente el precio: " + producto.getPrecio());

						break;
					case 3:

						break;
					default:
						System.out.println("no se encontro la opción");
						break;
					}
				} while (submenu < 3);

				break;
			case 4:
				// eliminar por medio del indice pero primero se hace la busqueda
				System.out.println("posisciones en la lista");
				for (int i = 0; i < list.size(); i++) {
					System.out.printf("\n[%d]" + list.get(i).getNombre(), i);
				}

				System.out.println("\n Ingrese el indice a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				// buscar registro
				producto = list.get(indice);
				// eliminar registro por indice
				list.remove(indice);
				System.out.println("Se elimino el producto" + producto.getNombre());

				break;
			case 5:
				// mostrar
				System.out.println(list);

				break;
			case 6:
				// contar el numero de productos en la tienda
				System.out.println("productos en la tienda: " + list.size());

				break;
			case 7:
				// borrar los registros de una lista
				list.clear();

				break;
			case 8:
				//buscar por nombre 
				
				System.out.println("Ingrese el nombre que desee buscar");
				for (int i = 0; i < list.size(); i++) {
					System.out.printf("\n[%d]" + list.get(i).getNombre(), i);
				}
				System.out.println("Ingrese el nombre a buscar");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				// Buscar por nombre
				
				for(Productos p: list) {
					if(p.getNombre().equals(nombre)) {
						
						System.out.println("Se encontro el producto: " + p.getNombre());
					}
			
					
				
				}		

				break;
			case 9:
				// eliminar por nombre se hace la busqueda

				System.out.println("posisciones en la lista");
				for (int i = 0; i < list.size(); i++) {
					System.out.printf("\n[%d]" + list.get(i).getNombre(), i);
				}

				System.out.println("\n Ingrese el nombre a eliminar");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				// eliminar registro por nombre
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).getNombre().equals(nombre)) {
						System.out.println("Se elimino el producto: " + list.get(i).getNombre());
						list.remove(i);
						
					}
				
				}
				break;
			case 10:
				System.exit(0);

				break;
			default:
				System.out.println("no se encontro la opción");
				break;
			}
		} while (menu < 10);

	}

}
