package vista;

import java.util.Scanner;

import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;

public class Menu extends ClienteServicio{
	private ClienteServicio clienteServicio;
	private ArchivoServicio archivoServicio;
	private ExportadorCsv exportadorCsv;
	private ExportadorTxt exportadorTxt;
	private String fileName = "Clientes"; //para exportar el archivo
	private String fileName1 = "DBClientes.csv";//para importar el archivo
	private Scanner valores = new Scanner(System.in);

}
