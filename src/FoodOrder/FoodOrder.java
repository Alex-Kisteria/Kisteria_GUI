package FoodOrder;

import javax.swing.*;

public class FoodOrder extends JFrame{

    private JButton btnOrder;
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JCheckBox cSoftDrinks;
    private JCheckBox cFries;
    private JCheckBox cBurger;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel panel;

    public FoodOrder(){
        btnOrder.addActionListener(e -> {
            FoodOrder f = this;
            float sum = 0.0F;
            float total = 0;
            if(cPizza.isSelected()){
                sum = sum + 100;
            }
            if(cBurger.isSelected()){
                sum = sum + 80;
            }
            if(cFries.isSelected()){
                sum = sum + 65;
            }
            if(cSoftDrinks.isSelected()){
                sum = sum + 55;
            }
            if(cTea.isSelected()){
                sum = sum + 50;
            }
            if(cSundae.isSelected()){
                sum = sum + 40;
            }

            if(rb5.isSelected()){
                total = (float) (sum*0.05);
                sum = sum - total;
            } else if (rb10.isSelected()){
                total = (float) (sum*0.10);
                sum = sum - total;
            } else if (rb15.isSelected()){
                total = (float) (sum*0.15);
                sum = sum - total;
            }

            JOptionPane.showMessageDialog(f, "The total price is Php " + sum);
        });
    }

    public static void main(String[] args) {
        FoodOrder app = new FoodOrder();
        app.setContentPane(app.panel);
        app.setSize(550, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple calculator");
    }
}
