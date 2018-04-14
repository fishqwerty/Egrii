/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.models;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.*;
import models.misc.Producto;
/**
 *
 * @author basesdatos
 */
public class ModeloTablaProductos extends AbstractTableModel{
    private List<Producto> productos;

    public ModeloTablaProductos(){
        this.productos =new ArrayList<Producto>();
    }

    public int getColumnCount (){
        return 4;
    }

    public int getRowCount(){
        return productos.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Nombre"; break;
            case 1: nombre= "Empresa"; break;
            case 2: nombre="Precio"; break;
            case 3: nombre="Descripción"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase=java.lang.Float.class; break;
            case 3: clase=java.lang.String.class; break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= productos.get(row).getNombre(); break;
            case 1: resultado= productos.get(row).getEmpresa().getNombre(); break;
            case 2: resultado= productos.get(row).getPrecio(); break;
            case 3: resultado= productos.get(row).getDescripcion(); break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Producto> productos){
        this.productos=productos;
        fireTableDataChanged();
    }

    public Producto obtenerLibro(int i){
        return this.productos.get(i);
    }

}
