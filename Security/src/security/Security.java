package security;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Security extends JPanel {
    
 JTextField inputText, keyA, keyB, resultField;
 JButton decryptButton, ClearButton, moreButton, exitButton;

    public Security() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
         
        inputText = new JTextField();
        inputText.setBounds(180, 60, 620, 120); 
        inputText.setFont(new Font("Times new roman", Font.BOLD, 40)); 
        inputText.setBackground(new Color(222, 230, 221));
        inputText.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 96, 38)), 
                " Enter Text ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(
                "Algerian", Font.ITALIC, 50), new java.awt.Color(67, 96, 38) ) );

        inputText.addKeyListener(new KeyListener() { 

            public void keyPressed(KeyEvent e){   
                
                if( (e.getKeyChar()=='1')||(e.getKeyChar()=='2')||(e.getKeyChar()=='3')||
                        (e.getKeyChar()=='4')||(e.getKeyChar()=='5')||(e.getKeyChar()=='6')||
                        (e.getKeyChar()=='7')||(e.getKeyChar()=='8')||(e.getKeyChar()=='9')||
                        (e.getKeyChar()=='0')||(e.getKeyChar()=='@')||(e.getKeyChar()=='!')||
                        (e.getKeyChar()=='#')||(e.getKeyChar()=='$')||(e.getKeyChar()=='%')||
                        (e.getKeyChar()=='^')||(e.getKeyChar()=='&')||(e.getKeyChar()=='*')||
                        (e.getKeyChar()==')')||(e.getKeyChar()=='(')||(e.getKeyChar()=='=')||
                        (e.getKeyChar()=='+')||(e.getKeyChar()=='-')||(e.getKeyChar()=='~')||
                        (e.getKeyChar()=='?')||(e.getKeyChar()=='}')||(e.getKeyChar()=='{')||
                        (e.getKeyChar()==':')||(e.getKeyChar()==';')||(e.getKeyChar()=='<')||
                        (e.getKeyChar()=='>')||(e.getKeyChar()=='[')||(e.getKeyChar()==']')||
                        (e.getKeyChar()==',')||(e.getKeyChar()=='.')||(e.getKeyChar()=='،')||
                        (e.getKeyChar()=='/')||(e.getKeyChar()=='؟') ) {
                    
                    inputText.setBackground(new Color(249,133,122)); 
                    }
                else {
                   inputText.setBackground(new Color(222,230,221));   
                }
            }
            
            public void keyReleased(KeyEvent e){}
             public void keyTyped(KeyEvent e) {}
             });

        keyA = new JTextField();
        keyA.setBounds(180, 190, 580, 95);
        keyA.setFont(new Font("Times new roman", Font.BOLD, 40));
        keyA.setBackground(new Color(222, 230, 221));
        keyA.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 96, 38)), 
                " Enter Value (a) ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(
                "Algerian", Font.ITALIC, 45), new java.awt.Color(67, 96, 38)));

        keyA.addKeyListener(new KeyListener(){  
            public void keyPressed(KeyEvent e){
                
                if( (e.getKeyChar()=='a')||(e.getKeyChar()=='b')||(e.getKeyChar()=='c')||(e.getKeyChar()=='d')||
                        (e.getKeyChar()=='e')||(e.getKeyChar()=='f')||(e.getKeyChar()=='g')||(e.getKeyChar()=='h')||
                        (e.getKeyChar()=='i')||(e.getKeyChar()=='j')||(e.getKeyChar()=='k')||(e.getKeyChar()=='l')||
                        (e.getKeyChar()=='m')||(e.getKeyChar()=='n')||(e.getKeyChar()=='o')||(e.getKeyChar()=='p')||
                        (e.getKeyChar()=='q')||(e.getKeyChar()=='r')||(e.getKeyChar()=='s')||(e.getKeyChar()=='t')||
                        (e.getKeyChar()=='u')||(e.getKeyChar()=='v')||(e.getKeyChar()=='w')||(e.getKeyChar()=='x')||
                        (e.getKeyChar()=='y')||(e.getKeyChar()=='z')||(e.getKeyChar()=='A')||(e.getKeyChar()=='B')||
                        (e.getKeyChar()=='C')||(e.getKeyChar()=='D')||(e.getKeyChar()=='E')||(e.getKeyChar()=='F')||
                        (e.getKeyChar()=='G')||(e.getKeyChar()=='H')||(e.getKeyChar()=='I')||(e.getKeyChar()=='J')||
                        (e.getKeyChar()=='K')||(e.getKeyChar()=='L')||(e.getKeyChar()=='M')||(e.getKeyChar()=='N')||
                        (e.getKeyChar()=='O')||(e.getKeyChar()=='P')||(e.getKeyChar()=='Q')||(e.getKeyChar()=='R')||
                        (e.getKeyChar()=='S')||(e.getKeyChar()=='T')||(e.getKeyChar()=='U')||(e.getKeyChar()=='V')||
                        (e.getKeyChar()=='W')||(e.getKeyChar()=='X')||(e.getKeyChar()=='Y')||(e.getKeyChar()=='Z')||
                        (e.getKeyChar()=='@')||(e.getKeyChar()=='!')||(e.getKeyChar()=='#')||(e.getKeyChar()=='$')||
                        (e.getKeyChar()=='%')||(e.getKeyChar()=='^')||(e.getKeyChar()=='&')||(e.getKeyChar()=='*')||
                        (e.getKeyChar()==')')||(e.getKeyChar()=='(')||(e.getKeyChar()=='=')||(e.getKeyChar()=='+')||
                        (e.getKeyChar()=='~')||(e.getKeyChar()=='?')||(e.getKeyChar()=='}')||(e.getKeyChar()=='{')||
                        (e.getKeyChar()==':')||(e.getKeyChar()==';')||(e.getKeyChar()=='<')||(e.getKeyChar()=='>')||
                        (e.getKeyChar()=='[')||(e.getKeyChar()==']')||(e.getKeyChar()==',')||(e.getKeyChar()=='.')||
                        (e.getKeyChar()=='ذ')||(e.getKeyChar()=='ض')||(e.getKeyChar()=='ص')||(e.getKeyChar()=='ث')||
                        (e.getKeyChar()=='ق')||(e.getKeyChar()=='ف')||(e.getKeyChar()=='غ')||(e.getKeyChar()=='ع')||
                        (e.getKeyChar()=='ه')||(e.getKeyChar()=='خ')||(e.getKeyChar()=='ح')||(e.getKeyChar()=='ج')||
                        (e.getKeyChar()=='د')||(e.getKeyChar()=='ش')||(e.getKeyChar()=='س')||(e.getKeyChar()=='ي')||
                        (e.getKeyChar()=='ب')||(e.getKeyChar()=='ل')||(e.getKeyChar()=='ا')||(e.getKeyChar()=='ت')||
                        (e.getKeyChar()=='ن')||(e.getKeyChar()=='م')||(e.getKeyChar()=='ك')||(e.getKeyChar()=='ط')||
                        (e.getKeyChar()=='ئ')||(e.getKeyChar()=='ء')||(e.getKeyChar()=='ؤ')||(e.getKeyChar()=='ر')||
                        (e.getKeyChar()=='ى')||(e.getKeyChar()=='ة')||(e.getKeyChar()=='و')||(e.getKeyChar()=='ز')||
                        (e.getKeyChar()=='ظ')||(e.getKeyChar()=='`')||(e.getKeyChar()=='ق')||(e.getKeyChar()=='و')||
                        (e.getKeyChar()=='ە')||(e.getKeyChar()=='ر')||(e.getKeyChar()=='ت')||(e.getKeyChar()=='ی')||
                        (e.getKeyChar()=='ئ')||(e.getKeyChar()=='ح')||(e.getKeyChar()=='ۆ')||(e.getKeyChar()=='پ')||
                        (e.getKeyChar()=='ا')||(e.getKeyChar()=='س')||(e.getKeyChar()=='د')||(e.getKeyChar()=='ف')||
                        (e.getKeyChar()=='گ')||(e.getKeyChar()=='ه')||(e.getKeyChar()=='ژ')||(e.getKeyChar()=='ک')||
                        (e.getKeyChar()=='ل')||(e.getKeyChar()=='؛')||(e.getKeyChar()=='ز')||(e.getKeyChar()=='خ')||
                        (e.getKeyChar()=='ج')||(e.getKeyChar()=='ڤ')||(e.getKeyChar()=='ب')||(e.getKeyChar()=='ن')||
                        (e.getKeyChar()=='م')||(e.getKeyChar()=='،')||(e.getKeyChar()=='.')||(e.getKeyChar()=='چ') ) {
                    
                    keyA.setBackground(new Color(249,133,122));
                    }
                else {
                   keyA.setBackground(new Color(222,230,221));}
                }
            
            public void keyReleased(KeyEvent e){} 
             public void keyType(KeyEvent e) {}
             
              @Override
              
                public void keyTyped(KeyEvent e) { }
                });
       
        
        keyB = new JTextField();
        keyB.setBounds(180, 300, 540, 95);
        keyB.setFont(new Font("Times new roman",Font.BOLD,40));
        keyB.setBackground(new Color(222,230,221));
        keyB.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67,96,38)), 
                " Enter Value (b) ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(
                        "Algerian",Font.ITALIC, 45), new java.awt.Color(67,96,38))); 

        
        keyB.addKeyListener(new KeyListener(){  
         public void keyPressed(KeyEvent e){
             
           if( (e.getKeyChar()=='a')||(e.getKeyChar()=='b')||(e.getKeyChar()=='c')||(e.getKeyChar()=='d')||
                   (e.getKeyChar()=='e')||(e.getKeyChar()=='f')||(e.getKeyChar()=='g')||(e.getKeyChar()=='h')||
                   (e.getKeyChar()=='i')||(e.getKeyChar()=='j')||(e.getKeyChar()=='k')||(e.getKeyChar()=='l')||
                   (e.getKeyChar()=='m')||(e.getKeyChar()=='n')||(e.getKeyChar()=='o')||(e.getKeyChar()=='p')||
                   (e.getKeyChar()=='q')||(e.getKeyChar()=='r')||(e.getKeyChar()=='s')||(e.getKeyChar()=='t')||
                   (e.getKeyChar()=='u')||(e.getKeyChar()=='v')||(e.getKeyChar()=='w')||(e.getKeyChar()=='x')||
                   (e.getKeyChar()=='y')||(e.getKeyChar()=='z')||(e.getKeyChar()=='A')||(e.getKeyChar()=='B')||
                   (e.getKeyChar()=='C')||(e.getKeyChar()=='D')||(e.getKeyChar()=='E')||(e.getKeyChar()=='F')||
                   (e.getKeyChar()=='G')||(e.getKeyChar()=='H')||(e.getKeyChar()=='I')||(e.getKeyChar()=='J')||
                   (e.getKeyChar()=='K')||(e.getKeyChar()=='L')||(e.getKeyChar()=='M')||(e.getKeyChar()=='N')||
                   (e.getKeyChar()=='O')||(e.getKeyChar()=='P')||(e.getKeyChar()=='Q')||(e.getKeyChar()=='R')||
                   (e.getKeyChar()=='S')||(e.getKeyChar()=='T')||(e.getKeyChar()=='U')||(e.getKeyChar()=='V')||
                   (e.getKeyChar()=='W')||(e.getKeyChar()=='X')||(e.getKeyChar()=='Y')||(e.getKeyChar()=='Z')||
                   (e.getKeyChar()=='@')||(e.getKeyChar()=='!')||(e.getKeyChar()=='#')||(e.getKeyChar()=='$')||
                   (e.getKeyChar()=='%')||(e.getKeyChar()=='^')||(e.getKeyChar()=='&')||(e.getKeyChar()=='*')||
                   (e.getKeyChar()==')')||(e.getKeyChar()=='(')||(e.getKeyChar()=='=')||(e.getKeyChar()=='+')||
                   (e.getKeyChar()=='~')||(e.getKeyChar()=='?')||(e.getKeyChar()=='}')||(e.getKeyChar()=='{')||
                   (e.getKeyChar()==':')||(e.getKeyChar()==';')||(e.getKeyChar()=='<')||(e.getKeyChar()=='>')||
                   (e.getKeyChar()=='[')||(e.getKeyChar()==']')||(e.getKeyChar()==',')||(e.getKeyChar()=='.')||
                   (e.getKeyChar()=='ذ')||(e.getKeyChar()=='ض')||(e.getKeyChar()=='ص')||(e.getKeyChar()=='ث')||
                   (e.getKeyChar()=='ق')||(e.getKeyChar()=='ف')||(e.getKeyChar()=='غ')||(e.getKeyChar()=='ع')||
                   (e.getKeyChar()=='ه')||(e.getKeyChar()=='خ')||(e.getKeyChar()=='ح')||(e.getKeyChar()=='ج')||
                   (e.getKeyChar()=='د')||(e.getKeyChar()=='ش')||(e.getKeyChar()=='س')||(e.getKeyChar()=='ي')||
                   (e.getKeyChar()=='ب')||(e.getKeyChar()=='ل')||(e.getKeyChar()=='ا')||(e.getKeyChar()=='ت')||
                   (e.getKeyChar()=='ن')||(e.getKeyChar()=='م')||(e.getKeyChar()=='ك')||(e.getKeyChar()=='ط')||
                   (e.getKeyChar()=='ئ')||(e.getKeyChar()=='ء')||(e.getKeyChar()=='ؤ')||(e.getKeyChar()=='ر')||
                   (e.getKeyChar()=='ى')||(e.getKeyChar()=='ة')||(e.getKeyChar()=='و')||(e.getKeyChar()=='ز')||
                   (e.getKeyChar()=='ظ')||(e.getKeyChar()=='`')||(e.getKeyChar()=='ق')||(e.getKeyChar()=='و')||
                   (e.getKeyChar()=='ە')||(e.getKeyChar()=='ر')||(e.getKeyChar()=='ت')||(e.getKeyChar()=='ی')||
                   (e.getKeyChar()=='ئ')||(e.getKeyChar()=='ح')||(e.getKeyChar()=='ۆ')||(e.getKeyChar()=='پ')||
                   (e.getKeyChar()=='ا')||(e.getKeyChar()=='س')||(e.getKeyChar()=='د')||(e.getKeyChar()=='ف')||
                   (e.getKeyChar()=='گ')||(e.getKeyChar()=='ه')||(e.getKeyChar()=='ژ')||(e.getKeyChar()=='ک')||
                   (e.getKeyChar()=='ل')||(e.getKeyChar()=='؛')||(e.getKeyChar()=='ز')||(e.getKeyChar()=='خ')||
                   (e.getKeyChar()=='ج')||(e.getKeyChar()=='ڤ')||(e.getKeyChar()=='ب')||(e.getKeyChar()=='ن')||
                   (e.getKeyChar()=='م')||(e.getKeyChar()=='،')||(e.getKeyChar()=='.')||(e.getKeyChar()=='چ') ) {
               
             keyB.setBackground(new Color(249,133,122));
                }
                     else{
                      keyB.setBackground(new Color(222,230,221));}
                }
         
            public void keyReleased(KeyEvent e){} 
             public void keyType(KeyEvent e) {}
             
              @Override
              
                public void keyTyped(KeyEvent e) { }
                });

        resultField = new JTextField();
        resultField.setBounds(180, 570, 620, 120);
        resultField.setFont(new Font("Times new roman", Font.BOLD, 30));
        resultField.setEditable(false);
        resultField.setBackground(new Color(222, 230, 221));
        resultField.setBorder(javax.swing.BorderFactory.createTitledBorder( 
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 96, 38)), 
                "Decrypted Text",javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,new java.awt.Font(
                        "Algerian", Font.ITALIC, 45),new java.awt.Color(67, 96, 38)));
        
        
        decryptButton = new JButton("Decrypt Text");
        decryptButton.setBounds(180, 420, 350, 75);
        decryptButton.setFont(new Font("Algerian", Font.ITALIC, 40));
        decryptButton.setBackground(new Color(222, 230, 221));
        decryptButton.setForeground(new Color(67, 96, 38));
        
        decryptButton.addActionListener(new ActionListener() {
            
            @Override
            
            public void actionPerformed(ActionEvent e) {
                
                if (inputText.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter text to decrypt.");
                } else if (keyA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter Key A.");
                } else if (keyB.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter Key B.");
                } else {
                    try {
                        int a = Integer.parseInt(keyA.getText());
                        int b = Integer.parseInt(keyB.getText());
                        String text = inputText.getText();
                        String decryptedText = decryptMessage(text.toCharArray(), a, b);
                        resultField.setText(decryptedText);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input for Key A or Key B. Please enter integers.");
                    }
                }
            }
        });
        
        Icon imgIcon = new ImageIcon("giphy (1).gif");
            JLabel label = new JLabel(imgIcon);
                label.setBounds(668, 43, 360, 304); 
                    add(label);

                File file = new File("archivo.wav");
		      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		          final Clip clip = AudioSystem.getClip();
		                clip.open(audioStream); 

                                
        ClearButton=new JButton("Clear");
        ClearButton.setBounds(400,750, 200, 75);
        ClearButton.setBackground(new Color(222,230,221));
        ClearButton.setForeground(new Color(67,96,38));
        ClearButton.setFont(new Font("Algerian",Font.ITALIC,40));
        
        ClearButton.addActionListener(new ActionListener() {
            
            @Override
            
            public void actionPerformed(ActionEvent e) {
                
                clip.start();
                inputText.setText("");
                keyA.setText("");
                keyB.setText("");
                resultField.setText("");
                resultField.setVisible(true);

            }
        });

    moreButton = new JButton("More");
    moreButton.setBounds(180, 750, 200, 75); 
    moreButton.setFont(new Font("Algerian", Font.ITALIC, 40)); 
    moreButton.setBackground(new Color(222, 230, 221));
    moreButton.setForeground(new Color(67, 96, 38));

    moreButton.addActionListener(new ActionListener() {
        
    @Override
    
    public void actionPerformed(ActionEvent e) {
        
        JFrame moreFrame = new JFrame("Affine Cipher Article");
        
        JTextArea articleArea = new JTextArea();
        
        articleArea.setText("The Affine Cipher is a type of substitution cipher where each letter in the plaintext is transformed into its ciphertext counterpart using a mathematical function. The decryption process reverses this transformation to retrieve the original plaintext. It operates on modular arithmetic and involves two keys, ( a ) and ( b ) ), making it a more secure version of a Caesar cipher.");
        
        articleArea.setFont(new Font("Times new roman", Font.BOLD, 16));
        
        articleArea.setLineWrap(true);
        articleArea.setWrapStyleWord(true);
        articleArea.setEditable(false);
        moreFrame.add(new JScrollPane(articleArea));
        moreFrame.setSize(500, 400);
        moreFrame.setVisible(true);
    }
});

        exitButton=new JButton("Exit");
        exitButton.setBounds(1650,90, 200, 75);
        exitButton.setBackground(new Color(222,230,221));
        exitButton.setForeground(new Color(67,96,38));
        exitButton.setFont(new Font("Algerian",Font.ITALIC,40));
        
        exitButton.addActionListener(new ActionListener() {
            
            @Override
            
            public void actionPerformed(ActionEvent e) {
                
                int option = JOptionPane.showConfirmDialog(
                        null, "Do You Want To Exit Program", "Exit", JOptionPane.YES_NO_OPTION);
                
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });


ImageIcon i=new ImageIcon("nama1.png");
JLabel l=new JLabel(i);
l.setBounds(860,26, 290, 200);
add(l);
         
         
ImageIcon i2=new ImageIcon("klil1.png");
JLabel l2=new JLabel(i2);
l2.setBounds(780,420, 300, 400);
add(l2);   

ImageIcon i3=new ImageIcon("ABC.png");
JLabel l3=new JLabel(i3);
l3.setBounds(1600,700, 300, 400);
add(l3);


 ImageIcon i4=new ImageIcon("qfl.png");
JLabel l4=new JLabel(i4);
l4.setBounds(1420,15, 290, 200);
add(l4);


ImageIcon i5=new ImageIcon("apng.png");
JLabel l5=new JLabel(i5);
l5.setBounds(700,130, 290, 200);
add(l5);


ImageIcon i6=new ImageIcon("b.png");
JLabel l6=new JLabel(i6);
l6.setBounds(650,260, 290, 200);
add(l6);


ImageIcon i7=new ImageIcon("d.png");
JLabel l7=new JLabel(i7);
l7.setBounds(450,350, 290, 200);
add(l7);

        
        setLayout(null);
        
        setBackground(new Color(222,230,221));
        
        add(inputText);
        add(keyA);
        add(keyB);
        add(decryptButton);
        add(resultField);
        add(moreButton);
        add(ClearButton);
        add(exitButton);
    }

    private String decryptMessage(char[] toCharArray, int a, int b) {
    StringBuilder decryptedText = new StringBuilder();
    
    if (gcd(a, 26) != 1) {
        JOptionPane.showMessageDialog(null, "Key A must be coprime with 26.");
        return "";
    }
    
    int a_inv = modInverse(a, 26); 
    
    for (char ch : toCharArray) {
        if (Character.isLetter(ch)) {
            
            int shift = Character.isLowerCase(ch) ? 'a' : 'A';
            
            int decryptedChar = (a_inv * (ch - shift - b + 26) % 26) + shift;
            
            decryptedText.append((char) decryptedChar);
        } 
        else {
            decryptedText.append(ch);  
        }
    }
    
    return decryptedText.toString();
}

private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

private int modInverse(int a, int m) {
    a = a % m;
    for (int x = 1; x < m; x++) {
        if ((a * x) % m == 1) {
            return x;
        }
    }
    return -1; 
}

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
      
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    frame.getContentPane().add(new Security());
    frame.setSize(2000,2000);
    frame.setVisible(true);
    }
    
}
