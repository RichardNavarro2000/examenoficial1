/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class TestProducto {
    static ArrayList<Producto> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoDAO pdao;
        pdao = new ProductoCtrlImpl();
        list = pdao.readProducto();
        
        Producto p=new Producto();
        p.setId_producto("5");
        p.setId_categoria("2");
        p.setId_unimed("1");
        p.setNombre("Azucar");
        p.setDescripcion("Azucar fina");
        p.setCodigo("22222");
       if(pdao.createProducto(p)){
           System.out.println("insertado");
       }else{
           System.out.println("error al momento de insertar");
       }
    }
    
}
