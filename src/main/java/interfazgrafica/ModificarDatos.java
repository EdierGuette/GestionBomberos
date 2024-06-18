/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazgrafica;

import conexion.ConexionBaseDatosNoSQL;
import herencias.Idiomas;
import interfacespropias.Sonidos;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ShibaXpath
 */
public final class ModificarDatos extends Idiomas implements Sonidos {

    private String sexoUser, nombreUser;
    private static final Pattern EMAIL_PATTERN = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
    private final Plataforma plata;

    /**
     * Creates new form InicioApp
     */
    public ModificarDatos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestión de Bomberos");
        setResizable(false);
        setIconImage(getIconImage());
        plata = new Plataforma();
        modificar.setMnemonic(KeyEvent.VK_ENTER);
    }

    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/miicono.jpg"));

        return icono;
    }

    public void setEmailUser(String emailUser) {
        campoEmail.setText(emailUser);  // Establece el texto del campo de email con el valor proporcionado
    }

    public void setRangoUser(String rangoUser) {
        if (rangoUser.equals("Bombero Voluntario") || rangoUser.equals("ボランティア消防団"))
        {
            rangos.setSelectedIndex(0);  // Establece la selección del combo box de rangos en el índice 0
        } else if (rangoUser.equals("Bombero") || rangoUser.equals("消防士"))
        {
            rangos.setSelectedIndex(1);  // Establece la selección del combo box de rangos en el índice 1
        }
    }

    public void setSexoUser(String sexoUser) {
        this.sexoUser = sexoUser;  // Establece el valor de la variable sexoUser con el valor proporcionado
        if (sexoUser.equals("Hombre"))
        {
            hombre.setSelected(true);  // Selecciona el radio button de hombre
        } else if (sexoUser.equals("Mujer"))
        {
            mujer.setSelected(true);  // Selecciona el radio button de mujer
        }
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;  // Establece el valor de la variable nombreUser con el valor proporcionado
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexos = new javax.swing.ButtonGroup();
        fondo = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        rango = new javax.swing.JLabel();
        rangos = new javax.swing.JComboBox<>();
        sexo = new javax.swing.JLabel();
        hombre = new javax.swing.JRadioButton();
        mujer = new javax.swing.JRadioButton();
        logo = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        campoContra = new javax.swing.JPasswordField();
        contra = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        menuRegistro = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        salida = new javax.swing.JMenuItem();
        idiomas = new javax.swing.JMenu();
        español = new javax.swing.JMenuItem();
        japones = new javax.swing.JMenuItem();

        sexos.add(hombre);
        sexos.add(mujer);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(204, 204, 204));
        fondo.setPreferredSize(new java.awt.Dimension(600, 490));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        email.setText("EMAIL:");
        fondo.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        campoEmail.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        fondo.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        rango.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        rango.setText("RANGO:");
        fondo.add(rango, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        rangos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        rangos.setFocusable(false);
        rangos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangosActionPerformed(evt);
            }
        });
        fondo.add(rangos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 30));

        sexo.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        sexo.setText("SEXO:");
        fondo.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        hombre.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        hombre.setSelected(true);
        hombre.setText("HOMBRE");
        hombre.setFocusable(false);
        fondo.add(hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        mujer.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        mujer.setText("MUJER");
        mujer.setFocusable(false);
        fondo.add(mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        fondo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 250, -1));

        modificar.setBackground(new java.awt.Color(255, 0, 51));
        modificar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        fondo.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 140, 60));

        volver.setBackground(new java.awt.Color(255, 0, 51));
        volver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        fondo.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 140, 60));

        campoContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraActionPerformed(evt);
            }
        });
        fondo.add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 30));

        contra.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        contra.setText("CONTRASEÑA:");
        fondo.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        fondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 490));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 600, 490));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoModificar.jpg"))); // NOI18N
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 5, 610, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 490));

        archivo.setText("Archivo");

        salida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        salida.setText("Salir");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        archivo.add(salida);

        menuRegistro.add(archivo);

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

        menuRegistro.add(idiomas);

        setJMenuBar(menuRegistro);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void japonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japonesActionPerformed
        cambiarIdioma(false);
        super.setBandera(false);
    }//GEN-LAST:event_japonesActionPerformed

    private void españolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_españolActionPerformed
        cambiarIdioma(true);
        super.setBandera(true);
    }//GEN-LAST:event_españolActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        reproducirSonidoBoton();
        plata.setBandera(super.isBandera());
        plata.cambiarIdioma(super.isBandera());
        plata.setNombreUsuario(nombreUser);
        this.dispose();
        plata.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salidaActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        reproducirSonidoBoton();
        ConexionBaseDatosNoSQL cn = new ConexionBaseDatosNoSQL();
        String pais = "";
        if (super.isBandera())
        {
            pais = "ESP";
        } else
        {
            pais = "JP";
        }
        switch (pais)
        {
            case "ESP":
                //Comprueba varios factores en base a la información escrita por el usuario y devuelve en español errores y modifica luego.
                if (!(EMAIL_PATTERN.matcher(campoEmail.getText().toLowerCase()).matches()))
                {
                    JOptionPane.showMessageDialog(null, "Introduzca un email válido: ejemplo@gmail.com.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                } else
                {
                    try
                    {
                        if (hombre.isSelected())
                        {
                            sexoUser = "Hombre";
                        } else if (mujer.isSelected())
                        {
                            sexoUser = "Mujer";
                        }
                        if (cn.comprobarPass(nombreUser, cn.encryptPassword(campoContra.getText())))
                        {
                            JOptionPane.showMessageDialog(null, "No puede ingresar la misma contraseña.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                        } else if (campoContra.getText().length() < 4)
                        {
                            JOptionPane.showMessageDialog(null, "No has introducido una contraseña válida, mínimo 4 carácteres.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                        } else
                        {
                            cn.modificarUsuarios(nombreUser, sexoUser, campoEmail.getText().toLowerCase(), rangos.getSelectedItem().toString(), campoContra.getText());
                            JOptionPane.showMessageDialog(null, "Usuario modificado con exito.", "Mensaje de respuesta", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            plata.setNombreUsuario(nombreUser);
                            plata.setBandera(super.isBandera());
                            plata.cambiarIdioma(super.isBandera());
                            plata.setVisible(true);
                        }
                    } catch (NullPointerException e)
                    {
                    }
                }
                break;
            case "JP":
                //Comprueba varios factores en base a la información escrita por el usuario y devuelve en japonés errores y modifica luego.
                if (!(EMAIL_PATTERN.matcher(campoEmail.getText().toLowerCase()).matches()))
                {
                    JOptionPane.showMessageDialog(null, "有効なメールアドレスを入力してください。example@gmail.com。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                } else
                {
                    try
                    {
                        if (hombre.isSelected())
                        {
                            sexoUser = "男";
                        } else if (mujer.isSelected())
                        {
                            sexoUser = "女性";
                        }
                        if (cn.comprobarPass(nombreUser, cn.encryptPassword(campoContra.getText())))
                        {
                            JOptionPane.showMessageDialog(null, "同じパスワードを入力することはできません。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                        } else if (campoContra.getText().length() < 4)
                        {
                            JOptionPane.showMessageDialog(null, "有効なパスワードを入力していません。最低4文字必要です。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);

                        } else
                        {
                            cn.modificarUsuarios(nombreUser, sexoUser, campoEmail.getText().toLowerCase(), rangos.getSelectedItem().toString(), campoContra.getText());
                            JOptionPane.showMessageDialog(null, "ユーザーが正常に変更されました。", "応答メッセージ", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            plata.setNombreUsuario(nombreUser);
                            plata.setBandera(super.isBandera());
                            plata.cambiarIdioma(super.isBandera());
                            plata.setVisible(true);
                        }

                    } catch (NullPointerException e)
                    {
                    }
                }
                break;
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        modificar.doClick();
    }//GEN-LAST:event_campoEmailActionPerformed

    private void rangosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rangosActionPerformed

    private void campoContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraActionPerformed
        modificar.doClick();
    }//GEN-LAST:event_campoContraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo;
    private javax.swing.JPasswordField campoContra;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel email;
    private javax.swing.JMenuItem español;
    private javax.swing.JPanel fondo;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JMenu idiomas;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuItem japones;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menuRegistro;
    private javax.swing.JButton modificar;
    private javax.swing.JRadioButton mujer;
    private javax.swing.JLabel rango;
    private javax.swing.JComboBox<String> rangos;
    private javax.swing.JMenuItem salida;
    private javax.swing.JLabel sexo;
    private javax.swing.ButtonGroup sexos;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambiarIdioma(boolean idioma) {

        if (idioma)
        {
            // Si el idioma es verdadero (ESP)

            // Configuración de la interfaz en español
            rangos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
            {
                "Bombero Voluntario", "Bombero"
            }));
            archivo.setText("Archivo");
            idiomas.setText("Idiomas");
            salida.setText("Desconectar");
            email.setText("EMAIL:");
            rango.setText("RANGO:");
            sexo.setText("SEXO:");
            hombre.setText("Hombre");
            mujer.setText("Mujer");
            modificar.setText("MODIFICAR");
            contra.setText("CONTRASEÑA:");
            volver.setFont(new java.awt.Font("Roboto", 0, 18));
            modificar.setFont(new java.awt.Font("Roboto", 0, 18));
            imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoModificar.jpg")));
            volver.setText("VOLVER");
            super.setBandera(true); // Establece la bandera en verdadero
        } else
        {
            // Si el idioma es falso (JP)

            // Configuración de la interfaz en japonés
            rangos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
            {
                "ボランティア消防団", "消防士"
            }));
            archivo.setText("アーカイブ");
            idiomas.setText("語");
            salida.setText("ディスコネクト");
            imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoModificarJP.jpg")));
            email.setText("電子メール:");
            rango.setText("士ランク:");
            sexo.setText("性別:");
            contra.setText("パスワード:");
            hombre.setText("男");
            mujer.setText("女性");
            volver.setFont(new java.awt.Font("Dialog", 0, 18));
            volver.setText("戻る");
            modificar.setFont(new java.awt.Font("Dialog", 0, 18));
            modificar.setText("修正する");
            super.setBandera(false); // Establece la bandera en falso
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