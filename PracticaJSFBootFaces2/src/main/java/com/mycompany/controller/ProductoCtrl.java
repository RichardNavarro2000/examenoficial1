/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.model.Producto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class ProductoCtrl implements Serializable  {
    private Producto selected;
    private boolean est;
    ProductoDAO pdao;
    private ArrayList<Producto> list = new ArrayList<>();
    
    public ProductoCtrl() {
        this.selected = new Producto();
        this.pdao = new ProductoCtrlImpl();
    }
    
    public void createProducto(){
        if(pdao.createProducto(selected)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    public ArrayList<Producto> getList(){
    //pdao = new ProductoCtrlImpl();
    list = pdao.readProducto();
    return list;
            
    }
    public void updateProducto(Producto p){
      System.out.println("Producto = "+p.getNombre()+p.getDescripcion()+p.getCodigo());  
    if(pdao.updateProducto(p)){
        System.out.println("actualizado");
    }else{
    System.out.println("error al momento de actualizar");
    }
    }
    
    public void deleteProducto(String id){
    if(pdao.deleteProducto(id)){
    System.out.println("elimado"+id);
    }else{
    System.out.println("error al momento de eliminar");
    }
    }

    public Producto getSelected() {
        return selected;
    }

    public void setSelected(Producto selected) {
        this.selected = selected;
    }
    
}
