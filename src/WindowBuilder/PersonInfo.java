package WindowBuilder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
<<<<<<< HEAD
import javax.swing.JButton;
=======

import ClassLibrary.logClass;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
>>>>>>> test2

public class PersonInfo extends JPanel {
	private JTextField textField;

<<<<<<< HEAD
=======
	
>>>>>>> test2
	/**
	 * Create the panel.
	 */
	public PersonInfo() {
<<<<<<< HEAD
=======
		
>>>>>>> test2
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 524);
		add(panel);
		
<<<<<<< HEAD
		JLabel label = new JLabel("±à¼­¸öÈËÐÅÏ¢");
		label.setFont(new Font("Dialog", Font.PLAIN, 18));
=======
		JLabel label = new JLabel("ç¼–è¾‘ä¸ªäººä¿¡æ¯");
		label.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
>>>>>>> test2
		label.setBounds(42, 46, 286, 23);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(42, 79, 633, 46);
		panel.add(separator);
		
<<<<<<< HEAD
		JLabel label_1 = new JLabel("ÐÕÃû£º");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(42, 149, 75, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("»ÆËÌÑï");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(155, 150, 75, 21);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Ñ§ºÅ£º");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 18));
=======
		JLabel label_1 = new JLabel("å§“åï¼š");
		label_1.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
		label_1.setBounds(42, 149, 75, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("é»„é¢‚æ‰¬");
		label_2.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
		label_2.setBounds(155, 150, 75, 21);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("å­¦å·ï¼š");
		label_3.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
>>>>>>> test2
		label_3.setBounds(42, 212, 75, 23);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("2016052387");
<<<<<<< HEAD
		label_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_4.setBounds(155, 212, 169, 23);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Ñ§Ôº£º");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_5.setBounds(42, 277, 75, 23);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("ÖÇÄÜ¿ÆÑ§Óë¹¤³ÌÑ§Ôº");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_6.setBounds(155, 277, 173, 23);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("×¨Òµ£º");
		label_7.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_7.setBounds(42, 342, 75, 23);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Èí¼þ¹¤³Ì");
		label_8.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_8.setBounds(155, 342, 173, 23);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("ËÞÉáºÅ£º");
		label_9.setFont(new Font("Dialog", Font.PLAIN, 18));
=======
		label_4.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
		label_4.setBounds(155, 212, 169, 23);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("å­¦é™¢ï¼š");
		label_5.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
		label_5.setBounds(42, 277, 75, 23);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("æ™ºèƒ½ç§‘å­¦ä¸Žå·¥ç¨‹å­¦é™¢");
		label_6.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
		label_6.setBounds(155, 277, 173, 23);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("ä¸“ä¸šï¼š");
		label_7.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
		label_7.setBounds(42, 342, 75, 23);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("è½¯ä»¶å·¥ç¨‹");
		label_8.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
		label_8.setBounds(155, 342, 173, 23);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("å®¿èˆå·ï¼š");
		label_9.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
>>>>>>> test2
		label_9.setBounds(42, 406, 75, 23);
		panel.add(label_9);
		
		textField = new JTextField();
		textField.setText("3315");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
<<<<<<< HEAD
		textField.setFont(new Font("Dialog", Font.PLAIN, 18));
=======
		textField.setFont(new Font("å®‹ä½“", Font.PLAIN, 18));
>>>>>>> test2
		textField.setColumns(10);
		textField.setBounds(155, 404, 106, 27);
		panel.add(textField);
		
<<<<<<< HEAD
		JButton button = new JButton("±£´æ");
=======
		JButton button = new JButton("ä¿å­˜");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainInterface.logClass.printlog("ç‚¹å‡»äº†ä¿å­˜");
			}
		});
		button.setFont(new Font("å®‹ä½“", Font.PLAIN, 15));
>>>>>>> test2
		button.setBounds(437, 461, 97, 32);
		panel.add(button);

	}

}
