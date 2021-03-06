import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowCaseGUI  {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowCaseGUI window = new ShowCaseGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public ShowCaseGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		JPanel PicPanel = new JPanel();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String[][] countries = {{"Iran", "res/Iran.png"}, 
				{"Mexico", "res/Mexico.png"}, 
				{"India", "res/India.png"}, 
				{"America", "res/America.png"}, 
				{"China", "res/China.png"}, 
				{"Korea", "res/Korea.png"}, 
				{"Japan", "res/Japan.png"}, 
				{"Saudi Arabia", "res/Saudi Arabia.png"}, 
				{"Kuwait", "res/Kuwait.png"}, 
				{"Philippines", "res/Philippines.png"}, 
				{"Armenia", "res/Armenia.png"}, 
				{"Russia", "res/Russia.png"}, 
				{"Brazil", "res/Brazil.png"}, 
				{"Argentina", "res/Argentina.png"}, 
				{"El Salvador", "res/El Salvador.png"}, 
				{"Guatemala", "res/Guatemala.png"}};
		
		JButton btnNewButton = new JButton("Easy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * on button click, it:
				 * Creates object 'r' using "RemoveStuffs" class 
				 * calls "removeAllStuff" as a method of object 'r'
				 * arguments are components which are grabbed using the frame object methods
				 * runs "removeAllStuff"
				 */
				RemoveStuffs r = new RemoveStuffs();
				r.removeAllStuff(frame.getContentPane().getComponent(2), frame.getContentPane().getComponent(1), 
						frame.getContentPane().getComponent(0), frame.getContentPane().getComponent(3));
				/*
				 * The easy method will also be call the easy class and its easy method invoking the the game with easy difficulty
				 * remove this line once method is inserted
				 */
				Difficulty.Easy(PicPanel, frame, countries, null);
				
			}
		});
		btnNewButton.setToolTipText("You get unlimited tries and the most recognizable flags appear");
		btnNewButton.setBounds(10, 155, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Medium");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * on button click, it:
				 * Creates object 'r' using "RemoveStuffs" class 
				 * calls "removeAllStuff" as a method of object 'r'
				 * arguments are components which are grabbed using the frame object methods
				 * runs "removeAllStuff"
				 */
				RemoveStuffs r = new RemoveStuffs();
				r.removeAllStuff(frame.getContentPane().getComponent(2), frame.getContentPane().getComponent(1), 
						frame.getContentPane().getComponent(0), frame.getContentPane().getComponent(3));
				/*
				 * The medium method will also be call the medium class and its easy method invoking the the game with medium difficulty
				 * remove this line once method is inserted
				 */
				Difficulty.Medium(PicPanel, frame, countries, null);
				
			}
		});
		btnNewButton_1.setToolTipText("You get 10 tries and have a few more flags to choose from");
		btnNewButton_1.setBounds(162, 155, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Hard");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * on button click, it:
				 * Creates object 'r' using "RemoveStuffs" class 
				 * calls "removeAllStuff" as a method of object 'r'
				 * arguments are components which are grabbed using the frame object methods
				 * runs "removeAllStuff"
				 */

				RemoveStuffs r = new RemoveStuffs();
				r.removeAllStuff(frame.getContentPane().getComponent(2), frame.getContentPane().getComponent(1), 
						frame.getContentPane().getComponent(0), frame.getContentPane().getComponent(3));
				/*
				 * Hard is accessed in a static way instead of instantiating an object
				 * This slightly increases speed and prevents a java warning 
				 */
				Difficulty.Hard(PicPanel, frame, countries, null);
				
			
			}
		});
		
		btnNewButton_2.setToolTipText("You get 5 tries and all flags appear");
		btnNewButton_2.setBounds(315, 155, 109, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Please select a difficulty");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(140, 11, 205, 51);
		frame.getContentPane().add(lblNewLabel);
		
		
		
	}
	
	
}
