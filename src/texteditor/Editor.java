package texteditor;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Lourdes
 */
public class Editor extends javax.swing.JFrame {

    public Editor() {
        initComponents();
        Archivo = tp_texto.getStyledDocument();
        estilo = tp_texto.addStyle("MiTexto", null);

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_font.getModel();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < fontNames.length; i++) {
            modelo.addElement(fontNames[i]);
        }
        cb_font.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tp_texto = new javax.swing.JTextPane();
        jToolBar2 = new javax.swing.JToolBar();
        Btn_Guardar = new javax.swing.JButton();
        Btn_AbrirArchivo = new javax.swing.JButton();
        Btn_ColorLetra = new javax.swing.JButton();
        Btn_ColorSub = new javax.swing.JButton();
        Btn_Subrayado = new javax.swing.JButton();
        Btn_Cursiva = new javax.swing.JButton();
        Btn_Negrita = new javax.swing.JButton();
        cb_tamaño = new javax.swing.JComboBox<>();
        cb_font = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Btn_Centrar = new javax.swing.JButton();
        Btn_Derecha = new javax.swing.JButton();
        Btn_Izquierda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor Texto");
        setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setText("Fuente:");

        tp_texto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tp_texto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tp_texto);

        jToolBar2.setRollover(true);

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/guardar.png"))); // NOI18N
        Btn_Guardar.setFocusable(false);
        Btn_Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_GuardarMouseClicked(evt);
            }
        });
        jToolBar2.add(Btn_Guardar);

        Btn_AbrirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/abrir.png"))); // NOI18N
        Btn_AbrirArchivo.setFocusable(false);
        Btn_AbrirArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_AbrirArchivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_AbrirArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_AbrirArchivoMouseClicked(evt);
            }
        });
        jToolBar2.add(Btn_AbrirArchivo);

        Btn_ColorLetra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/letra.png"))); // NOI18N
        Btn_ColorLetra.setFocusable(false);
        Btn_ColorLetra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_ColorLetra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_ColorLetra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ColorLetraMouseClicked(evt);
            }
        });

        Btn_ColorSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/fondo.png"))); // NOI18N
        Btn_ColorSub.setFocusable(false);
        Btn_ColorSub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_ColorSub.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_ColorSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ColorSubMouseClicked(evt);
            }
        });

        Btn_Subrayado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/Subrayado.png"))); // NOI18N
        Btn_Subrayado.setFocusable(false);
        Btn_Subrayado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Subrayado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Subrayado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_SubrayadoMouseClicked(evt);
            }
        });

        Btn_Cursiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/Cursiva.png"))); // NOI18N
        Btn_Cursiva.setFocusable(false);
        Btn_Cursiva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Cursiva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Cursiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CursivaMouseClicked(evt);
            }
        });

        Btn_Negrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/negrita.png"))); // NOI18N
        Btn_Negrita.setToolTipText("");
        Btn_Negrita.setFocusable(false);
        Btn_Negrita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Negrita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Negrita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_NegritaMouseClicked(evt);
            }
        });

        cb_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "18", "24", "36", "48", "60", "72" }));
        cb_tamaño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cb_tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tamañoActionPerformed(evt);
            }
        });

        cb_font.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cb_font.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fontItemStateChanged(evt);
            }
        });

        jLabel2.setText("Tamaño:");

        Btn_Centrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/centrar1.png"))); // NOI18N
        Btn_Centrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CentrarActionPerformed(evt);
            }
        });

        Btn_Derecha.setText("DERECHA");
        Btn_Derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DerechaActionPerformed(evt);
            }
        });

        Btn_Izquierda.setText("IZQUIERDA");
        Btn_Izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IzquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_font, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Negrita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Cursiva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Subrayado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(Btn_Centrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(Btn_Derecha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_ColorSub, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_ColorLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(Btn_Izquierda)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Subrayado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb_font, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addComponent(Btn_Negrita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_Cursiva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Btn_Derecha)
                    .addComponent(Btn_Centrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cb_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_ColorLetra)
                            .addComponent(Btn_ColorSub)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Izquierda)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ColorSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ColorSubMouseClicked
        // TODO add your handling code here:
        try {

            StyleConstants.setBackground(estilo,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.yellow)
            );

            Archivo.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("MiTexto"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_Btn_ColorSubMouseClicked

    private void Btn_ColorLetraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ColorLetraMouseClicked
        // TODO add your handling code here:
        try {

            StyleConstants.setForeground(estilo,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.red)
            );

            Archivo.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("MiTexto"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_Btn_ColorLetraMouseClicked

    private void Btn_NegritaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NegritaMouseClicked
     try {
        boolean isBold = StyleConstants.isBold(estilo);

        StyleConstants.setBold(estilo, !isBold);

        Archivo.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("MiTexto"),
                true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_Btn_NegritaMouseClicked

    private void Btn_CursivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CursivaMouseClicked
        // TODO add your handling code here:
        try {
            boolean isItalic = StyleConstants.isItalic(estilo);
            
            StyleConstants.setItalic(estilo, !isItalic);

            Archivo.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("MiTexto"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_Btn_CursivaMouseClicked

    private void Btn_SubrayadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SubrayadoMouseClicked
        try {
            boolean isUnderline = StyleConstants.isUnderline(estilo);
            
            StyleConstants.setUnderline(estilo, !isUnderline);

            Archivo.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("MiTexto"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_Btn_SubrayadoMouseClicked

    private void cb_tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tamañoActionPerformed
        // TODO add your handling code here:
        StyleConstants.setFontSize(estilo, Integer.parseInt(cb_tamaño.getSelectedItem().toString()));
        Archivo.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("MiTexto"),
                true);
    }//GEN-LAST:event_cb_tamañoActionPerformed

    private void cb_fontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fontItemStateChanged
        StyleConstants.setFontFamily(estilo, cb_font.getSelectedItem().toString());
        Archivo.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("MiTexto"),
                true);
    }//GEN-LAST:event_cb_fontItemStateChanged

    private void Btn_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarMouseClicked
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Editor", "txt");
        jfc.setFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);

        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Editor")) {
                    fichero
                            = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }

                fw = new FileOutputStream(fichero);
                bw = new ObjectOutputStream(fw);
                Documento d = new Documento(tp_texto, Archivo, estilo);
                bw.writeObject(d);
                bw.flush();

                JOptionPane.showMessageDialog(this,
                        "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_Btn_GuardarMouseClicked

    private void Btn_AbrirArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AbrirArchivoMouseClicked
        File fichero = null;
        FileInputStream entrada = null;
        ObjectInputStream objeto = null;
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter(
                            "Editor", "txt");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                entrada
                        = new FileInputStream(fichero);
                objeto
                        = new ObjectInputStream(entrada);
                tp_texto.setText("");
                Documento temp = (Documento) objeto.readObject();
                tp_texto.setText(((Documento) temp).getPanel().getText());
                tp_texto.setDocument(((Documento) temp).getArchivo());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            objeto.close();
            entrada.close();
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_Btn_AbrirArchivoMouseClicked

    private void Btn_CentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CentrarActionPerformed
        // TODO add your handling code here:
        StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_CENTER);

        Archivo.setParagraphAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("MiTexto"),
                true);
    }//GEN-LAST:event_Btn_CentrarActionPerformed

    private void Btn_IzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IzquierdaActionPerformed
        // TODO add your handling code here:
        StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_LEFT);

        Archivo.setParagraphAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("MiTexto"),
                true);
    }//GEN-LAST:event_Btn_IzquierdaActionPerformed

    private void Btn_DerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DerechaActionPerformed
        // TODO add your handling code here:
        StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_RIGHT);

        Archivo.setParagraphAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("MiTexto"),
                true);
    }//GEN-LAST:event_Btn_DerechaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AbrirArchivo;
    private javax.swing.JButton Btn_Centrar;
    private javax.swing.JButton Btn_ColorLetra;
    private javax.swing.JButton Btn_ColorSub;
    private javax.swing.JButton Btn_Cursiva;
    private javax.swing.JButton Btn_Derecha;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Izquierda;
    private javax.swing.JButton Btn_Negrita;
    private javax.swing.JButton Btn_Subrayado;
    private javax.swing.JComboBox<String> cb_font;
    private javax.swing.JComboBox<String> cb_tamaño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextPane tp_texto;
    // End of variables declaration//GEN-END:variables

    StyledDocument Archivo;
    Style estilo;

}
