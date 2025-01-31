/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri.Vistas.Cheque;

import Biblioteca.Cheque;
import Biblioteca.Proveedor;
import Biblioteca.Usuario;
import Mantenedores.MantenedorCheques;
import Mantenedores.MantenedorImpresion;
import Mantenedores.MantenedorProveedores;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sebai
 */
public class IngresoCheques extends javax.swing.JFrame {

    /**
     * Creates new form IngresoCheques
     */
    private Usuario usrConectado;
    public IngresoCheques(Usuario usr) {
        initComponents();
        initCombos();
        
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
        pnIngresoCheques = new javax.swing.JPanel();
        pnFormulario = new javax.swing.JPanel();
        lblNumeroCheque = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblNumeroFactura = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        txtNumeroFactura = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtNumeroCheque = new javax.swing.JTextField();
        pnBanner = new javax.swing.JPanel();
        lblIngresoCheques = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(596, 470));

        pnIngresoCheques.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNumeroCheque.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNumeroCheque.setText("N° Cheque");

        lblProveedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblProveedor.setText("Proveedor");

        lblNumeroFactura.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNumeroFactura.setText("N° Factura");

        lblMonto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMonto.setText("Monto");

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNumeroFactura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtMonto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btnIngresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setPreferredSize(new java.awt.Dimension(120, 50));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setPreferredSize(new java.awt.Dimension(120, 50));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtNumeroCheque.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumeroFactura)
                    .addComponent(txtMonto)
                    .addComponent(txtNumeroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCheque)
                    .addComponent(txtNumeroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProveedor)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroFactura)
                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnIngresoChequesLayout = new javax.swing.GroupLayout(pnIngresoCheques);
        pnIngresoCheques.setLayout(pnIngresoChequesLayout);
        pnIngresoChequesLayout.setHorizontalGroup(
            pnIngresoChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIngresoChequesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnIngresoChequesLayout.setVerticalGroup(
            pnIngresoChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIngresoChequesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIngresoCheques.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblIngresoCheques.setText("Ingreso de Cheques");

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
                .addComponent(lblIngresoCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
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
                            .addComponent(lblIngresoCheques))
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
                    .addComponent(pnIngresoCheques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnGeneralLayout.setVerticalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addComponent(pnBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnIngresoCheques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        MantenedorCheques mc = new MantenedorCheques();
        MantenedorProveedores mp = new MantenedorProveedores();
        Proveedor proveedor;
        Cheque ingresado = new Cheque();
        try {
            proveedor = mp.obtenerDatosPorNombre(cmbProveedor.getSelectedItem().toString());
            ingresado.setNroCheque(txtNumeroCheque.getText());
            ingresado.setNroFactura(txtNumeroFactura.getText());
            ingresado.setIdProveedor(proveedor.getId());
            ingresado.setMonto(Integer.parseInt(txtMonto.getText()));
            ingresado.setFechaCobro(LocalDate.now().plusDays(proveedor.getPlazo()));
            ingresado.setEstado("Sin Cobrar"); // ESTADO POR DEFAULT
            mc.ingresar(ingresado);
            
            String[] options = new String[] {"Si", "No"};
            int response = JOptionPane.showOptionDialog(null, "¿ Desea imprimir el cheque " + ingresado.getNroCheque() + " ?", "Imprimir Cheque",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options, options[0]);
            
            if (response==1) {
                JOptionPane.showMessageDialog(rootPane," Ingresado Correctamente ");
            }
            else{
                MantenedorImpresion impresion = new MantenedorImpresion();
                impresion.generarCheque(ingresado,proveedor);
                impresion.imprimir();
                JOptionPane.showMessageDialog(rootPane," Ingresado Correctamente ");
            }
            
            
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"No se ha ingresado el cheque : " + e.getMessage());
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoCheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoCheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoCheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoCheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoCheques(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel lblIngresoCheques;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNumeroCheque;
    private javax.swing.JLabel lblNumeroFactura;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnIngresoCheques;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNumeroCheque;
    private javax.swing.JTextField txtNumeroFactura;
    // End of variables declaration//GEN-END:variables

    private void initCombos() {
        cmbProveedor.removeAllItems(); 
        MantenedorProveedores mp = new MantenedorProveedores();
        ArrayList<Proveedor> listaProveedores = new ArrayList();
        try {
            listaProveedores = mp.listarProveedores();
            for (Proveedor proveedor : listaProveedores) {
                cmbProveedor.addItem(proveedor.getNombre());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"No se pudo iniciar los datos de proveedores : " + e.getMessage());
        }
        
        
        
        
        
    }
}
