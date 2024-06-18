/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazgrafica;

import herencias.Idiomas;
import interfacespropias.Sonidos;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author ShibaXpath
 */
public class InicioApp extends Idiomas implements Sonidos {

    /**
     * Creates new form InicioApp
     */
    public InicioApp() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestión de Bomberos");
        setResizable(false);
        setIconImage(getIconImage());
    }

    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/miicono.jpg"));

        return icono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        inicioS = new javax.swing.JButton();
        registro = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        menuInicio = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        salida = new javax.swing.JMenuItem();
        idiomas = new javax.swing.JMenu();
        español = new javax.swing.JMenuItem();
        japones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(204, 204, 204));
        fondo.setPreferredSize(new java.awt.Dimension(450, 650));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 222, 250, 10));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        fondo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 250, -1));

        inicioS.setBackground(new java.awt.Color(255, 0, 51));
        inicioS.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        inicioS.setForeground(new java.awt.Color(255, 255, 255));
        inicioS.setText("INICIAR SESIÓN");
        inicioS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioSActionPerformed(evt);
            }
        });
        fondo.add(inicioS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 270, 70));

        registro.setBackground(new java.awt.Color(255, 0, 51));
        registro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setText("REGISTRARSE");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        fondo.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 270, 70));

        salir.setBackground(new java.awt.Color(255, 0, 51));
        salir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("SALIR DE LA APLICACIÓN");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        fondo.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 270, 70));

        archivo.setText("Archivo");

        salida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        salida.setText("Salir");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        archivo.add(salida);

        menuInicio.add(archivo);

        idiomas.setText("Idiomas");

        español.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        español.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espaicon.png"))); // NOI18N
        español.setText("Español");
        español.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                españolActionPerformed(evt);
            }
        });
        idiomas.add(español);

        japones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_DOWN_MASK));
        japones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/japoicon.png"))); // NOI18N
        japones.setText("日本語");
        japones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japonesActionPerformed(evt);
            }
        });
        idiomas.add(japones);

        menuInicio.add(idiomas);

        setJMenuBar(menuInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        reproducirSonidoBoton();
        JOptionPane.showMessageDialog(null, "Aplicación cerrada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        RegistroApp registro = new RegistroApp();
        reproducirSonidoBoton();
        registro.setBandera(super.isBandera());
        registro.cambiarIdioma(super.isBandera());
        this.dispose();
        registro.setVisible(true);
    }//GEN-LAST:event_registroActionPerformed

    private void inicioSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioSActionPerformed
        IniciarSesionApp sesion = new IniciarSesionApp();
        reproducirSonidoBoton();
        sesion.setBandera(super.isBandera());
        sesion.cambiarIdioma(super.isBandera());
        this.dispose();
        sesion.setVisible(true);
    }//GEN-LAST:event_inicioSActionPerformed

    private void españolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_españolActionPerformed
        cambiarIdioma(true);
        super.setBandera(true);
    }//GEN-LAST:event_españolActionPerformed

    private void japonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japonesActionPerformed
        cambiarIdioma(false);
        super.setBandera(false);
    }//GEN-LAST:event_japonesActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo;
    private javax.swing.JMenuItem español;
    private javax.swing.JPanel fondo;
    private javax.swing.JMenu idiomas;
    private javax.swing.JButton inicioS;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem japones;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menuInicio;
    private javax.swing.JButton registro;
    private javax.swing.JMenuItem salida;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambiarIdioma(boolean idioma) {
        if (idioma)
        {
            // Si el idioma es verdadero (idioma activo: español)
            archivo.setText("Archivo");
            idiomas.setText("Idiomas");
            salida.setText("Desconectar");
            inicioS.setText("INICIAR SESIÓN");
            registro.setText("REGISTRARSE");
            salir.setText("SALIR DE LA APLICACIÓN");
            inicioS.setFont(new java.awt.Font("Roboto", 0, 18));
            registro.setFont(new java.awt.Font("Roboto", 0, 18));
            salir.setFont(new java.awt.Font("Roboto", 0, 18));
            super.setBandera(true);
        } else
        {
            // Si el idioma es falso (idioma activo: japonés)
            archivo.setText("アーカイブ");
            idiomas.setText("語");
            salida.setText("ディスコネクト");
            inicioS.setText("ログイン");
            registro.setText("登録");
            salir.setText("アプリケーションを終了する");
            inicioS.setFont(new java.awt.Font("Dialog", 0, 18));
            registro.setFont(new java.awt.Font("Dialog", 0, 18));
            salir.setFont(new java.awt.Font("Dialog", 0, 18));
            super.setBandera(false);
        }

    }

    @Override
    public AudioClip obtenerSonido() {
        AudioClip sonidoBoton;
        URL url = getClass().getResource("/sonidos/raton.wav");
        sonidoBoton = java.applet.Applet.newAudioClip(url);
        return sonidoBoton;
    }

    @Override
    public void reproducirSonidoBoton() {
        obtenerSonido().play();
    }
}
