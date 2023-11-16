package Calculator;

import LeapYear.LeapYear;

import javax.swing.*;

public class Calculator extends JFrame{
    private JButton btn_Compute;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JLabel tfNumber1Lbl;
    private JLabel tfNumber2Lbl;
    private JLabel lblResult_Label;
    private JPanel panel;
    private JTextArea textArea1;

    public Calculator(){
        Calculator calc = this;
        btn_Compute.addActionListener(e -> {
            String num1 = tfNumber1.getText();
            String num2 = tfNumber2.getText();

            int _num1 = Integer.parseInt(num1);
            int _num2 = Integer.parseInt(num2);

            int result;

            if(cbOperations.getSelectedIndex() == 0){
                result = _num1 + _num2;
                textArea1.append(String.valueOf(result));
            } else if (cbOperations.getSelectedIndex() == 1){
                result = _num1 - _num2;
                textArea1.append(String.valueOf(result));
            } else if (cbOperations.getSelectedIndex() == 2){
                result = _num1 / _num2;
                textArea1.append(String.valueOf(result));
            } else if (cbOperations.getSelectedIndex() == 3){
                result = _num1 * _num2;
                textArea1.append(String.valueOf(result));
            }

        });
    }

    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.panel);
        app.setSize(550, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple calculator");
    }
}
