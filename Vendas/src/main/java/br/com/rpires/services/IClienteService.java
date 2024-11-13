/**
 * 
 */
package main.java.br.com.rpires.services;

import main.java.br.com.rpires.domain.Cliente;
import main.java.br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
