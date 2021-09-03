/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dialogos;

import Clases.CArticulos;
import Clases.CPack;
import ModelosTablas.MTArticulos;
import ModelosTablas.MTPack;
import ModelosTablas.MTPackDetalle;
import Objetos.OArticulos;
import Objetos.OError;
import Objetos.OPackDetalle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TOULON-NOTE
 */
public class DCrudPack extends javax.swing.JDialog {

    private List<OPackDetalle> packdet = new ArrayList();
    /** Creates new form DCrudPack */
    public DCrudPack(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ListarUsuarios();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        labPrecio = new javax.swing.JLabel();
        labCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        labStock = new javax.swing.JLabel();
        labBusquedaArticulo = new javax.swing.JLabel();
        txtBusquedaArticulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArticulos = new javax.swing.JTable();
        butAgregarArticulo = new javax.swing.JButton();
        txtUnidades = new javax.swing.JTextField();
        labUnidades = new javax.swing.JLabel();
        butQuitarArticulo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableArticulosPack = new javax.swing.JTable();
        labArticulosPack = new javax.swing.JLabel();
        jToggleButtonEstado = new javax.swing.JToggleButton();
        butGuardar = new javax.swing.JButton();
        labTotalCosto = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labNombre.setText("Nombre");

        labPrecio.setText("Precio Pack");

        labCodigo.setText("Codigo");

        txtCodigo.setEditable(false);

        labStock.setText("Stock");

        labBusquedaArticulo.setText("Busqueda de Articulo");

        jTableArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableArticulos);

        butAgregarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_adelante_32.png"))); // NOI18N
        butAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAgregarArticuloActionPerformed(evt);
            }
        });

        labUnidades.setText("Unidades");

        butQuitarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_atras_32.png"))); // NOI18N

        jTableArticulosPack.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableArticulosPack);

        labArticulosPack.setText("Articulos del Pack");

        jToggleButtonEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_switchoff_32.png"))); // NOI18N
        jToggleButtonEstado.setSelected(true);
        jToggleButtonEstado.setText("Activado");
        jToggleButtonEstado.setDisabledIcon(null);
        jToggleButtonEstado.setIconTextGap(8);
        jToggleButtonEstado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_switchon_32.png"))); // NOI18N
        jToggleButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEstadoActionPerformed(evt);
            }
        });

        butGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_guardar_32.png"))); // NOI18N
        butGuardar.setText("Guardar");
        butGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarActionPerformed(evt);
            }
        });

        labTotalCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labTotalCosto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labTotalCosto.setText("Costo Total Pack $ 0");

        jButton3.setText("Articulos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labNombre)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labStock))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labPrecio)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBusquedaArticulo)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(butAgregarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtUnidades)
                                    .addComponent(labUnidades)
                                    .addComponent(butQuitarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jToggleButtonEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTotalCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labArticulosPack))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labBusquedaArticulo)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCodigo)
                    .addComponent(labNombre)
                    .addComponent(labStock)
                    .addComponent(labPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labBusquedaArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBusquedaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labArticulosPack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(butAgregarArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labUnidades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butQuitarArticulo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labTotalCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ListarUsuarios(){
        MTArticulos Articulos = new MTArticulos(new CArticulos().Listar());
        jTableArticulos.setModel(Articulos);
        //FormatoTabla();
    }
    
    private void jToggleButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEstadoActionPerformed
        // TODO add your handling code here:
        if(jToggleButtonEstado.isSelected()){
            jToggleButtonEstado.setText("Activado");
        }
        else{
            jToggleButtonEstado.setText("Desactivado");
        }
    }//GEN-LAST:event_jToggleButtonEstadoActionPerformed

    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed
        // TODO add your handling code here:
        
        /* CPack pack = new CPack(0, txtNombre.getText().trim(), txtPrecio.getText().trim(), Integer.valueOf(txtStock.getText().trim()), true, packdet);
        OError error = pack.Insertar();
        if (error.isConfirma()) {
        //ListarCategoria();
        System.out.println(error.getMensaje());
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        packdet.clear();
        MTPackDetalle packdetalles = new MTPackDetalle(packdet);
        jTableArticulosPack.setModel(packdetalles);
        } else {
        System.out.println(error.getMensaje());
        }*/
        
        /*boolean Validacion = true;
        if(txtNombre.getText().trim().isEmpty()){
            labNombreError.setVisible(true);
            labNombreError.setToolTipText("El Nombre del Usuario es Obligatorio");
            Validacion = false;
        }
        if(txtApellidos.getText().trim().isEmpty()){
            labApellidosError.setVisible(true);
            labApellidosError.setToolTipText("El Apellido del Usuario es Obligatorio");
            Validacion = false;
        }
        if(txtUsername.getText().trim().isEmpty()){
            labUsernameError.setVisible(true);
            labUsernameError.setToolTipText("El Username del Usuario es Obligatorio");
            Validacion = false;
        }
        if(String.valueOf(txtIngresaClave.getPassword()).trim().isEmpty()){
            labIngreseClaveError.setVisible(true);
            labIngreseClaveError.setToolTipText("Ingresar una Clave es Obligatorio");
            Validacion = false;
        }
        if(String.valueOf(txtVerifiqueClave.getPassword()).trim().isEmpty()){
            labVerifiqueClaveError.setVisible(true);
            labVerifiqueClaveError.setToolTipText("Verificar la Clave es Obligatorio");
            Validacion = false;
        }
        if(!String.valueOf(txtIngresaClave.getPassword()).trim().isEmpty() && !String.valueOf(txtVerifiqueClave.getPassword()).trim().isEmpty()){
            String Clave1 = String.valueOf(txtIngresaClave.getPassword());
            String Clave2 = String.valueOf(txtVerifiqueClave.getPassword());
            if(!Clave1.equals(Clave2)){
                labIngreseClaveError.setVisible(true);
                labIngreseClaveError.setToolTipText("Las Claves no Coinciden");
                labVerifiqueClaveError.setVisible(true);
                labVerifiqueClaveError.setToolTipText("Las Claves no Coinciden");
                Validacion = false;
            }
        }

        if(Validacion){
            CUsuario Usuario = null;
            if(String.valueOf(this.getTitle()).equals("Agregar Usuario")){
                Usuario = new CUsuario(0, txtNombre.getText().trim(), txtApellidos.getText().trim(), txtUsername.getText().trim(), String.valueOf(txtIngresaClave.getPassword()).trim(), jToggleButtonEstado.isSelected());
                if(Usuario.ExisteUsername().isConfirma()){
                    if(Usuario.Agregar().isConfirma()){
                        DCorrecto Mensaje = new DCorrecto(new javax.swing.JDialog(), true);
                        Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                        Mensaje.setVisible(true);
                        this.dispose();
                        Actualizar = true;
                    }
                    else{
                        DError Mensaje = new DError(new javax.swing.JDialog(), true);
                        Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                        Mensaje.setVisible(true);
                    }
                }
                else{
                    DError Mensaje = new DError(new javax.swing.JDialog(), true);
                    Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                    Mensaje.setVisible(true);
                }
            }
            else{
                Usuario = new CUsuario(usuario.getId(), txtNombre.getText().trim(), txtApellidos.getText().trim(), txtUsername.getText().trim(), String.valueOf(txtIngresaClave.getPassword()).trim(), jToggleButtonEstado.isSelected());
                if(Usuario.ExisteUsernameDiferente().isConfirma()){
                    if(Usuario.Editar().isConfirma()){
                        DCorrecto Mensaje = new DCorrecto(new javax.swing.JDialog(), true);
                        Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                        Mensaje.setVisible(true);
                        this.dispose();
                        Actualizar = true;
                    }
                    else{
                        DError Mensaje = new DError(new javax.swing.JDialog(), true);
                        Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                        Mensaje.setVisible(true);
                    }
                }
                else{
                    DError Mensaje = new DError(new javax.swing.JDialog(), true);
                    Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                    Mensaje.setVisible(true);
                }
            }
        }*/
    }//GEN-LAST:event_butGuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DCrudArticulo CrudArticulo = new DCrudArticulo(new javax.swing.JDialog(), true);
        CrudArticulo.setTitle("Agregar Articulo");
        //CrudUsuario.txtRut.setText(txtRut.getText());
        CrudArticulo.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void butAgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAgregarArticuloActionPerformed
        // TODO add your handling code here:
        packdet.add(new OPackDetalle(Integer.valueOf(txtUnidades.getText().trim()), ((MTArticulos)jTableArticulos.getModel()).getArticulo().get(jTableArticulos.getSelectedRow())));
        MTPackDetalle packdetalles = new MTPackDetalle(packdet);
        jTableArticulosPack.setModel(packdetalles);
    }//GEN-LAST:event_butAgregarArticuloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DCrudPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DCrudPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DCrudPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DCrudPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DCrudPack dialog = new DCrudPack(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAgregarArticulo;
    private javax.swing.JButton butGuardar;
    private javax.swing.JButton butQuitarArticulo;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableArticulos;
    private javax.swing.JTable jTableArticulosPack;
    private javax.swing.JToggleButton jToggleButtonEstado;
    private javax.swing.JLabel labArticulosPack;
    private javax.swing.JLabel labBusquedaArticulo;
    private javax.swing.JLabel labCodigo;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labPrecio;
    private javax.swing.JLabel labStock;
    private javax.swing.JLabel labTotalCosto;
    private javax.swing.JLabel labUnidades;
    private javax.swing.JTextField txtBusquedaArticulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables

}