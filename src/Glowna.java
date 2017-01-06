import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Glowna extends JFrame implements ActionListener {
	JButton button;
	JTextField textA, textB, textC;
	JFrame frame;
	JLabel label, aLabel, bLabel, cLabel, dlabel;
	double a, b, c, p1, p2;

	Glowna() {
		frame = new JFrame();
		frame.setSize(900, 700);
		frame.setTitle("Funkcja kwadratowa");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.getContentPane().add(new Funkcja());
		label = new JLabel("f(x)= ax^2 + bx + c");
		aLabel = new JLabel("a:");
		bLabel = new JLabel("b:");
		cLabel = new JLabel("c:");
		dlabel = new JLabel("");

		label.setBounds(5, 5, 150, 20);
		aLabel.setBounds(5, 25, 30, 20);
		bLabel.setBounds(5, 50, 30, 20);
		cLabel.setBounds(5, 75, 30, 20);
		dlabel.setBounds(5, 125, 500, 20);
		button = new JButton(" Rysuj ");
		frame.getContentPane().add(label);
		frame.getContentPane().add(aLabel);
		frame.getContentPane().add(bLabel);
		frame.getContentPane().add(cLabel);
		frame.getContentPane().add(dlabel);
		textA = new JTextField("0");
		frame.getContentPane().add(button);
		frame.getContentPane().add(textA);
		textB = new JTextField("0");
		textC = new JTextField("0");

		frame.getContentPane().add(textA);
		frame.getContentPane().add(textB);
		frame.getContentPane().add(textC);

		button.setBounds(10, 100, 100, 25);
		textA.setBounds(35, 25, 25, 20);
		textB.setBounds(35, 50, 25, 20);
		textC.setBounds(35, 75, 25, 20);

		button.addActionListener(this);

	}

	public double obliczDelte(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		return delta;
	}

	public double obliczP1() {
		p1 = (-b + Math.sqrt(obliczDelte(a, b, c))) / (2 * a);
		return p1;
	}

	public double obliczP2()

	{
		p2 = (-b - Math.sqrt(obliczDelte(a, b, c))) / (2 * a);
		return p2;
	}

	public static void main(String[] args) {
		new Glowna();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		a = Double.parseDouble(textA.getText());
		b = Double.parseDouble(textB.getText());
		c = Double.parseDouble(textC.getText());

		Funkcja.A = a;
		Funkcja.B = b;
		Funkcja.C = c;

		if (obliczDelte(a, b, c) > 0)

		{

			dlabel.setText("Delta: " + obliczDelte(a, b, c) + " Dwa miejsca zerowe: " + obliczP1() + ", " + obliczP2());

		}

		else if (obliczDelte(a, b, c) == 0)

		{

			dlabel.setText("Delta: " + obliczDelte(a, b, c) + " Jedno miejsce zerowe: " + obliczP1());

		}

		else

		{

			dlabel.setText("Delta: " + obliczDelte(a, b, c) + ". Brak miejsc zerowych.");

		}

		frame.getContentPane().add(new Funkcja());

		frame.repaint();
	}

}
