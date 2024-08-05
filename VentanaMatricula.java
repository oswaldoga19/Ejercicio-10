import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMatricula extends JFrame {
    private JTextField inscripcionTextField;
    private JTextField nombresTextField;
    private JTextField patrimonioTextField;
    private JTextField estratoTextField;
    private JLabel resultadoLabel;

    public VentanaMatricula() {
        setTitle("Cálculo de Matrícula");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel inscripcionLabel = new JLabel("Número de inscripción:");
        inscripcionTextField = new JTextField();
        JLabel nombresLabel = new JLabel("Nombres:");
        nombresTextField = new JTextField();
        JLabel patrimonioLabel = new JLabel("Patrimonio:");
        patrimonioTextField = new JTextField();
        JLabel estratoLabel = new JLabel("Estrato:");
        estratoTextField = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel();

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int inscripcion = Integer.parseInt(inscripcionTextField.getText());
                    String nombres = nombresTextField.getText();
                    double patrimonio = Double.parseDouble(patrimonioTextField.getText());
                    int estrato = Integer.parseInt(estratoTextField.getText());

                    MatriculaUniversidad matricula = new MatriculaUniversidad(inscripcion, nombres, patrimonio, estrato);
                    double pagoMatricula = matricula.calcularPagoMatricula();
                    resultadoLabel.setText("Pago de matrícula: $" + pagoMatricula);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Ingresa valores válidos.");
                }
            }
        });

        panel.add(inscripcionLabel);
        panel.add(inscripcionTextField);
        panel.add(nombresLabel);
        panel.add(nombresTextField);
        panel.add(patrimonioLabel);
        panel.add(patrimonioTextField);
        panel.add(estratoLabel);
        panel.add(estratoTextField);
        panel.add(calcularButton);
        panel.add(resultadoLabel);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaMatricula();
    }
}

