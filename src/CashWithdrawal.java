import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashWithdrawal extends JFrame implements ActionListener {

    private JLabel bankName1, bankName2, withdrawalLabel;
    private JTextField withdrawalAmount;
    private JButton withdrawButton, backButton;

    public CashWithdrawal() {
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

        withdrawalLabel = new JLabel("Enter Withdrawal Amount:");
        withdrawalLabel.setBounds(100, 100, 400, 30);
        withdrawalLabel.setFont(new Font("null", Font.BOLD, 30));
        withdrawalLabel.setForeground(new Color(0xFFFF0000, true));
        add(withdrawalLabel);

        withdrawalAmount = new JTextField();
        withdrawalAmount.setBounds(200, 150, 200, 40);
        withdrawalAmount.setFont(new Font("null", Font.BOLD, 30));
        add(withdrawalAmount);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(150, 200, 150, 40);
        withdrawButton.setFont(new Font("null", Font.BOLD, 20));
        withdrawButton.setBackground(new Color(0x2FFF00));
        withdrawButton.setForeground(new Color(0xFF0000));
        withdrawButton.addActionListener(this);
        add(withdrawButton);

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
        if (e.getSource().equals(withdrawButton)) {


            try {
                String withdrawalString = withdrawalAmount.getText();
                double withdrawalAmount = Double.parseDouble(withdrawalString);

                if (withdrawalAmount > 0) {
                    verifyAccount.balance=verifyAccount.balance-withdrawalAmount;
                    JOptionPane.showMessageDialog(this, "Withdrawal of " + withdrawalAmount + " successful.");

                   // this.dispose(); // Close the CashWithdrawal frame after withdrawal
                } else if (withdrawalAmount > verifyAccount.balance){
                    } else{
                    JOptionPane.showMessageDialog(this, "Invalid withdrawal amount. Please enter a valid amount.");
                }
                   // JOptionPane.showMessageDialog(this, "Invalid withdrawal amount. Please enter a valid amount.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
            }
        } else if (e.getSource().equals(backButton)) {
            transactionInterface ti = new transactionInterface();

            this.dispose();
            // Optionally, go back to the main transaction interface or other frames
        }
    }

    public static void main(String[] args) {
        CashWithdrawal cashWithdrawal = new CashWithdrawal();
    }
}
