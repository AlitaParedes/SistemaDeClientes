package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.CategoriaEnum;
import modelo.Cliente;

public class ClienteServicio {
	private List<Cliente> listaClientes;

	public ClienteServicio(List<Cliente> listaClientes) {
		this.listaClientes = new ArrayList<Cliente>();
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void listarClientes() {
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.toString());
		}
	}

	public void agregarCliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosCliente,
			CategoriaEnum nombreCategoria) {
		Cliente cliente = new Cliente(runCliente, nombreCliente, apellidoCliente, aniosCliente, nombreCategoria);
		listaClientes.add(cliente);
	}

	public void editarCliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosCliente,
			CategoriaEnum nombreCategoria) {
	}
}
