package edu.ifpb.dac.controller;

import edu.ifpb.dac.Pedido;
import edu.ifpb.dac.Produto;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @brief Classe ControladorPedido
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date   19/03/2018
 */
@Named
@SessionScoped
public class ControladorPedido implements Serializable{
    
    public List<Produto> produtos;
    public Pedido pedido = new Pedido();
    
    @PostConstruct
    public void metodoPostConstruct(){
        
    }
    
}
