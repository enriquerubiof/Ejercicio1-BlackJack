package gui;

import java.awt.EventQueue;
import java.applet.AudioClip;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.border.LineBorder;

import clases.Mano;
import clases.Mazo;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MesaBlackJack extends JFrame {

	private JPanel contentPane;
	private JLabel lblTuCarta1;
	private JLabel lblTuCarta3;
	private JLabel lblRvCarta2;
	private JLabel lblRvCarta3;
	private JLabel lblTuCarta4;
	private JLabel lblRvCarta4;
	private JLabel lblTuCarta5;
	private JLabel lblRvCarta5;
	private JLabel lblTuCarta6;
	private JLabel lblRvCarta6;
	private JLabel lblTuCarta7;
	private JLabel lblRvCarta7;
	private JLabel lblTuCarta8;
	private JLabel lblRvCarta8;
	private JLabel lblRvCarta1;
	private JLabel lblTuCarta2;
	private JLabel lblBaraja;
	private JButton btnComenzar;
	private JButton btnPasar;
	Mazo baraja;
	Mano jugador1;
	Mano banca;
	ArrayList<Mano> jugadores;
	
	private int carta;
	private ArrayList<JLabel> cartasPuls;
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
	public MesaBlackJack()
	{
		carta = 0;
		cartasPuls = new ArrayList<JLabel>();
		jugadores = new ArrayList<Mano>();
		setType(Type.POPUP);
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
		contentPane.setLayout(new MigLayout("", "[25.00][150][125px][5][][5][][][][][][][][][][][][][]", "[grow][210][39.00][210][grow]"));
		
		lblTuCarta1 = new JLabel("");
		lblTuCarta1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuCarta1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				if (carta == 1)
					voltearCarta(e);
			}
		});
		lblTuCarta1.setIcon(null);
		lblTuCarta1.setSize(new Dimension(125, 182));
		lblTuCarta1.setPreferredSize(new Dimension(125, 182));
		lblTuCarta1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta1.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta1.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta1, "cell 2 1");
		
		lblTuCarta2 = new JLabel("");
		lblTuCarta2.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if (carta == 2)
				voltearCarta(e);
			}
		});
		lblTuCarta2.setIcon(null);
		lblTuCarta2.setSize(new Dimension(125, 182));
		lblTuCarta2.setPreferredSize(new Dimension(125, 182));
		lblTuCarta2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta2.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta2.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta2, "cell 4 1");
		
		lblTuCarta3 = new JLabel("");
		lblTuCarta3.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
					if (carta == 3)
					voltearCarta(e);
			}
		});
		lblTuCarta3.setSize(new Dimension(125, 182));
		lblTuCarta3.setPreferredSize(new Dimension(125, 182));
		lblTuCarta3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta3.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta3.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta3, "cell 6 1");
		
		lblTuCarta4 = new JLabel("");
		lblTuCarta4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if (carta == 4)
				voltearCarta(e);
			}
		});
		lblTuCarta4.setSize(new Dimension(125, 182));
		lblTuCarta4.setPreferredSize(new Dimension(125, 182));
		lblTuCarta4.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta4.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta4.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta4, "cell 8 1");
		
		lblTuCarta5 = new JLabel("");
		lblTuCarta5.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if (carta == 5)
				voltearCarta(e);
			}
		});
		lblTuCarta5.setSize(new Dimension(125, 182));
		lblTuCarta5.setPreferredSize(new Dimension(125, 182));
		lblTuCarta5.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta5.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta5.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta5, "cell 10 1");
		
		lblTuCarta6 = new JLabel("");
		lblTuCarta6.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if (carta == 6)
				voltearCarta(e);
			}
		});
		lblTuCarta6.setSize(new Dimension(125, 182));
		lblTuCarta6.setPreferredSize(new Dimension(125, 182));
		lblTuCarta6.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta6.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta6.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta6, "cell 12 1");
		
		lblTuCarta7 = new JLabel("");
		lblTuCarta7.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if (carta == 7)
				voltearCarta(e);
			}
		});
		lblTuCarta7.setSize(new Dimension(125, 182));
		lblTuCarta7.setPreferredSize(new Dimension(125, 182));
		lblTuCarta7.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta7.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta7.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta7, "cell 14 1");
		
		lblTuCarta8 = new JLabel("");
		lblTuCarta8.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				voltearCartaFinal(e);
			}
		});
		lblTuCarta8.setSize(new Dimension(125, 182));
		lblTuCarta8.setPreferredSize(new Dimension(125, 182));
		lblTuCarta8.setHorizontalTextPosition(SwingConstants.LEADING);
		lblTuCarta8.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblTuCarta8.setAlignmentY(0.0f);
		contentPane.add(lblTuCarta8, "cell 17 1");
		
		lblBaraja = new JLabel("");
		lblBaraja.setIcon(new ImageIcon(MesaBlackJack.class.getResource("/imagenes/reverso5.jpg")));
		lblBaraja.setSize(new Dimension(125, 182));
		lblBaraja.setPreferredSize(new Dimension(125, 182));
		lblBaraja.setHorizontalTextPosition(SwingConstants.LEADING);
		lblBaraja.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblBaraja.setAlignmentY(0.0f);
		contentPane.add(lblBaraja, "cell 1 1 1 3");
		
		btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				activarTablero();
			}
		});
		contentPane.add(btnComenzar, "cell 6 2 3 1,alignx center");
		
		btnPasar = new JButton("Pasar");
		btnPasar.setEnabled(false);
		btnPasar.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.add(btnPasar, "cell 10 2 3 1,alignx center");
		
		lblRvCarta1 = new JLabel("");
		lblRvCarta1.setVerticalTextPosition(SwingConstants.TOP);
		lblRvCarta1.setSize(new Dimension(182, 125));
		lblRvCarta1.setPreferredSize(new Dimension(125, 182));
		lblRvCarta1.setOpaque(true);
		lblRvCarta1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRvCarta1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRvCarta1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		lblRvCarta1.setBackground(new Color(0, 128, 64));
		lblRvCarta1.setAlignmentY(0.0f);
		contentPane.add(lblRvCarta1, "cell 2 3");
		
		lblRvCarta2 = new JLabel("");
		lblRvCarta2.setSize(new Dimension(125, 182));
		lblRvCarta2.setPreferredSize(new Dimension(125, 182));
		lblRvCarta2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRvCarta2.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblRvCarta2.setAlignmentY(0.0f);
		contentPane.add(lblRvCarta2, "cell 4 3");
		
		lblRvCarta3 = new JLabel("");
		lblRvCarta3.setSize(new Dimension(125, 182));
		lblRvCarta3.setPreferredSize(new Dimension(125, 182));
		lblRvCarta3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRvCarta3.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblRvCarta3.setAlignmentY(0.0f);
		contentPane.add(lblRvCarta3, "cell 6 3");
		
		lblRvCarta4 = new JLabel("");
		lblRvCarta4.setSize(new Dimension(125, 182));
		lblRvCarta4.setPreferredSize(new Dimension(125, 182));
		lblRvCarta4.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRvCarta4.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblRvCarta4.setAlignmentY(0.0f);
		contentPane.add(lblRvCarta4, "cell 8 3");
		
		lblRvCarta5 = new JLabel("");
		lblRvCarta5.setSize(new Dimension(125, 182));
		lblRvCarta5.setPreferredSize(new Dimension(125, 182));
		lblRvCarta5.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRvCarta5.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblRvCarta5.setAlignmentY(0.0f);
		contentPane.add(lblRvCarta5, "cell 10 3");
		
		lblRvCarta6 = new JLabel("");
		lblRvCarta6.setSize(new Dimension(125, 182));
		lblRvCarta6.setPreferredSize(new Dimension(125, 182));
		lblRvCarta6.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRvCarta6.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblRvCarta6.setAlignmentY(0.0f);
		contentPane.add(lblRvCarta6, "cell 12 3");
		
		lblRvCarta7 = new JLabel("");
		lblRvCarta7.setSize(new Dimension(125, 182));
		lblRvCarta7.setPreferredSize(new Dimension(125, 182));
		lblRvCarta7.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRvCarta7.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblRvCarta7.setAlignmentY(0.0f);
		contentPane.add(lblRvCarta7, "cell 14 3");
		
		lblRvCarta8 = new JLabel("");
		lblRvCarta8.setSize(new Dimension(125, 182));
		lblRvCarta8.setPreferredSize(new Dimension(125, 182));
		lblRvCarta8.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRvCarta8.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblRvCarta8.setAlignmentY(0.0f);
		contentPane.add(lblRvCarta8, "cell 17 3");
	}

	protected void open(AudioInputStream audioInputStream) {
		// TODO Auto-generated method stub
		
	}

	protected void voltearCarta(MouseEvent e)
	{
		if (carta == 1)
		{
			cartasPuls.add(this.lblTuCarta2);
			cartasPuls.add(this.lblTuCarta3);
			cartasPuls.add(this.lblTuCarta4);
			cartasPuls.add(this.lblTuCarta5);
			cartasPuls.add(this.lblTuCarta6);
			cartasPuls.add(this.lblTuCarta7);
			cartasPuls.add(this.lblTuCarta8);
		}
		this.jugadores.get(0).pedirCarta(this.baraja);

		((JLabel)e.getComponent()).setIcon(new ImageIcon(MesaBlackJack.class.getResource("/imagenes/cartasPoker/" + 
				this.jugadores.get(0).getBaraja().get(this.jugadores.get(0).getBaraja().size() - 1) + ".png")));
		
		cartasPuls.get(carta-1).setIcon(new ImageIcon(MesaBlackJack.class.getResource("/imagenes/reverso5.jpg")));
		carta++;
	}

	protected void voltearCartaFinal(MouseEvent e)
	{
		this.jugadores.get(0).pedirCarta(this.baraja);

		((JLabel)e.getComponent()).setIcon(new ImageIcon(MesaBlackJack.class.getResource("/imagenes/cartasPoker/" + 
				this.jugadores.get(0).getBaraja().get(this.jugadores.get(0).getBaraja().size() - 1) + ".png")));
		carta++;
	}

	protected void activarTablero()
	{
		/*AudioClip sonido;
		sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/sonido1.mp3"));
		 sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/sonido1.mp3"));
		sonido.play();*/
		Clip clip = null;
		try {
			clip=AudioSystem.getClip();
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			clip.open(AudioSystem.getAudioInputStream( getClass().getResourceAsStream("/musica/sonido1.wav")));
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedAudioFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clip.start();
		
		this.btnComenzar.setEnabled(false);
		this.btnPasar.setEnabled(true);
		this.lblTuCarta1.setIcon(new ImageIcon(MesaBlackJack.class.getResource("/imagenes/reverso5.jpg")));
		this.carta++;
		this.baraja = new Mazo();
		this.baraja.barajar();
		this.jugador1 = new Mano();
		this.banca = new Mano();
		this.jugadores.add(jugador1);
		this.jugadores.add(banca);
	}

}
