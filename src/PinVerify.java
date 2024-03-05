import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PinVerify extends JFrame implements ActionListener {

    static double balance;
    static String  enteredPin, cardHolder;
    JLabel bankName1,bankName2,enterPin;
    JButton one,two,three,four,five,six,seven,eight,nine,zero,reset,submit;
    String inputedpin;
    JPasswordField pin;
    String flag;

    public PinVerify(String flag){
        setBounds(450,50,650,750);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(0xFF00FFD0, true));


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

        pin = new JPasswordField(16);
        pin.setBounds(180,200,300,50);
        pin.setFont(new Font("s",Font.BOLD,30));

        add(pin);



//        JButton one,two,three,four,five,six,seven,eight,nine,zero,back,reset,submit;

        one = new JButton("1");
        one.setBounds(180,300,50,50);
        one.setFont(new Font("s",Font.BOLD,25));
        add(one);

        two = new JButton("2");
        two.setBounds(305,300,50,50);
        two.setFont(new Font("s",Font.BOLD,25));
        add(two);

        three= new JButton("3");
        three.setBounds(430,300,50,50);
        three.setFont(new Font("s",Font.BOLD,25));
        add(three);

        four= new JButton("4");
        four.setBounds(180,400,50,50);
        four.setFont(new Font("s",Font.BOLD,25));
        add(four);

        five= new JButton("5");
        five.setBounds(305,400,50,50);
        five.setFont(new Font("s",Font.BOLD,25));
        add(five);

        six= new JButton("6");
        six.setBounds(430,400,50,50);
        six.setFont(new Font("s",Font.BOLD,25));
        add(six);

        seven= new JButton("7");
        seven.setBounds(180,500,50,50);
        seven.setFont(new Font("s",Font.BOLD,25));
        add(seven);

        eight= new JButton("8");
        eight.setBounds(305,500,50,50);
        eight.setFont(new Font("s",Font.BOLD,25));
        add(eight);

        nine= new JButton("9");
        nine.setBounds(430,500,50,50);
        nine.setFont(new Font("s",Font.BOLD,25));
        add(nine);

        zero= new JButton("0");
        zero.setBounds(305,600,50,50);
        zero.setFont(new Font("s",Font.BOLD,25));
        add(zero);

        reset= new JButton("Reset");
        reset.setBounds(180,600,100,50);
        reset.setFont(new Font("s",Font.BOLD,20));
        reset.setBackground(new Color(0xFF2424));
        reset.setForeground(new Color(0xE6FF00));
        add(reset);

        submit= new JButton("Submit");
        submit.setBounds(380,600,100,50);
        submit.setFont(new Font("s",Font.BOLD,20));
        submit.setBackground(new Color(0x2FFF00));
        submit.setForeground(new Color(0xFF0000));
        add(submit);

        enterPin = new JLabel("Enter The Pin");
        enterPin.setBounds(220,125,200,50);
        enterPin.setFont(new Font("a",Font.BOLD,30));
        enterPin.setForeground(new Color(0x0004FF));
        add(enterPin);


//       one,two,three,four,five,six,seven,eight,nine,zero,back,reset,
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        submit.addActionListener(this);
        reset.addActionListener(this);

        this.flag = flag;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(one)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "1";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(two)) {

            inputedpin = pin.getText();
            inputedpin = inputedpin + "2";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(three)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "3";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(four)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "4";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(five)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "5";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(six)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "6";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(seven)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "7";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(eight)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "8";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(nine)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "9";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(zero)) {
            inputedpin = pin.getText();
            inputedpin = inputedpin + "0";
            pin.setText(inputedpin);
        }

        if (ae.getSource().equals(submit)) {

            enteredPin = pin.getText();
            System.err.println(flag);
            System.out.println(enteredPin);
//
            if (flag == transactionInterface.beq) {
                if (verifyAccount.pinDB.equals(enteredPin)) {
                    BalanceEnquiry bq = new BalanceEnquiry();
                    this.dispose(); // Close the PinVerify frame
                }
            }


            if (flag == transactionInterface.cwd) {
                if (verifyAccount.pinDB.equals(enteredPin)) {
                    CashWithdrawal cwd = new CashWithdrawal();
                    this.dispose(); // Close the PinVerify frame
                }


                if (flag == transactionInterface.cdt) {
                    if (verifyAccount.pinDB.equals(enteredPin)) {
                        CashDeposit cdt = new CashDeposit();
                        this.dispose(); // Close the PinVerify frame
                    }


                }


//             Assuming verifyAccount is an instance of a class with a method to verify PIN and get balance
//            if (verifyAccount.pinDB.equals(enteredPin)) {
//                // If PIN is verified, set the pinVerified flag and open the BalanceEnquiry frame
//                pinVerified = true;
//                BalanceEnquiry bq = new BalanceEnquiry();
//                //       bq.setBalance(verifyAccount.getBalance()); // Set the balance in BalanceEnquiry frame
//                PinVerify.pinVerified = false;
//                this.dispose(); // Close the PinVerify frame
//            } else {
//                pinVerified = false;
//                // Handle incorrect PIN (e.g., show an error message)
//                JOptionPane.showMessageDialog(this, "Invalid PIN. Please try again.");
//            }


//            enteredPin = pin.getText();
//            if (PinVerify.enteredPin==verifyAccount.pinDB){
//                PinVerify.pinVerified=true;
//            }else {
//                pinVerified=false;
//            }
//            if (PinVerify.pinVerified==true){
//                BalanceEnquiry bq = new BalanceEnquiry();
//                PinVerify.pinVerified = false;
//            }else if (PinVerify.enteredPin==verifyAccount.pinDB){
//                BalanceEnquiry bq = new BalanceEnquiry();
//
//            }

//            this.dispose();


            }
            if (ae.getSource().equals(reset)) {
                pin.setText("");
            }
        }

    }

    public static void main(String[] args) {
//        PinVerify va = new PinVerify();
    }
}