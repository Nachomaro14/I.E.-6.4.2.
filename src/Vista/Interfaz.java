package Vista;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoCliente = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVolverInfoCliente = new javax.swing.JButton();
        infoTelefono3 = new javax.swing.JLabel();
        infoIDCliente = new javax.swing.JLabel();
        infoNombre = new javax.swing.JLabel();
        infoDireccion = new javax.swing.JLabel();
        infoNIF = new javax.swing.JLabel();
        infoTelefono1 = new javax.swing.JLabel();
        infoTelefono2 = new javax.swing.JLabel();
        nuevoCliente = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNIFCliente = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCalleCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPoblacionCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCodPostalCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtProvinciaCliente = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtTelefono1Cliente = new javax.swing.JTextField();
        txtTelefono2Cliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTelefono3Cliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnCancelarNuevoCliente = new javax.swing.JButton();
        btnAceptarNuevoCliente = new javax.swing.JButton();
        nuevoProducto = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDescripcionProducto = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        txtStockProducto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPVPProducto = new javax.swing.JTextField();
        btnAceptarNuevoProducto = new javax.swing.JButton();
        btnCancelarNuevoProducto = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JButton();
        btnInformacionCliente = new javax.swing.JButton();
        clienteSeleccionado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnNuevoProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        productoSeleccionado = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        descripcionProductoSeleccionado = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnNuevaVenta = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        btnInformacionVenta = new javax.swing.JButton();
        ventaSeleccionada = new javax.swing.JLabel();

        infoCliente.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        infoCliente.setAlwaysOnTop(true);
        infoCliente.setModal(true);
        infoCliente.setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jLabel3.setText("Dirección:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel5.setText("NIF:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel7.setText("Teléfonos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        btnVolverInfoCliente.setText("Volver");
        jPanel1.add(btnVolverInfoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel1.add(infoTelefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 290, 20));
        jPanel1.add(infoIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 290, 20));
        jPanel1.add(infoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 290, 20));
        jPanel1.add(infoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 290, 20));
        jPanel1.add(infoNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 290, 20));
        jPanel1.add(infoTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 290, 20));
        jPanel1.add(infoTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 290, 20));

        javax.swing.GroupLayout infoClienteLayout = new javax.swing.GroupLayout(infoCliente.getContentPane());
        infoCliente.getContentPane().setLayout(infoClienteLayout);
        infoClienteLayout.setHorizontalGroup(
            infoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        infoClienteLayout.setVerticalGroup(
            infoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        nuevoCliente.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        nuevoCliente.setAlwaysOnTop(true);
        nuevoCliente.setModal(true);
        nuevoCliente.setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Nombre:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        jPanel2.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 160, -1));

        jLabel10.setText("NIF:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 20));
        jPanel2.add(txtNIFCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 160, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Calle:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));
        jPanel5.add(txtCalleCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 160, -1));

        jLabel12.setText("Población:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 20));
        jPanel5.add(txtPoblacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 100, -1));

        jLabel13.setText("Código Postal:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));
        jPanel5.add(txtCodPostalCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, -1));

        jLabel14.setText("Provincia:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 50, 20));
        jPanel5.add(txtProvinciaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 100, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 410, 110));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfonos"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Teléfono 1:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));
        jPanel7.add(txtTelefono1Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 300, -1));
        jPanel7.add(txtTelefono2Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 300, -1));

        jLabel16.setText("Teléfono 2:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));
        jPanel7.add(txtTelefono3Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 300, -1));

        jLabel17.setText("Teléfono 3:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 410, 150));

        btnCancelarNuevoCliente.setText("Cancelar");
        jPanel2.add(btnCancelarNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        btnAceptarNuevoCliente.setText("Aceptar");
        jPanel2.add(btnAceptarNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        javax.swing.GroupLayout nuevoClienteLayout = new javax.swing.GroupLayout(nuevoCliente.getContentPane());
        nuevoCliente.getContentPane().setLayout(nuevoClienteLayout);
        nuevoClienteLayout.setHorizontalGroup(
            nuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoClienteLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        nuevoClienteLayout.setVerticalGroup(
            nuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        nuevoProducto.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        nuevoProducto.setAlwaysOnTop(true);
        nuevoProducto.setModal(true);
        nuevoProducto.setResizable(false);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Descripción:");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtDescripcionProducto.setColumns(20);
        txtDescripcionProducto.setRows(5);
        jScrollPane5.setViewportView(txtDescripcionProducto);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, 150));

        jLabel20.setText("Stock:");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));
        jPanel8.add(txtStockProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 240, -1));

        jLabel21.setText("PVP:");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, 20));
        jPanel8.add(txtPVPProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 90, -1));

        btnAceptarNuevoProducto.setText("Aceptar");
        jPanel8.add(btnAceptarNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        btnCancelarNuevoProducto.setText("Cancelar");
        jPanel8.add(btnCancelarNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        javax.swing.GroupLayout nuevoProductoLayout = new javax.swing.GroupLayout(nuevoProducto.getContentPane());
        nuevoProducto.getContentPane().setLayout(nuevoProductoLayout);
        nuevoProductoLayout.setHorizontalGroup(
            nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        nuevoProductoLayout.setVerticalGroup(
            nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 601, 320));

        btnNuevoCliente.setText("Nuevo");
        jPanel3.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, 270, 60));

        jLabel4.setText("Seleccionado:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 344, -1, 20));

        btnEliminarCliente.setText("Eliminar");
        jPanel3.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 270, 60));

        btnInformacionCliente.setText("Información");
        jPanel3.add(btnInformacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, 30));
        jPanel3.add(clienteSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 344, 410, 20));

        tabs.addTab("Clientes", jPanel3);

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaProductos);

        jLabel6.setText("Seleccionado:");

        btnNuevoProducto.setText("Nuevo");

        btnEliminarProducto.setText("Eliminar");

        descripcionProductoSeleccionado.setEditable(false);
        descripcionProductoSeleccionado.setColumns(20);
        descripcionProductoSeleccionado.setRows(5);
        jScrollPane4.setViewportView(descripcionProductoSeleccionado);

        jLabel18.setText("Descripción:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productoSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        tabs.addTab("Productos", jPanel4);

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaVentas);

        jLabel8.setText("Seleccionada:");

        btnNuevaVenta.setText("Nueva");
        btnNuevaVenta.setEnabled(false);

        btnEliminarVenta.setText("Eliminar");
        btnEliminarVenta.setEnabled(false);

        btnInformacionVenta.setText("Información");
        btnInformacionVenta.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(ventaSeleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnInformacionVenta)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(btnEliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInformacionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnEliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabs.addTab("Ventas", jPanel6);

        getContentPane().add(tabs, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarNuevoCliente;
    public javax.swing.JButton btnAceptarNuevoProducto;
    public javax.swing.JButton btnCancelarNuevoCliente;
    public javax.swing.JButton btnCancelarNuevoProducto;
    public javax.swing.JButton btnEliminarCliente;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnEliminarVenta;
    public javax.swing.JButton btnInformacionCliente;
    public javax.swing.JButton btnInformacionVenta;
    public javax.swing.JButton btnNuevaVenta;
    public javax.swing.JButton btnNuevoCliente;
    public javax.swing.JButton btnNuevoProducto;
    public javax.swing.JButton btnVolverInfoCliente;
    public javax.swing.JLabel clienteSeleccionado;
    public javax.swing.JTextArea descripcionProductoSeleccionado;
    public javax.swing.JDialog infoCliente;
    public javax.swing.JLabel infoDireccion;
    public javax.swing.JLabel infoIDCliente;
    public javax.swing.JLabel infoNIF;
    public javax.swing.JLabel infoNombre;
    public javax.swing.JLabel infoTelefono1;
    public javax.swing.JLabel infoTelefono2;
    public javax.swing.JLabel infoTelefono3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JDialog nuevoCliente;
    public javax.swing.JDialog nuevoProducto;
    public javax.swing.JLabel productoSeleccionado;
    public javax.swing.JTable tablaClientes;
    public javax.swing.JTable tablaProductos;
    public javax.swing.JTable tablaVentas;
    public javax.swing.JTabbedPane tabs;
    public javax.swing.JTextField txtCalleCliente;
    public javax.swing.JTextField txtCodPostalCliente;
    public javax.swing.JTextArea txtDescripcionProducto;
    public javax.swing.JTextField txtNIFCliente;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtPVPProducto;
    public javax.swing.JTextField txtPoblacionCliente;
    public javax.swing.JTextField txtProvinciaCliente;
    public javax.swing.JTextField txtStockProducto;
    public javax.swing.JTextField txtTelefono1Cliente;
    public javax.swing.JTextField txtTelefono2Cliente;
    public javax.swing.JTextField txtTelefono3Cliente;
    public javax.swing.JLabel ventaSeleccionada;
    // End of variables declaration//GEN-END:variables
}