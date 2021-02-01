/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.DAO.ComandaDAO;
import Modelo.DAO.Conexion;
import Modelo.Vo.ComandaVo;
import Modelo.Vo.IngredienteVo;
import Modelo.Vo.TamanioVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author santi
 */
public class Comanda extends javax.swing.JFrame {

    /**
     * Creates new form Comanda
     */
    private ComandaVo comanda;


    public Comanda() throws SQLException, ClassNotFoundException {
        
        initComponents();
        this.agregarIngredientes();
        
        this.setTitle("REGISTRO COMANDA");
        this.setSize(551, 700);
        this.porcionesJcb.setEnabled(false);
        this.saboresJcb1.setEnabled(false);
        this.saboresJcb2.setEnabled(false);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/imagenes/iconos/pedido_1.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DireccionJtx = new javax.swing.JTextField();
        nombreJtx = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tamanioJcb = new javax.swing.JComboBox<>();
        adicionalesJcb = new javax.swing.JComboBox<>();
        porcionesJcb = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        saborJCB = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        registroComanda = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        saboresJcb1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        saboresJcb2 = new javax.swing.JComboBox<>();
        FONDO____ = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel5.setBackground(new java.awt.Color(0, 255, 0));
        jLabel5.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("REGISTRO COMANDA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 10, 330, 46);

        jLabel9.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tamaño");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 200, 90, 21);

        DireccionJtx.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        getContentPane().add(DireccionJtx);
        DireccionJtx.setBounds(160, 120, 250, 30);

        nombreJtx.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        getContentPane().add(nombreJtx);
        nombreJtx.setBounds(160, 80, 250, 30);

        jLabel10.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 70, 90, 30);

        jLabel12.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Direccion");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 120, 90, 21);

        jLabel11.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Adicionales ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 320, 90, 30);

        tamanioJcb.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        tamanioJcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Grande", "Mediana", "Pequeña" }));
        tamanioJcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tamanioJcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanioJcbActionPerformed(evt);
            }
        });
        getContentPane().add(tamanioJcb);
        tamanioJcb.setBounds(160, 200, 250, 30);

        adicionalesJcb.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        adicionalesJcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        adicionalesJcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionalesJcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionalesJcbActionPerformed(evt);
            }
        });
        getContentPane().add(adicionalesJcb);
        adicionalesJcb.setBounds(160, 280, 250, 30);

        porcionesJcb.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        porcionesJcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        porcionesJcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(porcionesJcb);
        porcionesJcb.setBounds(160, 240, 250, 30);

        jLabel13.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Sabor");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 160, 90, 21);

        saborJCB.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        saborJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        saborJCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saborJCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saborJCBMouseClicked(evt);
            }
        });
        saborJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saborJCBActionPerformed(evt);
            }
        });
        getContentPane().add(saborJCB);
        saborJCB.setBounds(160, 160, 250, 30);

        jLabel14.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Porciones");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 240, 90, 21);

        registroComanda.setBackground(new java.awt.Color(153, 153, 153));
        registroComanda.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        registroComanda.setForeground(new java.awt.Color(0, 0, 0));
        registroComanda.setText("Registrar");
        registroComanda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroComandaActionPerformed(evt);
            }
        });
        getContentPane().add(registroComanda);
        registroComanda.setBounds(160, 590, 250, 40);

        jLabel15.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Agregados");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(70, 520, 80, 21);

        saboresJcb1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        saboresJcb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        saboresJcb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saboresJcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saboresJcb1ActionPerformed(evt);
            }
        });
        getContentPane().add(saboresJcb1);
        saboresJcb1.setBounds(160, 400, 250, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/formulario_1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 0, 70, 60);

        jLabel16.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Adicionales");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(70, 280, 90, 21);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 320, 250, 70);

        jLabel18.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Agregados");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(70, 320, 90, 70);

        jLabel19.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Cant. sabores");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(50, 400, 100, 21);

        jLabel20.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Sabores");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(70, 450, 80, 21);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 500, 250, 70);

        jLabel21.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Sabores");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(70, 500, 80, 21);

        saboresJcb2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        saboresJcb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Pollo", "Cerdo", "Queso" }));
        saboresJcb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saboresJcb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saboresJcb2ActionPerformed(evt);
            }
        });
        getContentPane().add(saboresJcb2);
        saboresJcb2.setBounds(160, 450, 250, 30);

        FONDO____.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/DESFENFOQUE.jpg"))); // NOI18N
        getContentPane().add(FONDO____);
        FONDO____.setBounds(0, -40, 830, 840);

        jLabel17.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Adicionales ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(90, 430, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saborJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saborJCBActionPerformed


    }//GEN-LAST:event_saborJCBActionPerformed

    private void saborJCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saborJCBMouseClicked

    }//GEN-LAST:event_saborJCBMouseClicked

    private void tamanioJcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioJcbActionPerformed

        //Seleccione, Grande, Mediana, Pequeña
        if (this.tamanioJcb.getSelectedItem() == "Seleccione") {

            this.porcionesJcb.setEnabled(false);
            this.saboresJcb1.setEnabled(false);

            this.porcionesJcb.removeAllItems();
            this.porcionesJcb.addItem("Seleccione");

            this.saboresJcb1.removeAllItems();
            this.saboresJcb1.addItem("1");

        }

        if (this.tamanioJcb.getSelectedItem() == "Grande") {
            this.saboresJcb1.setEnabled(true);
            this.porcionesJcb.setEnabled(true);

            this.porcionesJcb.removeAllItems();
            this.porcionesJcb.addItem("Seleccione");
            this.porcionesJcb.addItem("20");
            this.porcionesJcb.addItem("16");
            this.porcionesJcb.addItem("12");
            this.porcionesJcb.addItem("10");

            this.saboresJcb1.removeAllItems();
            this.saboresJcb1.addItem("1");
            this.saboresJcb1.addItem("2");
            this.saboresJcb1.addItem("3");

        }

        if (this.tamanioJcb.getSelectedItem() == "Pequeña") {
            this.saboresJcb1.setEnabled(true);
            this.porcionesJcb.setEnabled(true);

            this.porcionesJcb.removeAllItems();
            this.porcionesJcb.addItem("Seleccione");
            this.porcionesJcb.addItem("4");
            this.porcionesJcb.addItem("6");

            this.saboresJcb1.removeAllItems();
            this.saboresJcb1.addItem("1");
            this.saboresJcb1.addItem("2");

        }

        if (this.tamanioJcb.getSelectedItem() == "Mediana") {
            this.porcionesJcb.removeAllItems();
            this.saboresJcb1.setEnabled(true);

            this.porcionesJcb.addItem("Seleccione");

            this.porcionesJcb.addItem("8");
            this.porcionesJcb.addItem("6");
            this.porcionesJcb.setEnabled(true);

            this.saboresJcb1.removeAllItems();
            this.saboresJcb1.addItem("1");
            this.saboresJcb1.addItem("2");

        }
    }//GEN-LAST:event_tamanioJcbActionPerformed

    private void registroComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroComandaActionPerformed

        TamanioVo tamanio = null;
        Byte porciones = (byte) (Integer.parseInt((String) this.porcionesJcb.getSelectedItem()));
        Byte cSabores = (byte) (Integer.parseInt((String) this.saboresJcb1.getSelectedItem()));
        String sabor = (String) this.saborJCB.getSelectedItem();
        String nombre = (String) this.nombreJtx.getText();
        String direccion = (String) this.DireccionJtx.getText();

        if (this.tamanioJcb.getSelectedItem() == "Grande") {
            tamanio = TamanioVo.GRANDE;
        }
        if (this.tamanioJcb.getSelectedItem() == "Pequeña") {
            tamanio = TamanioVo.PEQUENIA;
        }
        if (this.tamanioJcb.getSelectedItem() == "Mediana") {
            tamanio = TamanioVo.MEDIANA;
        }

        comanda = new ComandaVo(tamanio, porciones, cSabores, sabor, nombre, direccion);

        if (cSabores > 1) {
            this.saboresJcb2.setEnabled(true);
        }

        ComandaDAO comandao = new ComandaDAO();

        try {
            comandao.guardar(Conexion.obtener(), comanda);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Comanda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registroComandaActionPerformed

    private void saboresJcb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saboresJcb1ActionPerformed

        if (this.tamanioJcb.getSelectedItem() == "1") {

            this.saboresJcb1.removeAllItems();
            this.saboresJcb1.addItem("1");

        } else {
            this.saboresJcb2.setEnabled(true);
        }


    }//GEN-LAST:event_saboresJcb1ActionPerformed

    private void saboresJcb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saboresJcb2ActionPerformed

        if (this.saboresJcb2.getSelectedItem() != "Seleccione") {
            System.out.println("hola");
        }

    }//GEN-LAST:event_saboresJcb2ActionPerformed

    private void adicionalesJcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionalesJcbActionPerformed

        if (this.adicionalesJcb.getSelectedItem() != "Seleccione") {
            

        }

    }//GEN-LAST:event_adicionalesJcbActionPerformed

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
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Comanda().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(Comanda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DireccionJtx;
    private javax.swing.JLabel FONDO____;
    private javax.swing.JComboBox<String> adicionalesJcb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField nombreJtx;
    private javax.swing.JComboBox<String> porcionesJcb;
    private javax.swing.JButton registroComanda;
    private javax.swing.JComboBox<String> saborJCB;
    private javax.swing.JComboBox<String> saboresJcb1;
    private javax.swing.JComboBox<String> saboresJcb2;
    private javax.swing.JComboBox<String> tamanioJcb;
    // End of variables declaration//GEN-END:variables


 private void agregarIngredientes() {

        for (Byte i = 0; i < FormularioP.ingredientes.size(); i++) {

            adicionalesJcb.addItem(FormularioP.ingredientes.get(i).getNombre());

        }

    }
    

 
}
