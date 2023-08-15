import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jframe extends JFrame implements ActionListener
{

	
	boolean aw[] = {false , false, false};
	int computer = 0;
	Font vs = new Font("Comic Sans MS", Font.BOLD, 36);
	Font vss = new Font("Comic Sans MS", Font.BOLD, 36);
	Icon bato = new ImageIcon("Untitled.jpg");
	Icon scissor = new ImageIcon("scissor.jpg");
	Icon paper = new ImageIcon("paper.jpg");
	Icon combato = new ImageIcon("combato.jpg");
	Icon comscissor = new ImageIcon("comscissor.jpg");
	Icon compaper = new ImageIcon("compaper.jpg");
	Icon user = new ImageIcon("user.jpg");
	Icon comp = new ImageIcon("computer.jpg");
	JLabel choose = new JLabel("Choose: ", JLabel.CENTER);
	JLabel rock = new JLabel("Rock");
	JButton prock= new JButton("Rock");
	JButton ppaper = new JButton("Paper");
	JButton pscissor = new JButton("Scissor");
	JLabel papel = new JLabel(paper);
	JLabel gunting = new JLabel(scissor);
	JLabel combatoo = new JLabel(combato);
	JLabel compapel = new JLabel(compaper);
	JLabel comgunting = new JLabel(comscissor);
	JLabel ccomp = new JLabel(comp);
	JLabel uuser = new JLabel(user);
	JLabel batoo = new JLabel(bato);
	JLabel msg = new JLabel("VS", JLabel.CENTER);
	JLabel win = new JLabel("Win", JLabel.CENTER);
	JLabel lose = new JLabel("Lose", JLabel.CENTER);
	JLabel draw = new JLabel("Draw", JLabel.CENTER);

	FlowLayout l = new FlowLayout();
	GridLayout ll = new GridLayout(3,3,10,10);
	Container con = getContentPane();

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	public jframe()
	{

		super("MightyGame");
		setBounds(400,100,505,300);
		
		prock.setToolTipText("Choose ROCK?");
		ppaper.setToolTipText("Choose PAPER?");
		pscissor.setToolTipText("Choose SCISSOR?");
		setLayout(null);
		
		
		choose.setFont(new Font("Arial", Font.BOLD, 20));

		batoo.setBounds(10,10,150,150);
		papel.setBounds(170,10,150,150);
		gunting.setBounds(330,10,150,150);
		choose.setBounds(200,170,100,20);
		prock.setBounds(10,200,150,50);
		ppaper.setBounds(170,200,150,50);
		pscissor.setBounds(330,200,150,50);
		
		add(batoo);
		add(papel);
		add(gunting);
		add(choose);
		add(prock);
		add(ppaper);
		add(pscissor);
		
		setVisible(true);

		prock.addActionListener(this);
		ppaper.addActionListener(this);
		pscissor.addActionListener(this);

	}
		
		
		
	public void actionPerformed(ActionEvent event)
	{
			Object source = event.getSource();

			if(source == prock)
			{
				bato rock = new bato();
				rock.setVisible(true);
			}
			else if(source == ppaper)
			{
				papel paper = new papel();
				paper.setVisible(true);
			}
			else if(source == pscissor)
			{
				gunting scissor = new gunting();
				scissor.setVisible(true);
			}
		
	}
	public static void main(String[] args)
	{
		new jframe();
	}
}