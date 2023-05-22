import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCalculadora extends JFrame {
    public JPanel panelMain;
    private JTextField textValor1;
    private JTextField textValor2;
    private JButton somarButton1;
    private JTextField textResultado;
public FormCalculadora() {
    somarButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Integer valor1 = Integer.valueOf( textValor1.getText());
            Integer valor2 = Integer.valueOf( textValor2.getText());

            Integer soma = valor1 + valor2;

            textResultado.setText(soma.toString());

        }
    });
}
}
