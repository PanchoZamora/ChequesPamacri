/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri.Vistas.Cheque.Incompletos;

import Biblioteca.Cheque;
import Biblioteca.Proveedor;
import Biblioteca.Usuario;
import Mantenedores.MantenedorCheques;
import Mantenedores.MantenedorProveedores;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebai
 */
public class ListarChequesIncompletos extends javax.swing.JFrame {

    /**
     * Creates new form ListarChequesIncompletos
     */
    private Usuario usrConectado;
    public ListarChequesIncompletos(Usuario usr) throws Exception {
        initComponents();
        initTable();
        this.setLocationRelativeTo(null);
        try {
            usrConectado = usr;
            lblNombreUsuario.setText("Bienvenido " + usrConectado.getNombre());
        } catch (Exception e) {
            System.out.println("Sin usuario conectado");
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnGeneral = new javax.swing.JPanel();
        pnVerCheques = new javax.swing.JPanel();
        pnFormulario = new javax.swing.JPanel();
        lblBuscarCheque = new javax.swing.JLabel();
        txtNumeroCheque = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        spChequesIncompletos = new javax.swing.JScrollPane();
        tblChequesIncompletos = new javax.swing.JTable();
        btnEditarCheque = new javax.swing.JButton();
        lblBuscarCheque1 = new javax.swing.JLabel();
        txtFechaCheque = new javax.swing.JTextField();
        pnBanner = new javax.swing.JPanel();
        lblProveedores = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnVerCheques.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBuscarCheque.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBuscarCheque.setText("Buscar cheque");

        txtNumeroCheque.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNumeroCheque.setText("N° Cheque");

        btnVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setPreferredSize(new java.awt.Dimension(150, 50));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tblChequesIncompletos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "N° Cheque", "Monto", "Nombre Proveedor", "Rut Proveedor", "Factura", "Fecha Cobro", "Estado"
            }
        ));
        spChequesIncompletos.setViewportView(tblChequesIncompletos);

        btnEditarCheque.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditarCheque.setText("Editar");
        btnEditarCheque.setPreferredSize(new java.awt.Dimension(120, 50));

        lblBuscarCheque1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBuscarCheque1.setText("Buscar cheque");

        txtFechaCheque.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFechaCheque.setText("Fecha");

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spChequesIncompletos)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(lblBuscarCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(lblBuscarCheque1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addComponent(btnEditarCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spChequesIncompletos, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBuscarCheque)
                            .addComponent(txtNumeroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBuscarCheque1)
                            .addComponent(txtFechaCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEditarCheque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnVerChequesLayout = new javax.swing.GroupLayout(pnVerCheques);
        pnVerCheques.setLayout(pnVerChequesLayout);
        pnVerChequesLayout.setHorizontalGroup(
            pnVerChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnVerChequesLayout.setVerticalGroup(
            pnVerChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVerChequesLayout.createSequentialGroup()
                .addComponent(pnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProveedores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblProveedores.setText("Cheques incompletos");

        lblNombreUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreUsuario.setText(" ");

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chequespamacri/Img/my-shop-logo-1550807958.jpg"))); // NOI18N
        lblLogo.setMaximumSize(new java.awt.Dimension(1000, 800));

        javax.swing.GroupLayout pnBannerLayout = new javax.swing.GroupLayout(pnBanner);
        pnBanner.setLayout(pnBannerLayout);
        pnBannerLayout.setHorizontalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnBannerLayout.setVerticalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreUsuario)
                            .addComponent(lblProveedores))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnGeneralLayout = new javax.swing.GroupLayout(pnGeneral);
        pnGeneral.setLayout(pnGeneralLayout);
        pnGeneralLayout.setHorizontalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnVerCheques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnGeneralLayout.setVerticalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addComponent(pnBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnVerCheques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ListarChequesIncompletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarChequesIncompletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarChequesIncompletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarChequesIncompletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListarChequesIncompletos(null).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ListarChequesIncompletos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarCheque;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblBuscarCheque;
    private javax.swing.JLabel lblBuscarCheque1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnVerCheques;
    private javax.swing.JScrollPane spChequesIncompletos;
    private javax.swing.JTable tblChequesIncompletos;
    private javax.swing.JTextField txtFechaCheque;
    private javax.swing.JTextField txtNumeroCheque;
    // End of variables declaration//GEN-END:variables
    private void initTable() throws Exception {
        MantenedorCheques mc = new MantenedorCheques();
        MantenedorProveedores mp = new MantenedorProveedores();
        DefaultTableModel model = (DefaultTableModel) tblChequesIncompletos.getModel();
        ArrayList<Cheque> listaChequesSinCobrar = mc.listarChequesSinCobrar();
        model.setNumRows(0);
        
        Object rowData[] = new Object[8];
        int i = 0;
        for (Cheque cheque : listaChequesSinCobrar) {
                Proveedor proveedor = mp.obtenerDatosPorId(cheque.getIdProveedor());
                rowData[0] = cheque.getFechaEmision().toString();
                rowData[1] = cheque.getNroCheque();
                rowData[2] = cheque.getMonto();               
                rowData[3] = proveedor.getNombre();               
                rowData[4] = proveedor.getId();               
                rowData[5] = cheque.getNroFactura();               
                rowData[6] = cheque.getFechaCobro();               
                rowData[7] = cheque.getEstado();               
                model.insertRow(i, rowData);
                i++;    
        }      
        
        
    }
}
