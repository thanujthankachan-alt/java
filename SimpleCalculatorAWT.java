import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleCalculatorAWT extends Frame implements ActionListener {

    Label l1, l2, result;
    TextField t1, t2;
    Button add, sub, mul, div;

    public SimpleCalculatorAWT() {
        // Create components
        l1 = new Label("Enter first number:");
        l2 = new Label("Enter second number:");
        result = new Label("Result: ");

        t1 = new TextField();
        t2 = new TextField();

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        // Layout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Add components
        add(l1);
        add(t1);
        add(l2);
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(result);

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Frame settings
        setTitle("Simple Calculator");
        setSize(300, 250);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = n1 + n2;
            } else if (e.getSource() == sub) {
                res = n1 - n2;
            } else if (e.getSource() == mul) {
                res = n1 * n2;
            } else if (e.getSource() == div) {
                if (n2 == 0) {
                    result.setText("Cannot divide by zero!");
                    return;
                }
                res = n1 / n2;
            }

            result.setText("Result: " + res);

        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculatorAWT();
    }
}