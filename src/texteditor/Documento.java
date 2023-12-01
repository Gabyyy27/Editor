package texteditor;

import java.io.Serializable;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

public class Documento implements Serializable{
    private JTextPane panel;
    private StyledDocument Archivo;
    private Style estilo;

    public Documento(JTextPane panel, StyledDocument Archivo, Style estilo) {
        this.panel = panel;
        this.Archivo = Archivo;
        this.estilo = estilo;
    }

    public JTextPane getPanel() {
        return panel;
    }

    public void setPanel(JTextPane panel) {
        this.panel = panel;
    }

    public StyledDocument getArchivo() {
        return Archivo;
    }

    public void setArchivo(StyledDocument Archivo) {
        this.Archivo = Archivo;
    }

    public Style getEstilo() {
        return estilo;
    }

    public void setEstilo(Style estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Documento: " + "Panel= " + panel + ", Archivo= " + Archivo + ", estilo= " + estilo;
    }
    
    
    
}
