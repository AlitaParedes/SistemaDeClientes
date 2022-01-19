package servicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.CategoriaEnum;
import modelo.Cliente;

public class ArchivoServicio extends Exportador{
	
	public void cargarDatos (String fileName) {
		Scanner sc =new Scanner(System.in);
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente> ();
		ClienteServicio clienteServicio = new ClienteServicio(listaClientes);
		
		System.out.println("Ingresa la ruta donde se encuentra el archivo DBClientes.csv");
		String ruta = sc.nextLine();
		File archivo = new File(ruta+"/DBClientes.csv");
		if(archivo.exists()) {
			try {
				
				FileReader fileReader = new FileReader(archivo);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String line= bufferedReader.readLine();
				while(line!=null) {
					String[] arLine=line.split(",");
					Cliente cliente = new Cliente(arLine[0],arLine[1],arLine[2],arLine[3],arLine[4]);
					listaClientes.add(cliente);
					line=bufferedReader.readLine();
				}
				
				clienteServicio.setListaClientes(listaClientes);
			   bufferedReader.close();
			   System.out.println("Datos cargados correctamente en la lista");
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}else {
			//System.out.println("el archivo no existe");
		}
	}

	@Override
	public void metodoExportador(String fileName, List<Cliente> listaClientes) {
		
		
	}
	

}
