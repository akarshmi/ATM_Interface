import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel bankName1,bankName2,balance,getBalance;
    JButton back;


    public BalanceEnquiry() {
            setBounds(450,50,650,450);
            setLayout(null);
            setVisible(true);
            getContentPane().setBackground(new Color(0xFF00FF8C, true));


            bankName1 = new JLabel("Tere Bhai");
            bankName1.setBounds(10,10,250,30);
            bankName1.setFont(new Font("null",Font.BOLD,35));
            bankName1.setForeground(new Color(0xFF0000));
            add(bankName1);

            bankName2 = new JLabel("Ka Bank");
            bankName2.setBounds(39,35,250,30);
            bankName2.setFont(new Font("null",Font.BOLD,35));
            bankName2.setForeground(new Color(0xFFFF00C3, true));
            add(bankName2);

            ImageIcon logo = new ImageIcon("Assets/logos.png");
            JLabel logos = new JLabel(logo);
            logos.setBounds(470, -30, 200, 200);
            add(logos);

            balance = new JLabel("Dear Customer Your Account Balance is ");
            balance.setBounds(25,150,650,30);
            balance.setFont(new Font("null",Font.BOLD,30));
            balance.setForeground(new Color(0xFFFF0000, true));
            add(balance);



            getBalance = new JLabel(""+verifyAccount.balance);
            getBalance.setBounds(200,230,250,50);
            getBalance.setFont(new Font("null",Font.BOLD,50));
            getBalance.setForeground(new Color(0xFFAA00FF, true));
            add(getBalance);

            back =new JButton("Back");
            back.setBounds(230,350,130,50);
            back.setFont(new Font("null",Font.BOLD,30));
            back.setForeground(new Color(0xFFAA00FF, true));
            add(back);
            back.addActionListener(this);

    }

    public static void main(String[] args) {
        BalanceEnquiry be = new BalanceEnquiry();
    }

        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(back)){
                        this.dispose();
                        transactionInterface trb = new transactionInterface();
                }
        }
}
