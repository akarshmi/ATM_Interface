import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class transactionInterface extends JFrame implements ActionListener {

    JLabel bankName1,bankName2,transactionAction,nameHolder;
    JButton balanceEnquiry,miniStatement,cashWithdraw,cashDeposit,changePin,exit;

    public transactionInterface() {
        setBounds(450,50,650,650);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(0xFF00FFFF, true));


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



//        balanceEnquiry,miniStatement,cashWithdraw,cashDeposit,changePin,exit;

        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(0,300,250,50);
        balanceEnquiry.setFont(new Font("Times Roman New",Font.BOLD,20));
        add(balanceEnquiry);

        miniStatement =new JButton("Mini Statement");
        miniStatement.setBounds(0,360,250,50);
        miniStatement.setFont(new Font("Times Roman New",Font.BOLD,20));
        add(miniStatement);

        cashWithdraw =new JButton("Cash Withdraw");
        cashWithdraw.setBounds(0,420,250,50);
        cashWithdraw.setFont(new Font("Times Roman New",Font.BOLD,20));
        add(cashWithdraw);

        cashDeposit =new JButton("Cash Deposit");
        cashDeposit.setBounds(388,300,250,50);
        cashDeposit.setFont(new Font("Times Roman New",Font.BOLD,20));
        add(cashDeposit);

        changePin =new JButton("Change Pin");
        changePin.setBounds(388,360,250,50);
        changePin.setFont(new Font("Times Roman New",Font.BOLD,20));
        add(changePin);

        exit =new JButton("Exit");
        exit.setBounds(388,420,250,50);
        exit.setFont(new Font("Times Roman New",Font.BOLD,20));
        add(exit);

        transactionAction = new JLabel("Choose any Option");
        transactionAction.setBounds(150,200,350,70);
        transactionAction.setFont(new Font("null",Font.BOLD,35));
        add(transactionAction);

//        verifyAccount.cardHolder
        nameHolder = new JLabel("Hello Mr. "+verifyAccount.cardHolder);
        nameHolder.setBounds(110,100,450,70);
        nameHolder.setForeground(new Color(0x0004FF));
        nameHolder.setFont(new Font("null",Font.BOLD,35));
        add(nameHolder);

        balanceEnquiry.addActionListener(this);
        exit.addActionListener(this);
        changePin.addActionListener(this);
        cashDeposit.addActionListener(this);
        cashWithdraw.addActionListener(this);
        miniStatement.addActionListener(this);
    }

    static String beq="BalanceEnquiry",cwd="CashWithdraw",cdt="CashDeposit",cpn="ChangePin",mst="MiniStatement";

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(balanceEnquiry)) {
            PinVerify pinVerify = new PinVerify(beq);
            pinVerify.setVisible(true);
            this.dispose();
        }


        if (e.getSource().equals(exit)){
            this.dispose();
        }

        if (e.getSource().equals(cashWithdraw)){
            PinVerify pinVerify = new PinVerify(cwd);
            pinVerify.setVisible(true);
            this.dispose();
        }

        if (e.getSource().equals(cashDeposit)){

            PinVerify pinVerify = new PinVerify(cdt);
            pinVerify.setVisible(true);
            CashDeposit cd = new CashDeposit();
            this.dispose();
        }

        if (e.getSource().equals(changePin)){

            PinVerify pinVerify = new PinVerify(cpn);
            pinVerify.setVisible(true);
            this.dispose();
        }
        if (e.getSource().equals(miniStatement)){

            PinVerify pinVerify = new PinVerify(mst);
            pinVerify.setVisible(true);

            this.dispose();
        }
    }

    public static void main(String[] args) {
        transactionInterface ti = new transactionInterface();
    }

}
