/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

import com.mycompany.controllerimpl.VentaCtrlImpl;
import com.mycompany.dao.VentaDAO;
import com.mycompany.model.Venta;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class TestVenta {
    static ArrayList<Venta> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentaDAO vdao;
        vdao = new VentaCtrlImpl();
        list = vdao.readVenta();
        
        Venta v=new Venta();
        v.setId_venta("5");
        v.setFecha("02/01/2018");
        v.setConcepto("Realizada");
        v.setIgv("02");
        v.setTotal("67");
        v.setSub_total("120");
        v.setId_cliente_direccion("1");
        v.setId_vendedor("1");
       if(vdao.createVenta(v)){
           System.out.println("insertado");
       }else{
           System.out.println("error al momento de insertar");
       } 
    }
    
}
