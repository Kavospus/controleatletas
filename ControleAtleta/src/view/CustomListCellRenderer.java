package view;

import java.awt.Component;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import model.Atirador;

class CustomListCellRenderer extends JButton implements ListCellRenderer{

    public CustomListCellRenderer() {
        super();
    }
    @Override
    public Component getListCellRendererComponent(JList list,
                                       Object value,
                                       int index,
                                       boolean isSelected,
                                       boolean cellHasFocus){
        
        

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        
        Atirador atirador = (Atirador) list.getModel().getElementAt(index);
        setText(atirador.getNome());
    return this;
    }
}
