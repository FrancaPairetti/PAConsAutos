package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Auto;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Importacion;
import com.example.demo.modelo.Marca;
import com.example.demo.modelo.Modelo;


public interface IMarcaService {
	
	//Marca
	public List<Marca>listar();
	public Optional<Marca>listarId(int id);
	public int save(Marca m);
	public void delete(int id);
	
	//Modelo
	public List<Modelo>listarModelo();
	public Optional<Modelo>listarModeloId(int id);
	public int saveModelo(Modelo mod);
	public void deleteModelo(int id);
	
	//Importacion
	public List<Importacion>listarImp();
	public Optional<Importacion>listarImpId(int id);
	public int saveImp(Importacion imp);
	public void deleteImp(int id);
	
	
	//Cliente
	public List<Cliente>listarCliente();
	public Optional<Cliente>listarClienteId(int id);
	public int saveCliente(Cliente cliente);
	public void deleteCliente(int id);
	
	//AUTO
	public List<Auto>listarAuto();
	public Optional<Auto>listarAutoId(int id);
	public int saveAuto(Auto auto);
	public void deleteAuto(int id);
}
