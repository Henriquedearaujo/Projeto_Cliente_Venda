/**
 * 
 */
package main.java.br.com.rpires.dao;

import main.java.br.com.rpires.dao.generic.IGenericDAO;
import main.java.br.com.rpires.domain.Venda;
import main.java.br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
