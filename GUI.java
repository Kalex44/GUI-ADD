import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    private JTextField numField1;
    private JTextField numField2;
    private JButton addButton;
    private JLabel resultLabel;

    public GUI() {
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));//layout da tabela da gui

        numField1 = new JTextField();
        numField2 = new JTextField();
        addButton = new JButton("Add");
        resultLabel = new JLabel();

        addButton.addActionListener(this);

        add(new JLabel("Number 1:"));
        add(numField1);
        add(new JLabel("Number 2:"));
        add(numField2);
        add(addButton);
        add(resultLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {// verificamos se a origem do evento é o botão "Add" 
            try {
                int num1 = Integer.parseInt(numField1.getText());//transforma em numeros inteiros
                int num2 = Integer.parseInt(numField2.getText());//transforma em numeros inteiros
                int result = num1 + num2;//resultado
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUI calculator = new GUI();
            calculator.setVisible(true);
        });
    }
}