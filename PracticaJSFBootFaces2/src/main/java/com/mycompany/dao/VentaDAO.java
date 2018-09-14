/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Venta;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public interface VentaDAO {
    public boolean createVenta(Venta v);
    public ArrayList<Venta> readVenta();
    public boolean updateVenta(Venta v);
    public boolean deleteVenta(String id);
}
