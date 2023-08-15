import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gunting extends JFrame  implements ActionListener
{

	int computer = 0;
	Font vss = new Font("Comic Sans MS", Font.BOLD, 36);
	Icon bato = new ImageIcon("Untitled.jpg");
	Icon scissor = new ImageIcon("scissor.jpg");
	Icon paper = new ImageIcon("paper.jpg");
	Icon combato = new ImageIcon("combato.jpg");
	Icon comscissor = new ImageIcon("comscissor.jpg");
	Icon compaper = new ImageIcon("compaper.jpg");
	Icon user = new ImageIcon("user.jpg");
	Icon comp = new ImageIcon("computer.jpg");
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
	JButton b = new JButton("OK");
	
	public gunting()
	{


		super("Bato2pick");
		computer = 1 + (int)(Math.random() * 3);
		setBounds(390,100,525,300);
		setLayout(null);
		if(computer == 1)
		{
			uuser.setBounds(10,50,50,50);
			gunting.setBounds(70,10,150,150);
			msg.setBounds(230,50,50,50);
			combatoo.setBounds(290,10,150,150);
			ccomp.setBounds(450,50,50,50);
			lose.setBounds(200,135,100,100);
			b.setBounds(200,210,100,50);

			add(uuser);
			add(gunting);
			msg.setFont(vss);
			add(msg);
			add(combatoo);
			add(ccomp);
			add(new JLabel());
			add(new JLabel());
			lose.setFont(vss);
			add(lose);
			add(new JLabel());
			add(new JLabel());
			
			add(b);
		}
		else if(computer == 2)
		{
			uuser.setBounds(10,50,50,50);
			gunting.setBounds(70,10,150,150);
			msg.setBounds(230,50,50,50);
			compapel.setBounds(290,10,150,150);
			ccomp.setBounds(450,50,50,50);
			win.setBounds(200,135,100,100);
			b.setBounds(200,210,100,50);
			
			add(uuser);
			add(gunting);
			msg.setFont(vss);
			add(msg);
			add(compapel);
			add(ccomp);
			add(new JLabel());
			add(new JLabel());
			win.setFont(vss);
			add(win);
			add(new JLabel());
			add(new JLabel());
			add(b);
		}
		else if(computer == 3)
		{

			uuser.setBounds(10,50,50,50);
			gunting.setBounds(70,10,150,150);
			msg.setBounds(230,50,50,50);
			comgunting.setBounds(290,10,150,150);
			ccomp.setBounds(450,50,50,50);
			draw.setBounds(200,135,100,100);
			b.setBounds(200,210,100,50);
			
			add(uuser);
			add(gunting);
			msg.setFont(vss);
			add(msg);
			add(comgunting);
			add(ccomp);
			add(new JLabel());
			add(new JLabel());
			draw.setFont(vss);
			add(draw);
			add(new JLabel());
			add(new JLabel());
			add(b);
		}
		b.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	
		if(e.getSource() == b)
		{
			setVisible(false);
		}
	
	}
	public static void main(String[] args)
	{
		new gunting();
	}
}


