import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM_Interface extends JFrame implements ActionListener {

    JLabel bankName1,bankName2,welcome;
    JButton enterCard;
    public ATM_Interface() throws HeadlessException {

        setBounds(450,50,750,750);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(0x9E3FFFCC, true));

        bankName1 = new JLabel("Tere Bhai");
        bankName1.setBounds(10,10,250,30);
        bankName1.setFont(new Font("null",Font.BOLD,35));
        bankName1.setForeground(new Color(0xFF0000));
        add(bankName1);

        bankName2 = new JLabel("Ka Bank");
        bankName2.setBounds(40,35,250,30);
        bankName2.setFont(new Font("null",Font.BOLD,35));
        bankName2.setForeground(new Color(0x0004FF));
        add(bankName2);

        welcome = new JLabel("Welcome to Tere Bhai Ka Bank ATM");
        welcome.setBounds(50,110,650,50);
        welcome.setFont(new Font("null",Font.BOLD,35));
        welcome.setForeground(new Color(0xD3FF00C3, true));
        add(welcome);

        enterCard = new JButton("Enter Your Card");
        enterCard.setBounds(200,650,300,50);
        enterCard.setFont(new Font("null",Font.ITALIC,25));
        add(enterCard);


        ImageIcon imageIcon = new ImageIcon("Assets/enterATM.jpg");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(50, 150, 650, 500);
        add(imageLabel);

        ImageIcon logo = new ImageIcon("Assets/logos.png");
        JLabel logos = new JLabel(logo);
        logos.setBounds(560, -30, 200, 200);
        add(logos);

        enterCard.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(enterCard)){
            this.dispose();
            verifyAccount va = new verifyAccount();
        }
    }

    public static void main(String[] args) {
        ATM_Interface atm = new ATM_Interface();
    }

}
