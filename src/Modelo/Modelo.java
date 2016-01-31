package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;

public class Modelo extends Database{
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
    
    public DefaultTableModel tablaClientes(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        try {
            tablemodel.addColumn("ID");
            tablemodel.addColumn("Nombre");
            tablemodel.addColumn("NIF");
            
            String q = "BEGIN IE642.CARGAR_CLIENTES(?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.registerOutParameter(1, OracleTypes.CURSOR);
            
            cmst.execute();
            ResultSet res = (ResultSet) cmst.getObject(1);
            
            Object[] data = new Object[3];
            
            while(res.next()){
                data[0] = res.getObject(1);
                data[1] = res.getObject(2);
                data[2] = res.getObject(4);
                tablemodel.addRow(data);
            }
            
            res.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public DefaultTableModel tablaProductos(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        try{
            tablemodel.addColumn("ID");
            tablemodel.addColumn("Descripción");
            tablemodel.addColumn("PVP");
            tablemodel.addColumn("Stock");
            
            String q = "BEGIN IE642.CARGAR_PRODUCTOS(?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.registerOutParameter(1, OracleTypes.CURSOR);
            
            cmst.execute();
            ResultSet res = (ResultSet) cmst.getObject(1);
            
            Object[] data = new Object[4];
            
            while(res.next()){
                data[0] = res.getObject(1);
                data[1] = res.getObject(2);
                data[2] = res.getObject(3);
                data[3] = res.getObject(4);
                tablemodel.addRow(data);
            }
            
            res.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public DefaultTableModel tablaVentas(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        try{
            tablemodel.addColumn("ID");
            tablemodel.addColumn("Fecha");
            
            String q = "BEGIN IE642.CARGAR_VENTAS(?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.registerOutParameter(1, OracleTypes.CURSOR);
            
            cmst.execute();
            ResultSet res = (ResultSet) cmst.getObject(1);
            
            Object[] data = new Object[2];
            
            while(res.next()){
                data[0] = res.getObject(1);
                data[1] = res.getObject(3);
                tablemodel.addRow(data);
            }
            
            res.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public Object[] infoCliente(int id){
        Object[] data = new Object[5];
        try {
            String q = "BEGIN IE642.INFO_CLIENTE(?,?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.registerOutParameter(1, OracleTypes.CURSOR);
            cmst.setInt(2, id);
            
            cmst.execute();
            ResultSet res = (ResultSet) cmst.getObject(1);
            
            while(res.next()){
                data[0] = res.getObject(1);
                data[1] = res.getObject(2);
                data[2] = res.getObject(3);
                data[3] = res.getObject(4);
                data[4] = res.getObject(5);
            }
            
            res.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return data;
    }
    
    public void insertarCliente(String nombre, String calle, String poblacion, int codPostal, String provincia, String nif, String telefono1, String telefono2, String telefono3){
        try{
            String q = "BEGIN IE642.INSERTAR_CLIENTE(?,?,?,?,?,?,?,?,?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.setString(1, nombre);
            cmst.setString(2, calle);
            cmst.setString(3, poblacion);
            cmst.setInt(4, codPostal);
            cmst.setString(5, provincia);
            cmst.setString(6, nif);
            cmst.setString(7, telefono1);
            cmst.setString(8, telefono2);
            cmst.setString(9, telefono3);
            
            cmst.execute();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar cliente\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void eliminarCliente(int id){
        try {
            String q = "BEGIN IE642.ELIMINAR_CLIENTE(?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.setInt(1, id);
            
            cmst.execute();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar cliente\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void eliminarProducto(int id){
        try {
            String q = "BEGIN IE642.ELIMINAR_PRODUCTO(?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.setInt(1, id);
            
            cmst.execute();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar producto\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public String obtenerDescripcion(int id){
        String des = "";
        try {
            String q = "BEGIN IE642.DESCRIPCION_PRODUCTO(?,?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.registerOutParameter(1, OracleTypes.CURSOR);
            cmst.setInt(2, id);
            
            cmst.execute();
            ResultSet res = (ResultSet) cmst.getObject(1);
            
            while(res.next()){
                des = (String) res.getObject(1);
            }
            
            res.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener descripción\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return des;
    }
    
    public void insertarProducto(String descripcion, int stock, int pvp){
        try{
            String q = "BEGIN IE642.INSERTAR_PRODUCTO(?,?,?);END;";
            CallableStatement cmst = (CallableStatement) this.getConexion().prepareCall(q);
            cmst.setString(1, descripcion);
            cmst.setInt(2, pvp);
            cmst.setInt(3, stock);
            
            cmst.execute();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar producto\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
}