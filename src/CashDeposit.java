import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class CashDeposit extends JFrame implements ActionListener {

    private JLabel bankName1, bankName2, withdrawalLabel;
    private JTextField depositAmount;
    private JButton depositButton, backButton;

    public CashDeposit() {
        setBounds(450, 50, 650, 350);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(0xFF00FF8C, true));

        bankName1 = new JLabel("Tere Bhai");
        bankName1.setBounds(10, 10, 250, 30);
        bankName1.setFont(new Font("null", Font.BOLD, 35));
        bankName1.setForeground(new Color(0xFF0000));
        add(bankName1);

        bankName2 = new JLabel("Ka Bank");
        bankName2.setBounds(39, 35, 250, 30);
        bankName2.setFont(new Font("null", Font.BOLD, 35));
        bankName2.setForeground(new Color(0xFFFF00C3, true));
        add(bankName2);

        withdrawalLabel = new JLabel("Enter Deposit Amount:");
        withdrawalLabel.setBounds(100, 100, 400, 30);
        withdrawalLabel.setFont(new Font("null", Font.BOLD, 30));
        withdrawalLabel.setForeground(new Color(0xFFFF0000, true));
        add(withdrawalLabel);

        depositAmount = new JTextField();
        depositAmount.setBounds(200, 150, 200, 40);
        depositAmount.setFont(new Font("null", Font.BOLD, 30));
        add(depositAmount);

        depositButton = new JButton("Deposit");
        depositButton.setBounds(150, 200, 150, 40);
        depositButton.setFont(new Font("null", Font.BOLD, 20));
        depositButton.setBackground(new Color(0x2FFF00));
        depositButton.setForeground(new Color(0xFF0000));
        depositButton.addActionListener(this);
        add(depositButton);

        backButton = new JButton("Back");
        backButton.setBounds(350, 200, 150, 40);
        backButton.setFont(new Font("null", Font.BOLD, 20));
        backButton.setBackground(new Color(0xFF2424));
        backButton.setForeground(new Color(0xE6FF00));
        backButton.addActionListener(this);
        add(backButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(depositButton)) {


            try {
                String depositString = depositAmount.getText();
                double depositAmount = Double.parseDouble(depositString);

                if (depositAmount > 0) {
                    if (ConnectionProvider.con==null) {
                        JOptionPane.showMessageDialog(null, "Server is currently down..");
                    } else{
                        verifyAccount.balance = verifyAccount.balance + depositAmount;
                    JOptionPane.showMessageDialog(this, "Deposit of " + depositAmount + " successful.");
                }
                    // this.dispose(); // Close the CashDeposit frame after withdrawal
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Deposit amount. Please enter a valid amount.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
            } catch (Exception ex) {
                if (ex.getMessage().contains("\"ConnectionProvider.con\" is null")){
                    JOptionPane.showMessageDialog(null, "Server is currently down..");

                }
                throw new RuntimeException(ex);

            }
        } else if (e.getSource().equals(backButton)) {
            transactionInterface ti = new transactionInterface();

            this.dispose();
            // Optionally, go back to the main transaction interface or other frames
        }
    }

    public static void main(String[] args) {
        CashDeposit CashDeposit = new CashDeposit();
    }
}
