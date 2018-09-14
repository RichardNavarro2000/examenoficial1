/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.VentaCtrlImpl;
import com.mycompany.dao.VentaDAO;
import com.mycompany.model.Venta;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class VentaCtrl implements Serializable  {
    private Venta selected;
    private boolean est;
    VentaDAO vdao;
    private ArrayList<Venta> list = new ArrayList<>();
    
    public VentaCtrl() {
        this.selected = new Venta();
        this.vdao = new VentaCtrlImpl();
    }
    
    public void createVenta(){
        if(vdao.createVenta(selected)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    public ArrayList<Venta> getList(){
    //pdao = new ProductoCtrlImpl();
    list = vdao.readVenta();
    return list;
            
    }
    public void updateVenta(Venta v){
      System.out.println("Venta = "+v.getFecha()+v.getConcepto()+v.getIgv()+v.getTotal()+v.getSub_total());  
    if(vdao.updateVenta(v)){
        System.out.println("actualizado");
    }else{
    System.out.println("error al momento de actualizar");
    }
    }
    
    public void deleteVENTA(String id){
    if(vdao.deleteVenta(id)){
    System.out.println("elimado"+id);
    }else{
    System.out.println("error al momento de eliminar");
    }
    } 
}
