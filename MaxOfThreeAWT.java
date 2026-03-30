import java.awt.*;
import java.awt.event.*;

public class MaxOfThreeAWT extends Frame implements ActionListener {

    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button b;

    public MaxOfThreeAWT() {
        // Create components
        l1 = new Label("Enter first number:");
        l2 = new Label("Enter second number:");
        l3 = new Label("Enter third number:");
        result = new Label("Maximum: ");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        b = new Button("Find Maximum");

        // Set layout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Add components
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b);  add(result);

        // Add action listener
        b.addActionListener(this);

        // Frame settings
        setTitle("Maximum of Three Numbers");
        setSize(350, 200);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); // FIXED
            }
        });
    }

    // Action event
    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText());

            int max = Math.max(n1, Math.max(n2, n3)); // cleaner

            result.setText("Maximum: " + max);

        } catch (NumberFormatException ex) {
            result.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new MaxOfThreeAWT();
    }
}