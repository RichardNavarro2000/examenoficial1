/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public interface ProductoDAO {
    public boolean createProducto(Producto p);
    public ArrayList<Producto> readProducto();
    public boolean updateProducto(Producto p);
    public boolean deleteProducto(String id);
}
