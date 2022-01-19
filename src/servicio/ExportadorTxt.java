package servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import modelo.Cliente;

public class ExportadorTxt extends Exportador {

	@Override
	public void metodoExportador(String fileName, List<Cliente> listaClientes) {
		Scanner sc = new Scanner(System.in);
		ClienteServicio clienteServicio = new ClienteServicio(listaClientes);
		System.out.println("Ingrese la ruta donde desea exportar el archivo clientes.txt");
		String ruta = sc.next();
		File directorio = new File(ruta);
		File archivo = new File(ruta + "/DBClientes.txt");
		try {
			directorio.mkdirs();
			archivo.createNewFile();
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			listaClientes = clienteServicio.getListaClientes();
			for (int i = 0; i < listaClientes.size(); i++) {
				bw.write(listaClientes.get(i).toString());
				bw.newLine();
			}
			bw.close();
			System.out.println("Datos exportados correctamente en formato .txt");
			System.out.println("-----------------------------------");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Los parámetros ingresados no corresponden");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se pudo escribir el archivo");
		}
		sc.close();
	}

}
