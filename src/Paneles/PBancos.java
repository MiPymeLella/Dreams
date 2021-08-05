/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.CBanco;
import ModelosTablas.MTBancos;
import Objetos.OError;

/**
 *
 * @author Usuario
 */
public class PBancos extends javax.swing.JPanel {

    /**
     * Creates new form PBancos
     */
    public PBancos() {
        initComponents();
        ListarBancos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitulo = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        butAgregar = new javax.swing.JButton();
        butDesactivar = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        txtBusquedaBanco = new javax.swing.JTextField();
        labBusqueda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreBanco = new javax.swing.JTextField();
        butCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBancos = new javax.swing.JTable();

        labTitulo.setBackground(new java.awt.Color(102, 102, 255));
        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Bancos");
        labTitulo.setOpaque(true);

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setOpaque(false);

        butAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_agregar_32.png"))); // NOI18N
        butAgregar.setText("Agregar");
        butAgregar.setFocusable(false);
        butAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butAgregar.setMaximumSize(new java.awt.Dimension(69, 69));
        butAgregar.setMinimumSize(new java.awt.Dimension(69, 69));
        butAgregar.setName(""); // NOI18N
        butAgregar.setPreferredSize(new java.awt.Dimension(69, 69));
        butAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(butAgregar);

        butDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_desactivar_32.png"))); // NOI18N
        butDesactivar.setText("Desactivar");
        butDesactivar.setFocusable(false);
        butDesactivar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butDesactivar.setMaximumSize(new java.awt.Dimension(69, 69));
        butDesactivar.setMinimumSize(new java.awt.Dimension(69, 69));
        butDesactivar.setName(""); // NOI18N
        butDesactivar.setPreferredSize(new java.awt.Dimension(69, 69));
        butDesactivar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDesactivarActionPerformed(evt);
            }
        });
        jToolBar1.add(butDesactivar);

        jToolBar2.setFloatable(false);
        jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar2.setRollover(true);
        jToolBar2.setOpaque(false);
        jToolBar1.add(jToolBar2);

        txtBusquedaBanco.setToolTipText("Tipee lo que desea Buscar");

        labBusqueda.setText("Busqueda");

        jLabel1.setText("Nombre Banco");

        butCancel.setText("Cancelar");

        jTableBancos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableBancos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labBusqueda)
                        .addGap(4, 4, 4)
                        .addComponent(txtBusquedaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreBanco)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butCancel)))
                .addGap(18, 18, 18)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusquedaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labBusqueda))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butCancel))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDesactivarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butDesactivarActionPerformed

    private void butAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAgregarActionPerformed
        // TODO add your handling code here:
        CBanco banc = new CBanco(0,txtNombreBanco.getText(), true);
        OError error = banc.Agregar();
        if(error.isConfirma()){
            ListarBancos();
            System.out.println(error.getMensaje());
            
        } else {
            System.out.println(error.getMensaje());

        }
    }//GEN-LAST:event_butAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAgregar;
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butDesactivar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableBancos;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel labBusqueda;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JTextField txtBusquedaBanco;
    private javax.swing.JTextField txtNombreBanco;
    // End of variables declaration//GEN-END:variables

    public void ListarBancos(){
        MTBancos ModeloBanco = new MTBancos(new CBanco().Listar());
        jTableBancos.setModel(ModeloBanco);
        
        //jTableBancos.setPreferredSize(new java.awt.Dimension(891, 0));
        jTableBancos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableBancos);
        if (jTableBancos.getColumnModel().getColumnCount() > 0) {
            jTableBancos.getColumnModel().getColumn(0).setResizable(false);
            jTableBancos.getColumnModel().getColumn(0).setPreferredWidth(390);
            jTableBancos.getColumnModel().getColumn(1).setResizable(false);
            jTableBancos.getColumnModel().getColumn(1).setPreferredWidth(80);
        }
    }
    
    //Pruobando si se copia a GIT

}
