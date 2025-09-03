import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {

    // UI components
    private JLabel labelUser, labelPass, labelMessage;
    private JTextField textUser;
    private JPasswordField textPass;
    private JButton buttonLogin;

    public LoginPage() {
        // Frame setup
        setTitle("Login Page");
        setSize(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Username
        labelUser = new JLabel("Username:");
        textUser = new JTextField();

        // Password
        labelPass = new JLabel("Password:");
        textPass = new JPasswordField();

        // Login Button
        buttonLogin = new JButton("Login");
        buttonLogin.addActionListener(this);

        // Message Label
        labelMessage = new JLabel("");

        // Adding components to frame
        add(labelUser);
        add(textUser);
        add(labelPass);
        add(textPass);
        add(new JLabel("")); // empty space
        add(buttonLogin);
        add(labelMessage);

        setVisible(true);
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = textUser.getText();
        String password = new String(textPass.getPassword());

        // Simple authentication logic
        if (username.equals("admin") && password.equals("1234")) {
            labelMessage.setText("Login successful!");
            labelMessage.setForeground(Color.GREEN);
        } else {
            labelMessage.setText("Invalid credentials!");
            labelMessage.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
