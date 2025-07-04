package Administrador;

import java.awt.BorderLayout;
import java.awt.Color;
import Login.LoginJFRAME;
import Utilidades.GestorInventario;
import javax.swing.ImageIcon;

/**
 *
 * @author gomez
 */
public class Administrador extends javax.swing.JFrame {
    
    private LoginJFRAME loginFrame;
    int xMouse, yMouse;
    Color fondo = new Color(243, 243, 243);
    Color salida = new Color(206, 70, 41);
    Inventario inventario1 = new Inventario();

    
    /**
     * Creates new form Administrador
     */
    
    public void inicializarHomeAdmin() {
        
        Home home1 = new Home();
        home1.setSize(730, 500);
        home1.setLocation(0, 0);



        Content.removeAll();
        Content.add(home1, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint(); 
    }
    
    public Administrador() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/LogoSinFondo.png")).getImage());
        inicializarHomeAdmin();
        
    }
    
    public Administrador(LoginJFRAME loginFrame) {
    this.loginFrame = loginFrame;
    initComponents();
    setIconImage(new ImageIcon(getClass().getResource("/LogoSinFondo.png")).getImage());
    inicializarHomeAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ProductosPopularesBTN = new javax.swing.JPanel();
        ProductosPopularesTXT = new javax.swing.JLabel();
        InventarioBTN = new javax.swing.JPanel();
        InventarioTXT = new javax.swing.JLabel();
        AdministradorTXT = new javax.swing.JLabel();
        AdminLogo = new javax.swing.JLabel();
        CityBckg = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        ExitBTN = new javax.swing.JPanel();
        ExitLabel = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(234, 234, 234));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductosPopularesBTN.setBackground(new java.awt.Color(76, 76, 76));
        ProductosPopularesBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductosPopularesBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductosPopularesBTNMouseExited(evt);
            }
        });

        ProductosPopularesTXT.setBackground(new java.awt.Color(255, 255, 255));
        ProductosPopularesTXT.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        ProductosPopularesTXT.setForeground(new java.awt.Color(255, 255, 255));
        ProductosPopularesTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductosPopularesTXT.setText("PRODUCTOS  POPULARES");
        ProductosPopularesTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductosPopularesTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosPopularesTXTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductosPopularesTXTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductosPopularesTXTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ProductosPopularesBTNLayout = new javax.swing.GroupLayout(ProductosPopularesBTN);
        ProductosPopularesBTN.setLayout(ProductosPopularesBTNLayout);
        ProductosPopularesBTNLayout.setHorizontalGroup(
            ProductosPopularesBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductosPopularesTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        ProductosPopularesBTNLayout.setVerticalGroup(
            ProductosPopularesBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductosPopularesTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Background.add(ProductosPopularesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 60));

        InventarioBTN.setBackground(new java.awt.Color(76, 76, 76));

        InventarioTXT.setBackground(new java.awt.Color(255, 255, 255));
        InventarioTXT.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        InventarioTXT.setForeground(new java.awt.Color(255, 255, 255));
        InventarioTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InventarioTXT.setText("INVENTARIO");
        InventarioTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InventarioTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioTXTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InventarioTXTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InventarioTXTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout InventarioBTNLayout = new javax.swing.GroupLayout(InventarioBTN);
        InventarioBTN.setLayout(InventarioBTNLayout);
        InventarioBTNLayout.setHorizontalGroup(
            InventarioBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InventarioTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        InventarioBTNLayout.setVerticalGroup(
            InventarioBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InventarioTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Background.add(InventarioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 270, 60));

        AdministradorTXT.setBackground(new java.awt.Color(255, 255, 255));
        AdministradorTXT.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        AdministradorTXT.setForeground(new java.awt.Color(255, 255, 255));
        AdministradorTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdministradorTXT.setText("ADMINISTRADOR");
        Background.add(AdministradorTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, -1));

        AdminLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/admin.png"))); // NOI18N
        AdminLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminLogoMouseClicked(evt);
            }
        });
        Background.add(AdminLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 220));

        CityBckg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/CITY EDITADA.png"))); // NOI18N
        Background.add(CityBckg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 330, -1));

        Header.setBackground(new java.awt.Color(234, 234, 234));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        ExitBTN.setBackground(new java.awt.Color(232, 232, 232));
        ExitBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitBTNMouseExited(evt);
            }
        });

        ExitLabel.setBackground(new java.awt.Color(232, 232, 232));
        ExitLabel.setFont(new java.awt.Font("Roboto Light", 0, 32)); // NOI18N
        ExitLabel.setForeground(new java.awt.Color(0, 0, 0));
        ExitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitLabel.setText("X");
        ExitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitLabel.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout ExitBTNLayout = new javax.swing.GroupLayout(ExitBTN);
        ExitBTN.setLayout(ExitBTNLayout);
        ExitBTNLayout.setHorizontalGroup(
            ExitBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ExitBTNLayout.setVerticalGroup(
            ExitBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 960, Short.MAX_VALUE)
                .addComponent(ExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        Content.setBackground(new java.awt.Color(234, 234, 234));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Background.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 730, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    private void InventarioTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioTXTMouseClicked
        inventario1.actualizarTabla();
        inventario1.setSize(730, 500);
        inventario1.setLocation(0, 0);

        Content.removeAll();
        Content.add(inventario1, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_InventarioTXTMouseClicked

    private void ExitBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBTNMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBTNMouseClicked

    private void ExitBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBTNMouseEntered
        ExitBTN.setBackground(salida);
        ExitLabel.setForeground(Color.white);
    }//GEN-LAST:event_ExitBTNMouseEntered

    private void ExitBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBTNMouseExited
        ExitBTN.setBackground(fondo);
        ExitLabel.setForeground(Color.black);
    }//GEN-LAST:event_ExitBTNMouseExited

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void AdminLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminLogoMouseClicked
        loginFrame.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_AdminLogoMouseClicked

    private void ProductosPopularesTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosPopularesTXTMouseClicked
        mostrarProductosPopulares();
    }//GEN-LAST:event_ProductosPopularesTXTMouseClicked

    private void ProductosPopularesTXTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosPopularesTXTMouseEntered
        ProductosPopularesBTN.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_ProductosPopularesTXTMouseEntered

    private void ProductosPopularesBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosPopularesBTNMouseEntered
        ProductosPopularesBTN.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_ProductosPopularesBTNMouseEntered

    private void ProductosPopularesBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosPopularesBTNMouseExited
        ProductosPopularesBTN.setBackground(new Color(76, 76, 76));
    }//GEN-LAST:event_ProductosPopularesBTNMouseExited

    private void ProductosPopularesTXTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosPopularesTXTMouseExited
        ProductosPopularesBTN.setBackground(new Color(76, 76, 76));
    }//GEN-LAST:event_ProductosPopularesTXTMouseExited

    private void InventarioTXTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioTXTMouseEntered
        InventarioBTN.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_InventarioTXTMouseEntered

    private void InventarioTXTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioTXTMouseExited
        InventarioBTN.setBackground(new Color(76, 76, 76));
    }//GEN-LAST:event_InventarioTXTMouseExited

    
    private void mostrarProductosPopulares() {
        java.util.List<Utilidades.GestorInventario.Producto> topProductos = Utilidades.GestorInventario.obtenerTopProductosVendidos(10);

        StringBuilder mensaje = new StringBuilder("Los 10 productos mas vendidos son:\n\n");

        for (int i = 0; i < topProductos.size(); i++) {
            Utilidades.GestorInventario.Producto p = topProductos.get(i);
            mensaje.append((i + 1)).append(". ");
            if (!"null".equals(p.codigo)) {
                mensaje.append(p.nombre).append(" - ").append(p.vecesComprado).append(" compras");
            } else {
                mensaje.append("null");
            }
            mensaje.append("\n");
        }

        javax.swing.JOptionPane.showMessageDialog(this, mensaje.toString(), "Productos Populares", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLogo;
    private javax.swing.JLabel AdministradorTXT;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel CityBckg;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel ExitBTN;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel InventarioBTN;
    private javax.swing.JLabel InventarioTXT;
    private javax.swing.JPanel ProductosPopularesBTN;
    private javax.swing.JLabel ProductosPopularesTXT;
    // End of variables declaration//GEN-END:variables
}
