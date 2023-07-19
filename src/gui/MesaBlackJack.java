package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MesaBlackJack extends JFrame {

	private JPanel contentPane;
	private JLabel lblTuCarta2;
	private JLabel lblTuCarta2_2;
	private JLabel lblTuCarta2_3;
	private JLabel lblTuCarta2_4;
	private JLabel lblTuCarta2_5;
	private JLabel lblTuCarta2_6;
	private JLabel lblTuCarta2_7;
	private JLabel lblTuCarta2_8;
	private JLabel lblTuCarta2_9;
	private JLabel lblTuCarta2_10;
	private JLabel lblTuCarta2_11;
	private JLabel lblTuCarta2_12;
	private JLabel lblTuCarta2_13;
	private JLabel lblTuCarta2_14;
	private JLabel lblTuCarta1;
	private JLabel lblTuCarta2_1;
	private JLabel lblTuCarta2_15;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MesaBlackJack frame = new MesaBlackJack();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MesaBlackJack() {
		setResizable(false);
		setIgnoreRepaint(true);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MesaBlackJack.class.getResource("/imagenes/Icono.png")));
		setTitle("BlackJack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 444);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setMinimumSize(new Dimension(0, 0));
		contentPane.setMaximumSize(new Dimension(0, 0));
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(0, 0, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[25.00][150][125px][][][][][][][][][][][][][][][][]", "[grow][210][39.00][210][grow]"));
		
		lblTuCarta2 = new JLabel("");
		lblTuCarta2.setIcon(null);
		lblTuCarta2.setSize(new Dimension(125, 182));
		lblTuCarta2.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2, "cell 2 1");
		
		lblTuCarta2_1 = new JLabel("");
		lblTuCarta2_1.setIcon(null);
		lblTuCarta2_1.setSize(new Dimension(125, 182));
		lblTuCarta2_1.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_1.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_1.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_1, "cell 4 1");
		
		lblTuCarta2_2 = new JLabel("");
		lblTuCarta2_2.setSize(new Dimension(125, 182));
		lblTuCarta2_2.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_2.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_2.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_2, "cell 6 1");
		
		lblTuCarta2_5 = new JLabel("");
		lblTuCarta2_5.setSize(new Dimension(125, 182));
		lblTuCarta2_5.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_5.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_5.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_5.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_5, "cell 8 1");
		
		lblTuCarta2_7 = new JLabel("");
		lblTuCarta2_7.setSize(new Dimension(125, 182));
		lblTuCarta2_7.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_7.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_7.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_7.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_7, "cell 10 1");
		
		lblTuCarta2_9 = new JLabel("");
		lblTuCarta2_9.setSize(new Dimension(125, 182));
		lblTuCarta2_9.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_9.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_9.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_9.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_9, "cell 12 1");
		
		lblTuCarta2_11 = new JLabel("");
		lblTuCarta2_11.setSize(new Dimension(125, 182));
		lblTuCarta2_11.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_11.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_11.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_11.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_11, "cell 14 1");
		
		lblTuCarta2_13 = new JLabel("");
		lblTuCarta2_13.setSize(new Dimension(125, 182));
		lblTuCarta2_13.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_13.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_13.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_13.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_13, "cell 17 1");
		
		lblTuCarta2_15 = new JLabel("");
		lblTuCarta2_15.setIcon(new ImageIcon(MesaBlackJack.class.getResource("/imagenes/reverso5.jpg")));
		lblTuCarta2_15.setSize(new Dimension(125, 182));
		lblTuCarta2_15.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_15.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_15.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_15.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_15, "cell 1 1 1 3");
		
		btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, "cell 6 2 3 1,alignx center");
		
		btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1, "cell 10 2 3 1,alignx center");
		
		lblTuCarta1 = new JLabel("");
		lblTuCarta1.setVerticalTextPosition(SwingConstants.TOP);
		lblTuCarta1.setSize(new Dimension(182, 125));
		lblTuCarta1.setPreferredSize(new Dimension(125, 182));
		lblTuCarta1.setOpaque(true);
		lblTuCarta1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuCarta1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		lblTuCarta1.setBackground(new Color(0, 128, 64));
		lblTuCarta1.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta1, "cell 2 3");
		
		lblTuCarta2_3 = new JLabel("");
		lblTuCarta2_3.setSize(new Dimension(125, 182));
		lblTuCarta2_3.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_3.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_3.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_3, "cell 4 3");
		
		lblTuCarta2_4 = new JLabel("");
		lblTuCarta2_4.setSize(new Dimension(125, 182));
		lblTuCarta2_4.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_4.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_4.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_4.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_4, "cell 6 3");
		
		lblTuCarta2_6 = new JLabel("");
		lblTuCarta2_6.setSize(new Dimension(125, 182));
		lblTuCarta2_6.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_6.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_6.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_6.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_6, "cell 8 3");
		
		lblTuCarta2_8 = new JLabel("");
		lblTuCarta2_8.setSize(new Dimension(125, 182));
		lblTuCarta2_8.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_8.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_8.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_8.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_8, "cell 10 3");
		
		lblTuCarta2_10 = new JLabel("");
		lblTuCarta2_10.setSize(new Dimension(125, 182));
		lblTuCarta2_10.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_10.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_10.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_10.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_10, "cell 12 3");
		
		lblTuCarta2_12 = new JLabel("");
		lblTuCarta2_12.setSize(new Dimension(125, 182));
		lblTuCarta2_12.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_12.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_12.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_12.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_12, "cell 14 3");
		
		lblTuCarta2_14 = new JLabel("");
		lblTuCarta2_14.setSize(new Dimension(125, 182));
		lblTuCarta2_14.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2_14.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2_14.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2_14.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2_14, "cell 17 3");
	}

}
