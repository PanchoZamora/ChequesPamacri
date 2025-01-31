/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri.Vistas;

import Biblioteca.Usuario;
import Mantenedores.MantenedorCheques;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author sebai
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    private Usuario usrConectado;
    public PaginaPrincipal(Usuario usr) throws Exception {
        initComponents();
        
        this.setLocationRelativeTo(null);
        try {
            this.usrConectado = usr;
            //btnAdministrador.setVisible(true);
            lblNombreUsuario.setText("Bienvenido " + usrConectado.getNombre());
            System.out.println("Logueado como administrador");
            JOptionPane.showMessageDialog(rootPane, "Bienvenido: " + usrConectado.getNombre());
        } catch (Exception e) {
            System.out.println("Ningún usuario conectado");
        }
        Mantenedores.MantenedorCheques mantCheques = new MantenedorCheques();
        lblNumeroChequesSinCobrar.setText(Integer.toString(mantCheques.cantidadChequesSinCobrar()));
        lblNumeroChequesDatosFaltantes.setText(Integer.toString(mantCheques.cantidadChequesIncompletos()));
        actualizarPanel();
        
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
        pnPaginaPrincipal = new javax.swing.JPanel();
        btnIngresoCheques = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnChequesRegistrados = new javax.swing.JButton();
        pnInformaciones = new javax.swing.JPanel();
        lblInformaciones = new javax.swing.JLabel();
        lblExisten1 = new javax.swing.JLabel();
        lblExisten2 = new javax.swing.JLabel();
        lblNumeroChequesSinCobrar = new javax.swing.JLabel();
        lblNumeroChequesDatosFaltantes = new javax.swing.JLabel();
        lblTexto1 = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        brnVerSinCobrar = new javax.swing.JButton();
        btnVerDatosFaltantes = new javax.swing.JButton();
        pnBanner = new javax.swing.JPanel();
        lblGesionCheques = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnPaginaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIngresoCheques.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnIngresoCheques.setText("Ingreso de cheques");
        btnIngresoCheques.setPreferredSize(new java.awt.Dimension(180, 50));
        btnIngresoCheques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoChequesActionPerformed(evt);
            }
        });

        btnProveedores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.setPreferredSize(new java.awt.Dimension(180, 50));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnChequesRegistrados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnChequesRegistrados.setText("Cheques registrados");
        btnChequesRegistrados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChequesRegistrados.setPreferredSize(new java.awt.Dimension(180, 50));
        btnChequesRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChequesRegistradosActionPerformed(evt);
            }
        });

        lblInformaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblInformaciones.setText("Informaciones");

        lblExisten1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblExisten1.setText("Existen");

        lblExisten2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblExisten2.setText("Existen");

        lblNumeroChequesSinCobrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNumeroChequesSinCobrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroChequesSinCobrar.setText(" ");

        lblNumeroChequesDatosFaltantes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNumeroChequesDatosFaltantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroChequesDatosFaltantes.setText(" ");

        lblTexto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTexto1.setText("cheques emitidos sin cobrar");

        lblTexto2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTexto2.setText("cheques emitidos con datos faltantes");

        brnVerSinCobrar.setText("Ver");
        brnVerSinCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnVerSinCobrarActionPerformed(evt);
            }
        });

        btnVerDatosFaltantes.setText("Ver");
        btnVerDatosFaltantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosFaltantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInformacionesLayout = new javax.swing.GroupLayout(pnInformaciones);
        pnInformaciones.setLayout(pnInformacionesLayout);
        pnInformacionesLayout.setHorizontalGroup(
            pnInformacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnInformacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInformaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnInformacionesLayout.createSequentialGroup()
                        .addGroup(pnInformacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnInformacionesLayout.createSequentialGroup()
                                .addComponent(lblExisten2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumeroChequesDatosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTexto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnInformacionesLayout.createSequentialGroup()
                                .addComponent(lblExisten1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumeroChequesSinCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnInformacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerDatosFaltantes, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(brnVerSinCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnInformacionesLayout.setVerticalGroup(
            pnInformacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformacionesLayout.createSequentialGroup()
                .addComponent(lblInformaciones)
                .addGap(30, 30, 30)
                .addGroup(pnInformacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExisten1)
                    .addComponent(lblNumeroChequesSinCobrar)
                    .addComponent(lblTexto1)
                    .addComponent(brnVerSinCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInformacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExisten2)
                    .addComponent(lblNumeroChequesDatosFaltantes)
                    .addComponent(lblTexto2)
                    .addComponent(btnVerDatosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnPaginaPrincipalLayout = new javax.swing.GroupLayout(pnPaginaPrincipal);
        pnPaginaPrincipal.setLayout(pnPaginaPrincipalLayout);
        pnPaginaPrincipalLayout.setHorizontalGroup(
            pnPaginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPaginaPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnPaginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnInformaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnPaginaPrincipalLayout.createSequentialGroup()
                        .addComponent(btnIngresoCheques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnChequesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPaginaPrincipalLayout.setVerticalGroup(
            pnPaginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPaginaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPaginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresoCheques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChequesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnInformaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblGesionCheques.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblGesionCheques.setText("Gestión de cheques");

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
                .addComponent(lblGesionCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
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
                            .addComponent(lblGesionCheques))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnGeneralLayout = new javax.swing.GroupLayout(pnGeneral);
        pnGeneral.setLayout(pnGeneralLayout);
        pnGeneralLayout.setHorizontalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPaginaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnGeneralLayout.setVerticalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addComponent(pnBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPaginaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        chequespamacri.Vistas.Proveedor.ListarProveedores proveedor;
        try {
            proveedor = new chequespamacri.Vistas.Proveedor.ListarProveedores(usrConectado);
            proveedor.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnProveedoresActionPerformed

    public void actualizarPanel(){
        int delayTabla = 10000; //milliseconds ( 10 segundos )
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    Mantenedores.MantenedorCheques mantCheques = new MantenedorCheques();
                    lblNumeroChequesSinCobrar.setText(Integer.toString(mantCheques.cantidadChequesSinCobrar()));
                    lblNumeroChequesDatosFaltantes.setText(Integer.toString(mantCheques.cantidadChequesIncompletos()));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane,"No se ha podido consultar los datos sobre los cheques");
                }
                
            }
        };
        new Timer(delayTabla, taskPerformer).start();
    }
    
    
    private void btnIngresoChequesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoChequesActionPerformed
        chequespamacri.Vistas.Cheque.IngresoCheques ingresoCheques = new chequespamacri.Vistas.Cheque.IngresoCheques(usrConectado);
        ingresoCheques.setVisible(true);
    }//GEN-LAST:event_btnIngresoChequesActionPerformed

    private void btnChequesRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChequesRegistradosActionPerformed
        chequespamacri.Vistas.Cheque.ListarChequesRegistrados cheques;
        try {
            cheques = new chequespamacri.Vistas.Cheque.ListarChequesRegistrados(usrConectado);
            cheques.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Error : " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnChequesRegistradosActionPerformed

    private void brnVerSinCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnVerSinCobrarActionPerformed
        chequespamacri.Vistas.Cheque.SinCobrar.ListarChequesSinCobrar chequesSinCobrar;
        try {
            chequesSinCobrar = new chequespamacri.Vistas.Cheque.SinCobrar.ListarChequesSinCobrar(usrConectado);
            chequesSinCobrar.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Error : " + ex.getMessage());
        }
        
    }//GEN-LAST:event_brnVerSinCobrarActionPerformed

    private void btnVerDatosFaltantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosFaltantesActionPerformed
        chequespamacri.Vistas.Cheque.Incompletos.ListarChequesIncompletos chequesIncompleto;
        try {
            chequesIncompleto = new chequespamacri.Vistas.Cheque.Incompletos.ListarChequesIncompletos(usrConectado);
            chequesIncompleto.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Error : " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnVerDatosFaltantesActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PaginaPrincipal(null).setVisible(true);
                    
                } catch (Exception ex) {
                    Logger.getLogger(PaginaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnVerSinCobrar;
    private javax.swing.JButton btnChequesRegistrados;
    private javax.swing.JButton btnIngresoCheques;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVerDatosFaltantes;
    private javax.swing.JLabel lblExisten1;
    private javax.swing.JLabel lblExisten2;
    private javax.swing.JLabel lblGesionCheques;
    private javax.swing.JLabel lblInformaciones;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNumeroChequesDatosFaltantes;
    private javax.swing.JLabel lblNumeroChequesSinCobrar;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnInformaciones;
    private javax.swing.JPanel pnPaginaPrincipal;
    // End of variables declaration//GEN-END:variables
}
