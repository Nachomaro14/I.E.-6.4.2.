package Controlador;

import Modelo.Modelo;
import Vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Controlador implements ActionListener, MouseListener{
    
    Interfaz vista;
    Modelo modelo = new Modelo();
    
    public Controlador(Interfaz i) {
        vista = i;
    }
    
    public enum AccionMVC {
        btnInformacionCliente,
        btnVolverInfoCliente,
        btnNuevoCliente,
        btnCancelarNuevoCliente,
        btnAceptarNuevoCliente,
        btnEliminarCliente,
        
        btnNuevoProducto,
        btnAceptarNuevoProducto,
        btnCancelarNuevoProducto,
        btnEliminarProducto
    }
    
    public void iniciar() {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            SwingUtilities.updateComponentTreeUI(vista.infoCliente);
            SwingUtilities.updateComponentTreeUI(vista.nuevoCliente);
            SwingUtilities.updateComponentTreeUI(vista.nuevoProducto);
            
            vista.pack();
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
            vista.setTitle("Gestión de pedidos.");
            
            vista.tablaClientes.setModel(modelo.tablaClientes());
            vista.tablaProductos.setModel(modelo.tablaProductos());
            vista.tablaVentas.setModel(modelo.tablaVentas());
            
            SCifras(vista.txtCodPostalCliente);
            SCifras(vista.txtTelefono1Cliente);
            SCifras(vista.txtTelefono2Cliente);
            SCifras(vista.txtTelefono3Cliente);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        }
        
        this.vista.btnInformacionCliente.setActionCommand("btnInformacionCliente");
        this.vista.btnInformacionCliente.addActionListener(this);
        this.vista.btnVolverInfoCliente.setActionCommand("btnVolverInfoCliente");
        this.vista.btnVolverInfoCliente.addActionListener(this);
        this.vista.btnNuevoCliente.setActionCommand("btnNuevoCliente");
        this.vista.btnNuevoCliente.addActionListener(this);
        this.vista.btnCancelarNuevoCliente.setActionCommand("btnCancelarNuevoCliente");
        this.vista.btnCancelarNuevoCliente.addActionListener(this);
        this.vista.btnAceptarNuevoCliente.setActionCommand("btnAceptarNuevoCliente");
        this.vista.btnAceptarNuevoCliente.addActionListener(this);
        this.vista.btnEliminarCliente.setActionCommand("btnEliminarCliente");
        this.vista.btnEliminarCliente.addActionListener(this);
        
        this.vista.btnNuevoProducto.setActionCommand("btnNuevoProducto");
        this.vista.btnNuevoProducto.addActionListener(this);
        this.vista.btnAceptarNuevoProducto.setActionCommand("btnAceptarNuevoProducto");
        this.vista.btnAceptarNuevoProducto.addActionListener(this);
        this.vista.btnCancelarNuevoProducto.setActionCommand("btnCancelarNuevoProducto");
        this.vista.btnCancelarNuevoProducto.addActionListener(this);
        this.vista.btnEliminarProducto.setActionCommand("btnEliminarProducto");
        this.vista.btnEliminarProducto.addActionListener(this);
        
        this.vista.tablaClientes.addMouseListener(this);
        this.vista.tablaClientes.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaClientes.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaProductos.addMouseListener(this);
        this.vista.tablaProductos.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaProductos.getTableHeader().setResizingAllowed(false);
        
        this.vista.tablaVentas.addMouseListener(this);
        this.vista.tablaVentas.getTableHeader().setReorderingAllowed(false);
        this.vista.tablaVentas.getTableHeader().setResizingAllowed(false);
    }
    
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())) {
            case btnInformacionCliente:
                if(!vista.clienteSeleccionado.getText().equals("")){
                    int id = Integer.parseInt(vista.clienteSeleccionado.getText());
                    Object[] info = modelo.infoCliente(id);
                    vista.infoIDCliente.setText(String.valueOf(info[0]));
                    vista.infoNombre.setText(String.valueOf(info[1]));
                    vista.infoDireccion.setText(String.valueOf(info[2]));
                    vista.infoNIF.setText(String.valueOf(info[3]));
                    vista.infoTelefono1.setText(String.valueOf(info[4]));
                    vista.infoTelefono2.setText(String.valueOf(info[4]));
                    vista.infoTelefono3.setText(String.valueOf(info[4]));
                    vista.infoCliente.pack();
                    vista.infoCliente.setLocationRelativeTo(null);
                    vista.infoCliente.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione un cliente.");
                }
                break;
            case btnVolverInfoCliente:
                vista.infoCliente.dispose();
                vista.infoIDCliente.setText("");
                vista.infoNombre.setText("");
                vista.infoNIF.setText("");
                vista.infoDireccion.setText("");
                vista.infoTelefono1.setText("");
                vista.infoTelefono2.setText("");
                vista.infoTelefono3.setText("");
                break;
            case btnNuevoCliente:
                vista.nuevoCliente.pack();
                vista.nuevoCliente.setLocationRelativeTo(null);
                vista.nuevoCliente.setVisible(true);
                break;
            case btnAceptarNuevoCliente:
                String nombre = vista.txtNombreCliente.getText();
                String nif = vista.txtNIFCliente.getText();
                String calle = vista.txtCalleCliente.getText();
                String poblacion = vista.txtPoblacionCliente.getText();
                String provincia = vista.txtProvinciaCliente.getText();
                String telefono1 = vista.txtTelefono1Cliente.getText();
                String telefono2 = vista.txtTelefono2Cliente.getText();
                String telefono3 = vista.txtTelefono3Cliente.getText();
                if(!nombre.equals("") && !nif.equals("") && !calle.equals("") && !poblacion.equals("") && !vista.txtCodPostalCliente.getText().equals("") && !provincia.equals("") && !telefono1.equals("")){
                    int codPostal = Integer.parseInt(vista.txtCodPostalCliente.getText());
                    modelo.insertarCliente(nombre, calle, poblacion, codPostal, provincia, nif, telefono1, telefono2, telefono3);
                }else{
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos.\nLos únicos campos no necesarios son los teléfonos 2 y 3.");
                }
                vista.tablaClientes.setModel(modelo.tablaClientes());
                vista.nuevoCliente.dispose();
                vista.txtNombreCliente.setText("");
                vista.txtNIFCliente.setText("");
                vista.txtCalleCliente.setText("");
                vista.txtPoblacionCliente.setText("");
                vista.txtCodPostalCliente.setText("");
                vista.txtProvinciaCliente.setText("");
                vista.txtTelefono1Cliente.setText("");
                vista.txtTelefono2Cliente.setText("");
                vista.txtTelefono3Cliente.setText("");
                break;
            case btnCancelarNuevoCliente:
                vista.nuevoCliente.dispose();
                vista.txtNombreCliente.setText("");
                vista.txtNIFCliente.setText("");
                vista.txtCalleCliente.setText("");
                vista.txtPoblacionCliente.setText("");
                vista.txtCodPostalCliente.setText("");
                vista.txtProvinciaCliente.setText("");
                vista.txtTelefono1Cliente.setText("");
                vista.txtTelefono2Cliente.setText("");
                vista.txtTelefono3Cliente.setText("");
                break;
            case btnEliminarCliente:
                int idC = Integer.parseInt(vista.clienteSeleccionado.getText());
                modelo.eliminarCliente(idC);
                vista.tablaClientes.setModel(modelo.tablaClientes());
                vista.clienteSeleccionado.setText("");
                break;
                
            case btnNuevoProducto:
                vista.nuevoProducto.pack();
                vista.nuevoProducto.setLocationRelativeTo(null);
                vista.nuevoProducto.setVisible(true);
                break;
            case btnAceptarNuevoProducto:
                if(!vista.txtDescripcionProducto.getText().equals("") && !vista.txtStockProducto.getText().equals("") && !vista.txtPVPProducto.getText().equals("")){
                    String descripcion = vista.txtDescripcionProducto.getText();
                    int stock = Integer.parseInt(vista.txtStockProducto.getText());
                    int pvp = Integer.parseInt(vista.txtPVPProducto.getText());
                    modelo.insertarProducto(descripcion, stock, pvp);
                    vista.tablaProductos.setModel(modelo.tablaProductos());
                    vista.nuevoProducto.dispose();
                    vista.txtDescripcionProducto.setText("");
                    vista.txtStockProducto.setText("");
                    vista.txtPVPProducto.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
                }
                break;
            case btnCancelarNuevoProducto:
                vista.nuevoProducto.dispose();
                vista.txtDescripcionProducto.setText("");
                vista.txtStockProducto.setText("");
                vista.txtPVPProducto.setText("");
                break;
            case btnEliminarProducto:
                int idP = Integer.parseInt(vista.productoSeleccionado.getText());
                modelo.eliminarProducto(idP);
                vista.tablaProductos.setModel(modelo.tablaProductos());
                vista.productoSeleccionado.setText("");
                vista.descripcionProductoSeleccionado.setText("");
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int cliente = vista.tablaClientes.rowAtPoint(e.getPoint());
        if(cliente > -1){
            try {
                String id = String.valueOf(vista.tablaClientes.getValueAt(cliente, 0));
                vista.clienteSeleccionado.setText(id);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        int producto = vista.tablaProductos.rowAtPoint(e.getPoint());
        if(producto > -1){
            try {
                String id = String.valueOf(vista.tablaProductos.getValueAt(producto, 0));
                vista.productoSeleccionado.setText(id);
                vista.descripcionProductoSeleccionado.setText(modelo.obtenerDescripcion(Integer.parseInt(id)));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        int venta = vista.tablaVentas.rowAtPoint(e.getPoint());
        if(venta > -1){
            try {
                String id = String.valueOf(vista.tablaVentas.getValueAt(venta, 0));
                vista.ventaSeleccionada.setText(id);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos de la tupla de la tabla.\n\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    public static void SCifras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    e.consume();
                }
            }
        });
    }

    public static void SLetras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }
}