/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri.Vistas.Proveedor;

import Biblioteca.Proveedor;
import Biblioteca.Usuario;
import Mantenedores.MantenedorProveedores;
import javax.swing.JOptionPane;

/**
 *
 * @author sebai
 */
public class EditarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form EditarProveedor
     */
    private Usuario usrConectado;
    private Proveedor proveedor;
    public EditarProveedor(Usuario usr,Proveedor prv) {
        initComponents();
        proveedor = prv;
        initDatos();
        this.setLocationRelativeTo(null);
        try {
            usrConectado = usr;
            lblNombreUsuario.setText("Bienvenido " + usrConectado.getNombre());
        } catch (Exception e) {
            System.out.println("No hay usuario conectado");
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
        pnVerProveedores = new javax.swing.JPanel();
        lblRut = new javax.swing.JLabel();
        txtPlazoCobro = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblPlazoCobro = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        lblBuscarProveedor3 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        pnBanner = new javax.swing.JPanel();
        lblProveedores = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(574, 465));
        setPreferredSize(new java.awt.Dimension(574, 465));

        pnVerProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblRut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblRut.setText("Rut");

        txtPlazoCobro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Nombre");

        lblPlazoCobro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPlazoCobro.setText("Plazo cobro");

        txtNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtRut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblBuscarProveedor3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBuscarProveedor3.setText("días");

        btnIngresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnIngresar.setText("Guardar");
        btnIngresar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setPreferredSize(new java.awt.Dimension(150, 50));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnVerProveedoresLayout = new javax.swing.GroupLayout(pnVerProveedores);
        pnVerProveedores.setLayout(pnVerProveedoresLayout);
        pnVerProveedoresLayout.setHorizontalGroup(
            pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVerProveedoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnVerProveedoresLayout.createSequentialGroup()
                        .addGroup(pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlazoCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnVerProveedoresLayout.createSequentialGroup()
                                .addComponent(txtPlazoCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBuscarProveedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnVerProveedoresLayout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnVerProveedoresLayout.setVerticalGroup(
            pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVerProveedoresLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlazoCobro)
                    .addComponent(txtPlazoCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarProveedor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(pnVerProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProveedores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblProveedores.setText("Proveedores");

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
                .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnVerProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnGeneralLayout.setVerticalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addComponent(pnBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnVerProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(pnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        MantenedorProveedores mp = new MantenedorProveedores();
        String rut = txtRut.getText();
        String nombre = txtNombre.getText();
        int plazo = Integer.parseInt(txtPlazoCobro.getText());
        try {
            proveedor.setRut(rut);
            proveedor.setNombre(nombre);
            proveedor.setPlazo(plazo);
            mp.modificar(proveedor);
            JOptionPane.showMessageDialog(rootPane, "Proveedor modificado correctamente");
            this.dispose();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane,"No se ha podido modificar el proveedor");
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
            java.util.logging.Logger.getLogger(EditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProveedor(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblBuscarProveedor3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPlazoCobro;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblRut;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnVerProveedores;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlazoCobro;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables

    private void initDatos() {
        txtNombre.setText(proveedor.getNombre());
        txtPlazoCobro.setText(String.valueOf(proveedor.getPlazo()));
        txtRut.setText(proveedor.getRut());
    }
}
