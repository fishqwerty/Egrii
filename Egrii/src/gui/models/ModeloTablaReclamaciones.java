/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.models;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.*;
import models.misc.Reclamacion;
/**
 *
 * @author basesdatos
 */
public class ModeloTablaReclamaciones extends AbstractTableModel{
    private List<Reclamacion> reclamaciones;

    public ModeloTablaReclamaciones(){
        this.reclamaciones =new ArrayList<Reclamacion>();
    }

    public int getColumnCount (){
        return 3;
    }

    public int getRowCount(){
        return reclamaciones.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "ID Usuario"; break;
            case 1: nombre= "Enviada"; break;
            case 2: nombre="Estado"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase=java.lang.String.class; break;
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
            case 0: resultado= reclamaciones.get(row).getCodigoCliente(); break;
            case 1: resultado= reclamaciones.get(row).getFechaEnvio(); break;
            case 2: 
                if(reclamaciones.get(row).getAdmin() == null){
                    resultado = "Pendiente";
                }else if(reclamaciones.get(row).getFechaResolucion() == null){
                    resultado = "Sin resolver";
                }else{
                    resultado = "Resuelta";
                }
                break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Reclamacion> reclamaciones){
        this.reclamaciones=reclamaciones;
        fireTableDataChanged();
    }

    public Reclamacion obtenerLibro(int i){
        return this.reclamaciones.get(i);
    }

}
