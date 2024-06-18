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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ShibaXpath
 */
public final class RegistroApp extends Idiomas implements Sonidos {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
    private final InicioApp inicio;
    private String valorCombo;

    /**
     * Creates new form InicioApp
     */
    public RegistroApp() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestión de Bomberos");
        setResizable(false);
        setIconImage(getIconImage());
        inicio = new InicioApp();
        insertar.setMnemonic(KeyEvent.VK_ENTER);
        campoSalario.setVisible(false);
        horasTotal.setVisible(false);
        opcionalHora.setVisible(false);
        opcionalSalario.setVisible(false);
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

        sexos = new javax.swing.ButtonGroup();
        fondo = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        insertar = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        campoSalario = new javax.swing.JTextField();
        campoUsuario = new javax.swing.JTextField();
        contra = new javax.swing.JLabel();
        campoContra = new javax.swing.JPasswordField();
        email = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        rango = new javax.swing.JLabel();
        rangos = new javax.swing.JComboBox<>();
        sexo = new javax.swing.JLabel();
        hombre = new javax.swing.JRadioButton();
        mujer = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        terminosAceptar = new javax.swing.JPanel();
        termino1 = new javax.swing.JCheckBox();
        termino2 = new javax.swing.JCheckBox();
        horasTotal = new javax.swing.JSpinner();
        opcionalHora = new javax.swing.JLabel();
        opcionalSalario = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(940, 645));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(204, 204, 204));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        fondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 590));

        insertar.setBackground(new java.awt.Color(255, 0, 51));
        insertar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        insertar.setForeground(new java.awt.Color(255, 255, 255));
        insertar.setText("INSERTAR");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });
        fondo.add(insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 140, 60));

        usuario.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        usuario.setText("USUARIO:");
        fondo.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        campoSalario.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        campoSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalarioActionPerformed(evt);
            }
        });
        fondo.add(campoSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 150, 30));

        campoUsuario.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        fondo.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 30));

        contra.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        contra.setText("CONTRASEÑA:");
        fondo.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        campoContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraActionPerformed(evt);
            }
        });
        fondo.add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 30));

        email.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        email.setText("EMAIL:");
        fondo.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        campoEmail.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        fondo.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 30));

        rango.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        rango.setText("RANGO:");
        fondo.add(rango, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        rangos.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        rangos.setFocusable(false);
        rangos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangosActionPerformed(evt);
            }
        });
        fondo.add(rangos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 30));
        rangos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch(rangos.getSelectedItem().toString()){
                    case "Sin seleccionar": case "選択されていません":
                    horasTotal.setVisible(false);
                    opcionalHora.setVisible(false);
                    break;
                    case "Bombero Voluntario":
                    horasTotal.setVisible(true);
                    opcionalHora.setVisible(true);
                    opcionalSalario.setVisible(false);
                    campoSalario.setVisible(false);
                    break;
                    case "ボランティア消防団":
                    horasTotal.setVisible(true);
                    opcionalHora.setVisible(true);
                    opcionalSalario.setVisible(false);
                    campoSalario.setVisible(false);
                    break;
                    case "Bombero":
                    horasTotal.setVisible(false);
                    opcionalHora.setVisible(false);
                    opcionalSalario.setVisible(true);
                    campoSalario.setVisible(true);
                    break;
                    case "消防士":
                    horasTotal.setVisible(false);
                    opcionalHora.setVisible(false);
                    opcionalSalario.setVisible(true);
                    campoSalario.setVisible(true);
                    break;
                }
            }

        });

        sexo.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        sexo.setText("Sexo:");
        fondo.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        hombre.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        hombre.setSelected(true);
        hombre.setText("HOMBRE");
        hombre.setFocusable(false);
        hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombreActionPerformed(evt);
            }
        });
        fondo.add(hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        mujer.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        mujer.setText("MUJER");
        mujer.setFocusable(false);
        fondo.add(mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 10, 200));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 20, 200));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 250, 210));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 250, 10));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        fondo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 250, -1));

        volver.setBackground(new java.awt.Color(255, 0, 51));
        volver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        fondo.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 140, 60));

        terminosAceptar.setBackground(new java.awt.Color(204, 204, 204));
        terminosAceptar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        termino1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        termino1.setText("Acepto el tratamiento de mis datos para uso estadistico.");
        termino1.setFocusable(false);
        terminosAceptar.add(termino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        termino2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        termino2.setText("Acepto que se traten mis datos en investigación u otras índoles.");
        termino2.setFocusable(false);
        terminosAceptar.add(termino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        fondo.add(terminosAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 610, 90));

        horasTotal.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        fondo.add(horasTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 60, 40));

        opcionalHora.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        fondo.add(opcionalHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        opcionalSalario.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        fondo.add(opcionalSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, 650, 590));

        jPanel1.setPreferredSize(new java.awt.Dimension(310, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoregistro.jpg"))); // NOI18N
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 290, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 310, -1));

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
        switch (rangos.getSelectedItem().toString())
        {
            case "Sin seleccionar":
                valorCombo = "選択されていません";
                break;
            case "Bombero Voluntario":
                valorCombo = "ボランティア消防団";
                break;
            case "Bombero":
                valorCombo = "消防士";
                break;
        }
        cambiarIdioma(false);
        super.setBandera(false);
        rangos.setSelectedItem(valorCombo);
        opcionalSalario.setText("給与:");
        opcionalHora.setText("総作業時間:");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoregistroJP.jpg")));
    }//GEN-LAST:event_japonesActionPerformed

    private void españolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_españolActionPerformed
        switch (rangos.getSelectedItem().toString())
        {
            case "選択されていません":
                valorCombo = "Sin seleccionar";
                break;
            case "ボランティア消防団":
                valorCombo = "Bombero Voluntario";
                break;
            case "消防士":
                valorCombo = "Bombero";
                break;
        }
        cambiarIdioma(true);
        super.setBandera(true);
        rangos.setSelectedItem(valorCombo);
        opcionalHora.setText("HORAS TOTALES:");
        opcionalSalario.setText("SALARIO:");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoregistro.jpg")));
    }//GEN-LAST:event_españolActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        reproducirSonidoBoton(); // Llama al método reproducirSonidoBoton() para reproducir un sonido de botón
        inicio.setBandera(super.isBandera()); // Establece la bandera de inicio en la instancia de InicioApp usando el valor de la bandera actual
        inicio.cambiarIdioma(super.isBandera()); // Llama al método cambiarIdioma() en la instancia de InicioApp con el valor de la bandera actual
        this.dispose(); // Cierra la ventana actual
        inicio.setVisible(true); // Hace visible la ventana de InicioApp

    }//GEN-LAST:event_volverActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salidaActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        reproducirSonidoBoton(); // Reproduce un sonido de botón
        String pais = ""; // Variable para almacenar el país seleccionado
        if (super.isBandera())
        {
            pais = "ESP"; // Si la bandera es verdadera, establece el país como "ESP" (Español)
        } else
        {
            pais = "JP"; // Si la bandera es falsa, establece el país como "JP" (Japonés)
        }
        inicio.setBandera(super.isBandera()); // Establece la bandera en la instancia de InicioApp usando el valor actual de la bandera
        inicio.cambiarIdioma(super.isBandera()); // Llama al método cambiarIdioma() en la instancia de InicioApp con el valor actual de la bandera
        ConexionBaseDatosNoSQL cn = new ConexionBaseDatosNoSQL(); // Crea una instancia de la clase ConexionBaseDatos
        double salario = 0.0;
        //Sentencia switch que comprueba si el idioma es español o japonés para realizar la insercción del usuario.
        switch (pais)
        {
            case "ESP":
                //Comprueba varios factores en base a la información escrita por el usuario y devuelve en español errores antes de insertar.
                if (cn.comprobarUsuario(campoUsuario.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese nombre.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                } else
                {
                    if (campoUsuario.getText().length() < 2 || campoUsuario.getText().length() > 20)
                    {
                        JOptionPane.showMessageDialog(null, "Introduzca un usuario de mínimo de 2 caracteres y máximo 20.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                    } else if (campoContra.getText().length() < 4)
                    {
                        JOptionPane.showMessageDialog(null, "Introduzca una contraseña de al menos 4 caracteres.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                    } else if (!(EMAIL_PATTERN.matcher(campoEmail.getText().toLowerCase()).matches()))
                    {
                        JOptionPane.showMessageDialog(null, "Introduzca un email válido: ejemplo@gmail.com.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                    } else if (rangos.getSelectedItem().toString().equals("Sin seleccionar"))
                    {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un rango en concreto.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                    } else if (campoSalario.isVisible())
                    {
                        if (campoSalario.getText().length() < 3)
                        {
                            JOptionPane.showMessageDialog(null, "Debe poner un salario válido.\nEjemplo: 1200,56", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                        } else
                        {
                            try
                            {
                                salario = Double.parseDouble(campoSalario.getText().replace(',', '.'));
                                if (!(termino1.isSelected()) || !(termino2.isSelected()))
                                {
                                    JOptionPane.showMessageDialog(null, "Acepte los terminos para continuar.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                                } else
                                {
                                    String sexoElegido = "";
                                    if (hombre.isSelected())
                                    {
                                        sexoElegido = "Hombre";
                                    } else if (mujer.isSelected())
                                    {
                                        sexoElegido = "Mujer";
                                    }
                                    int resultado = JOptionPane.showConfirmDialog(null, "¿Está usted seguro de que todos los datos son correctos?", "Mensaje de pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                    if (resultado == JOptionPane.YES_OPTION)
                                    {
                                        cn.insertarUsuarios(campoUsuario.getText(), campoContra.getText(), campoEmail.getText().toLowerCase(), rangos.getSelectedItem().toString(), sexoElegido, pais, "Sin contenido", "Sin contenido", "Sin contenido", "No encontrado", "No encontrado", "No encontrado", salario, Integer.parseInt(horasTotal.getValue().toString()));
                                        JOptionPane.showMessageDialog(null, "Usuario creado con exito.", "Mensaje de respuesta", JOptionPane.INFORMATION_MESSAGE);
                                        this.dispose();
                                        inicio.setVisible(true);
                                    }
                                }
                            } catch (NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo valores numéricos", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } else
                    {
                        if (!(termino1.isSelected()) || !(termino2.isSelected()))
                        {
                            JOptionPane.showMessageDialog(null, "Acepte los terminos para continuar.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                        } else
                        {
                            String sexoElegido = "";
                            if (hombre.isSelected())
                            {
                                sexoElegido = "Hombre";
                            } else if (mujer.isSelected())
                            {
                                sexoElegido = "Mujer";
                            }
                            int resultado = JOptionPane.showConfirmDialog(null, "¿Está usted seguro de que todos los datos son correctos?", "Mensaje de pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if (resultado == JOptionPane.YES_OPTION)
                            {
                                cn.insertarUsuarios(campoUsuario.getText(), campoContra.getText(), campoEmail.getText().toLowerCase(), rangos.getSelectedItem().toString(), sexoElegido, pais, "Sin contenido", "Sin contenido", "Sin contenido", "No encontrado", "No encontrado", "No encontrado", 0.0, Integer.parseInt(horasTotal.getValue().toString()));
                                JOptionPane.showMessageDialog(null, "Usuario creado con exito.", "Mensaje de respuesta", JOptionPane.INFORMATION_MESSAGE);
                                this.dispose();
                                inicio.setVisible(true);
                            }
                        }
                    }
                }
                break;

            case "JP":
                //Comprueba varios factores en base a la información escrita por el usuario y devuelve en japonés errores antes de insertar.
                if (cn.comprobarUsuario(campoUsuario.getText()))
                {
                    JOptionPane.showMessageDialog(null, "この名前のユーザーはすでに存在しています。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                } else
                {
                    if (campoUsuario.getText().length() < 2 || campoUsuario.getText().length() > 20)
                    {
                        JOptionPane.showMessageDialog(null, "ユーザー名を2文字以上20文字以内で入力してください。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                    } else if (campoContra.getText().length() < 4)
                    {
                        JOptionPane.showMessageDialog(null, "パスワードは4文字以上で入力してください。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                    } else if (!(EMAIL_PATTERN.matcher(campoEmail.getText().toLowerCase()).matches()))
                    {
                        JOptionPane.showMessageDialog(null, "有効なメールアドレスを入力してください。example@gmail.com。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                    } else if (rangos.getSelectedItem().toString().equals("選択されていません"))
                    {
                        JOptionPane.showMessageDialog(null, "具体的なランクを選択してください。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                    } else if (campoSalario.isVisible())
                    {
                        if (campoSalario.getText().length() < 3)
                        {
                            JOptionPane.showMessageDialog(null, "有効な給与を入力してください。\n例：1200.56", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                        } else
                        {
                            try
                            {
                                salario = Double.parseDouble(campoSalario.getText().replace(',', '.'));
                                if (!(termino1.isSelected()) || !(termino2.isSelected()))
                                {
                                    JOptionPane.showMessageDialog(null, "条件に同意します。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                                } else
                                {
                                    String sexoElegido = "";
                                    if (hombre.isSelected())
                                    {
                                        sexoElegido = "男";
                                    } else if (mujer.isSelected())
                                    {
                                        sexoElegido = "女性";
                                    }
                                    int resultado = JOptionPane.showConfirmDialog(null, "すべてのデータに間違いはないですか？", "質問メッセージ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                    if (resultado == JOptionPane.YES_OPTION)
                                    {
                                        cn.insertarUsuarios(campoUsuario.getText(), campoContra.getText(), campoEmail.getText().toLowerCase(), rangos.getSelectedItem().toString(), sexoElegido, pais, "内容がない ということです", "内容がない ということです", "内容がない ということです", "見つかりませんでした", "見つかりませんでした", "見つかりませんでした", salario, Integer.parseInt(horasTotal.getValue().toString()));
                                        JOptionPane.showMessageDialog(null, "ユーザーの作成に成功しました。", "応答メッセージです", JOptionPane.INFORMATION_MESSAGE);
                                        this.dispose();
                                        inicio.setVisible(true);
                                    }
                                }
                            } catch (NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null, "数値のみを入力してください", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } else
                    {
                        if (!(termino1.isSelected()) || !(termino2.isSelected()))
                        {
                            JOptionPane.showMessageDialog(null, "条件に同意します。", "エラーメッセージ", JOptionPane.ERROR_MESSAGE);
                        } else
                        {
                            String sexoElegido = "";
                            if (hombre.isSelected())
                            {
                                sexoElegido = "男";
                            } else if (mujer.isSelected())
                            {
                                sexoElegido = "女性";
                            }
                            int resultado = JOptionPane.showConfirmDialog(null, "すべてのデータに間違いはないですか？", "質問メッセージ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if (resultado == JOptionPane.YES_OPTION)
                            {
                                cn.insertarUsuarios(campoUsuario.getText(), campoContra.getText(), campoEmail.getText().toLowerCase(), rangos.getSelectedItem().toString(), sexoElegido, pais, "内容がない ということです", "内容がない ということです", "内容がない ということです", "見つかりませんでした", "見つかりませんでした", "見つかりませんでした", 0.0, Integer.parseInt(horasTotal.getValue().toString()));
                                JOptionPane.showMessageDialog(null, "ユーザーの作成に成功しました。", "応答メッセージです", JOptionPane.INFORMATION_MESSAGE);
                                this.dispose();
                                inicio.setVisible(true);
                            }
                        }
                    }
                }
                break;
        }
    }//GEN-LAST:event_insertarActionPerformed

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        insertar.doClick();
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void campoContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraActionPerformed
        insertar.doClick();
    }//GEN-LAST:event_campoContraActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        insertar.doClick();
    }//GEN-LAST:event_campoEmailActionPerformed

    private void rangosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rangosActionPerformed

    private void hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hombreActionPerformed

    private void campoSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSalarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo;
    private javax.swing.JPasswordField campoContra;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoSalario;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel email;
    private javax.swing.JMenuItem español;
    private javax.swing.JPanel fondo;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JSpinner horasTotal;
    private javax.swing.JMenu idiomas;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton insertar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuItem japones;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menuRegistro;
    private javax.swing.JRadioButton mujer;
    private javax.swing.JLabel opcionalHora;
    private javax.swing.JLabel opcionalSalario;
    private javax.swing.JLabel rango;
    private javax.swing.JComboBox<String> rangos;
    private javax.swing.JMenuItem salida;
    private javax.swing.JLabel sexo;
    private javax.swing.ButtonGroup sexos;
    private javax.swing.JCheckBox termino1;
    private javax.swing.JCheckBox termino2;
    private javax.swing.JPanel terminosAceptar;
    private javax.swing.JLabel usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambiarIdioma(boolean idioma) {

        if (idioma)
        {
            rangos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
            {
                "Sin seleccionar", "Bombero Voluntario", "Bombero"
            }));
            imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoregistro.jpg")));
            archivo.setText("Archivo");
            insertar.setText("INSERTAR");
            insertar.setFont(new java.awt.Font("Roboto", 0, 18));
            idiomas.setText("Idiomas");
            salida.setText("Desconectar");
            usuario.setText("USUARIO:");
            contra.setText("CONTRASEÑA:");
            email.setText("EMAIL:");
            rango.setText("RANGO:");
            opcionalSalario.setText("SALARIO:");
            sexo.setText("SEXO:");
            opcionalHora.setText("HORAS TOTALES:");
            hombre.setText("Hombre");
            mujer.setText("Mujer");
            terminosAceptar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Terminos y acuerdos de licencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 0, 18), new java.awt.Color(0, 0, 0)));
            termino1.setText("Acepto el tratamiento de mis datos para uso estadistico.");
            termino2.setText("Acepto que se traten mis datos en investigación u otras índoles.");
            volver.setFont(new java.awt.Font("Roboto", 0, 18));
            volver.setText("VOLVER");
            super.setBandera(true);
        } else
        {
            rangos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
            {
                "選択されていません", "ボランティア消防団", "消防士"
            }));
            imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoregistroJP.jpg")));
            archivo.setText("アーカイブ");
            idiomas.setText("語");
            salida.setText("ディスコネクト");
            usuario.setText("ユーザ:");
            contra.setText("パスワ-ド:");
            opcionalHora.setText("総作業時間:");
            opcionalSalario.setText("給与:");
            email.setText("電子メール:");
            rango.setText("士ランク:");
            sexo.setText("性別:");
            hombre.setText("男");
            mujer.setText("女性");
            terminosAceptar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ライセンス条件と契約", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 0, 18), new java.awt.Color(0, 0, 0)));
            termino1.setText("私は、統計的な使用のための私のデータの処理に同意します。");
            termino2.setText("私は、研究またはその他の目的のために私のデータを処理することに同意します。");
            volver.setFont(new java.awt.Font("Dialog", 0, 18));
            volver.setText("戻る");
            insertar.setText("インサート");
            insertar.setFont(new java.awt.Font("Dialog", 0, 18));
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
