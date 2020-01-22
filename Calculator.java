package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
    JFrame frame;

    public Calculator() {
        frame = new JFrame("Basic Calculator");

        init();

        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    JPanel mainPanel, ioPanel, buttonsPanel;
    JTextField textField;
    String ioString = "";

    public void init() {
        mainPanel = new JPanel(new BorderLayout());

        ioPanel = new JPanel();
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(450, 50));
        textField.setEditable(false);

        ioPanel.add(textField);
        mainPanel.add(ioPanel, BorderLayout.PAGE_START);
        initButtons();

        frame.add(mainPanel);
    }

    JButton oneButton, twoButton, threeButton, fourButton, fiveButton,
            sixButton, sevenButton, eightButton, nineButton, zeroButton,
            plusButton, minusButton, divideButton, multiplyButton, clearButton,
            equalsButton, deleteButton;

    public void initButtons() {
        buttonsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        oneButton = new JButton("1");
        c.gridx = 0;
        c.gridy = 3;
        buttonsPanel.add(oneButton, c);

        twoButton = new JButton("2");
        c.gridx = 1;
        buttonsPanel.add(twoButton, c);

        threeButton = new JButton("3");
        c.gridx = 2;
        buttonsPanel.add(threeButton, c);

        fourButton = new JButton("4");
        c.gridx = 0;
        c.gridy = 2;
        buttonsPanel.add(fourButton, c);

        fiveButton = new JButton("5");
        c.gridx = 1;
        buttonsPanel.add(fiveButton, c);

        sixButton = new JButton("6");
        c.gridx = 2;
        buttonsPanel.add(sixButton, c);

        sevenButton = new JButton("7");
        c.gridx = 0;
        c.gridy = 1;
        buttonsPanel.add(sevenButton, c);

        eightButton = new JButton("8");
        c.gridx = 1;
        buttonsPanel.add(eightButton, c);

        nineButton = new JButton("9");
        c.gridx = 2;
        buttonsPanel.add(nineButton, c);

        clearButton = new JButton("C");
        c.gridx = 0;
        c.gridy = 0;
        buttonsPanel.add(clearButton, c);

        divideButton = new JButton("/");
        c.gridx = 1;
        buttonsPanel.add(divideButton, c);

        multiplyButton = new JButton("*");
        c.gridx = 2;
        buttonsPanel.add(multiplyButton, c);

        deleteButton = new JButton("D");
        c.gridx = 3;
        buttonsPanel.add(deleteButton, c);

        minusButton = new JButton("-");
        c.gridy = 1;
        buttonsPanel.add(minusButton, c);

        plusButton = new JButton("+");
        c.gridy = 2;
        buttonsPanel.add(plusButton, c);

        equalsButton = new JButton("=");
        c.gridy = 3;
        c.gridheight = 2;

        buttonsPanel.add(equalsButton, c);

        zeroButton = new JButton("0");
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 1;
        buttonsPanel.add(zeroButton, c);

        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        zeroButton.addActionListener(this);
        clearButton.addActionListener(this);
        divideButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        deleteButton.addActionListener(this);
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        equalsButton.addActionListener(this);

        mainPanel.add(buttonsPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String symbol = e.getActionCommand();
        double firstNumber, secondNumber;
        double result = 0;
        switch (symbol) {
            case "1":
                ioString += "1";
                textField.setText(ioString);
                break;
            case "2":
                ioString += "2";
                textField.setText(ioString);
                break;
            case "3":
                ioString += "3";
                textField.setText(ioString);
                break;
            case "4":
                ioString += "4";
                textField.setText(ioString);
                break;
            case "5":
                ioString += "5";
                textField.setText(ioString);
                break;
            case "6":
                ioString += "6";
                textField.setText(ioString);
                break;
            case "7":
                ioString += "7";
                textField.setText(ioString);
                break;
            case "8":
                ioString += "8";
                textField.setText(ioString);
                break;
            case "9":
                ioString += "9";
                textField.setText(ioString);
                break;
            case "0":
                ioString += "0";
                textField.setText(ioString);
                break;
            case "C":
                ioString = "";
                textField.setText(ioString);
                break;
            case "D":
                ioString = ioString.substring(0, ioString.length() - 1);
                textField.setText(ioString);
                break;
            case "/":

                break;
            case "*":

                break;
            case "-":

                break;
            case "+":

                break;
            case "=":

                break;

        }

    }
}
