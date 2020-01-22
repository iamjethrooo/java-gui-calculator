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

        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        //frame.setResizable(false);
        frame.setVisible(true);
    }

    JPanel mainPanel, ioPanel, historyPanel, buttonsPanel;
    JTextField ioTextField, historyTextField;
    String displayedText = "";

    public void init() {
        mainPanel = new JPanel(new BorderLayout());

        historyPanel = new JPanel();
        historyPanel.setBackground(Color.RED);

        historyTextField = new JTextField();
        historyTextField.setBackground(Color.BLACK);
        historyTextField.setForeground(Color.WHITE);
        historyTextField.setFont(new Font("Courier New", Font.BOLD, 15));
        historyTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        historyTextField.setPreferredSize(new Dimension(350, 15));
        historyTextField.setBorder(null);
        historyTextField.setEditable(false);

        ioPanel = new JPanel();
        ioPanel.setPreferredSize(new Dimension(350, 80));
        ioPanel.setBackground(Color.BLACK);
        ioPanel.setForeground(Color.WHITE);

        ioTextField = new JTextField();
        ioTextField.setBackground(Color.BLACK);
        ioTextField.setForeground(Color.WHITE);
        ioTextField.setFont(new Font("Courier New", Font.BOLD, 30));
        ioTextField.setPreferredSize(new Dimension(350, 60));
        ioTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        ioTextField.setBorder(null);
        ioTextField.setEditable(false);

        ioPanel.add(historyTextField);
        ioPanel.add(ioTextField);

        mainPanel.add(historyPanel, BorderLayout.PAGE_START);
        mainPanel.add(ioPanel, BorderLayout.PAGE_START);

        initButtons();

        frame.add(mainPanel);
    }

    JButton oneButton, twoButton, threeButton, fourButton, fiveButton,
            sixButton, sevenButton, eightButton, nineButton, zeroButton,
            periodButton, plusButton, minusButton, divideButton,
            multiplyButton, clearButton, equalsButton, deleteButton;
    Font buttonsFont = new Font("Courier New", Font.BOLD, 20);

    public void initButtons() {
        buttonsPanel = new JPanel(new GridBagLayout());
        buttonsPanel.setBackground(Color.BLACK);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        // top, left, bottom, right
        //c.insets = new Insets(2, 2, 2, 2);
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
        c.gridwidth = 2;
        c.gridheight = 1;
        buttonsPanel.add(zeroButton, c);

        periodButton = new JButton(".");
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        buttonsPanel.add(periodButton, c);

        oneButton.setBackground(new Color(50, 50, 50));
        twoButton.setBackground(new Color(50, 50, 50));
        threeButton.setBackground(new Color(50, 50, 50));
        fourButton.setBackground(new Color(50, 50, 50));
        fiveButton.setBackground(new Color(50, 50, 50));
        sixButton.setBackground(new Color(50, 50, 50));
        sevenButton.setBackground(new Color(50, 50, 50));
        eightButton.setBackground(new Color(50, 50, 50));
        nineButton.setBackground(new Color(50, 50, 50));
        zeroButton.setBackground(new Color(50, 50, 50));
        periodButton.setBackground(new Color(50, 50, 50));
        
        oneButton.setForeground(Color.WHITE);
        twoButton.setForeground(Color.WHITE);
        threeButton.setForeground(Color.WHITE);
        fourButton.setForeground(Color.WHITE);
        fiveButton.setForeground(Color.WHITE);
        sixButton.setForeground(Color.WHITE);
        sevenButton.setForeground(Color.WHITE);
        eightButton.setForeground(Color.WHITE);
        nineButton.setForeground(Color.WHITE);
        zeroButton.setForeground(Color.WHITE);
        periodButton.setForeground(Color.WHITE);

        clearButton.setBackground(new Color(211, 212, 216));

        deleteButton.setBackground(new Color(211, 212, 216));

        equalsButton.setBackground(new Color(255, 133, 0));
        equalsButton.setForeground(Color.WHITE);

        divideButton.setBackground(new Color(211, 212, 216));
        multiplyButton.setBackground(new Color(211, 212, 216));
        plusButton.setBackground(new Color(211, 212, 216));
        minusButton.setBackground(new Color(211, 212, 216));

        oneButton.setFont(buttonsFont);
        twoButton.setFont(buttonsFont);
        threeButton.setFont(buttonsFont);
        fourButton.setFont(buttonsFont);
        fiveButton.setFont(buttonsFont);
        sixButton.setFont(buttonsFont);
        sevenButton.setFont(buttonsFont);
        eightButton.setFont(buttonsFont);
        nineButton.setFont(buttonsFont);
        zeroButton.setFont(buttonsFont);
        clearButton.setFont(buttonsFont);
        divideButton.setFont(buttonsFont);
        multiplyButton.setFont(buttonsFont);
        deleteButton.setFont(buttonsFont);
        plusButton.setFont(buttonsFont);
        minusButton.setFont(buttonsFont);
        equalsButton.setFont(buttonsFont);
        periodButton.setFont(buttonsFont);

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
        periodButton.addActionListener(this);

        mainPanel.add(buttonsPanel, BorderLayout.CENTER);
    }

    String firstNumber = "";
    String secondNumber = "";
    String operator = "";
    String result = "";
    String historyText = "";
    boolean clickedEquals = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        String symbol = e.getActionCommand();

        switch (symbol) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
            case ".":
                if (clickedEquals) {
                    displayedText = "";
                    clickedEquals = false;
                }
                displayedText += symbol;
                ioTextField.setText(displayedText);
                break;
            case "C": // Clear
                displayedText = "";
                firstNumber = "";
                secondNumber = "";
                operator = "";
                result = "";
                historyText = "";
                historyTextField.setText(historyText);
                ioTextField.setText(displayedText);
                break;
            case "D": // Delete
                if ((displayedText.length() - 1) >= 0) {
                    displayedText = displayedText.substring(0, displayedText.length() - 1);
                    ioTextField.setText(displayedText);
                }
                break;
            case "/": // Operators
            case "*":
            case "-":
            case "+":
                if (operator.isEmpty()) {
                    if (operator.isEmpty() && secondNumber.isEmpty()) {
                        operator = symbol;
                        firstNumber = displayedText;
                        historyText += firstNumber + operator;
                        displayedText = "";
                        ioTextField.setText(displayedText);
                        historyTextField.setText(historyText);
                    } else {
                        operator = symbol;
                        firstNumber = result;
                        historyText = firstNumber + operator;
                        secondNumber = "";
                        result = "";
                        displayedText = "";
                        ioTextField.setText(displayedText);
                        historyTextField.setText(historyText);
                    }
                } else {
                    operator = symbol;
                    historyText = historyText.substring(0, historyText.length() - 1);
                    historyText += operator;
                    historyTextField.setText(historyText);
                }
                break;
            case "=":
                if (!displayedText.isEmpty() && !operator.isEmpty()) {
                    secondNumber = displayedText;
                    switch (operator) {
                        case "+":
                            result = Double.toString(Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber));
                            displayedText = result;
                            ioTextField.setText(displayedText);
                            break;
                        case "-":
                            result = Double.toString(Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber));
                            displayedText = result;
                            ioTextField.setText(displayedText);
                            break;
                        case "*":
                            result = Double.toString(Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber));
                            displayedText = result;
                            ioTextField.setText(displayedText);
                            break;
                        case "/":
                            result = Double.toString(Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber));
                            displayedText = result;
                            ioTextField.setText(displayedText);
                            break;
                    }
                    clickedEquals = true;
                    //ioString = "";
                    operator = "";
                }

                break;
        }

    }
}
