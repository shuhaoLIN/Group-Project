package WindowBuilder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class SeekTrainPlan extends JPanel {

	/**
	 * Create the panel.
	 */
	public SeekTrainPlan() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 992, 524);
		add(panel);
		
		JLabel label = new JLabel("\u57F9\u517B\u65B9\u6848");
		label.setHorizontalAlignment(SwingConstants.CENTER);
<<<<<<< HEAD
		label.setFont(new Font("����", Font.PLAIN, 20));
=======
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
>>>>>>> test2
		label.setBounds(400, 13, 188, 36);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
<<<<<<< HEAD
=======
		label_1.setFont(new Font("宋体", Font.PLAIN, 15));
>>>>>>> test2
		String path = this.getClass().getClassLoader().getResource(".").getPath();
		label_1.setIcon(new ImageIcon(path+"../images/trainplan.png"));
		label_1.setBounds(31, 54, 934, 429);
		panel.add(label_1);
		
		
	}

}
