import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class Funkcja extends Component {
	static double A, B, C;

	public void paint(Graphics g)

	{
		g.drawLine(0, 350, 900, 350); // x
		g.drawLine(850, 325, 895, 350); // \
		g.drawLine(850, 375, 895, 350); // /
		g.drawString("X", 850, 390);
		g.drawLine(450, 0, 450, 900); // y
		g.drawLine(450, 0, 475, 50); // \
		g.drawLine(450, 0, 425, 50); // /
		g.drawString("Y", 480, 50);

		g.drawLine(800, 325, 800, 375); // 3,5
		g.drawLine(750, 325, 750, 375); // 3
		g.drawLine(700, 325, 700, 375); // 2,5
		g.drawLine(650, 325, 650, 375); // 2
		g.drawLine(600, 325, 600, 375); // 1,5
		g.drawLine(550, 325, 550, 375); // 1
		g.drawLine(500, 325, 500, 375); // 0,5
		g.drawLine(400, 325, 400, 375); // -0,5
		g.drawLine(350, 325, 350, 375); // -1
		g.drawLine(300, 325, 300, 375); // -1,5
		g.drawLine(250, 325, 250, 375); // -2
		g.drawLine(200, 325, 200, 375); // -2,5
		g.drawLine(150, 325, 150, 375); // -3
		g.drawLine(100, 325, 100, 375); // -3,5

		g.drawString("3,5", 800, 325);
		g.drawString("3", 750, 325);
		g.drawString("2,5", 700, 325);
		g.drawString("2", 650, 325);
		g.drawString("1,5", 600, 325);
		g.drawString("1", 550, 325);
		g.drawString("0,5", 500, 325);
		g.drawString("0", 450, 325);
		g.drawString("-0,5", 400, 325);
		g.drawString("-1", 350, 325);
		g.drawString("-1,5", 300, 325);
		g.drawString("-2", 250, 325);
		g.drawString("-2,5", 200, 325);
		g.drawString("-3", 150, 325);
		g.drawString("-3,5", 100, 325);

		g.drawLine(475, 100, 425, 100); // 2,5
		g.drawLine(475, 150, 425, 150); // 2
		g.drawLine(475, 200, 425, 200); // 1.5
		g.drawLine(475, 250, 425, 250); // 1
		g.drawLine(475, 300, 425, 300); // 0.5
		g.drawLine(475, 400, 425, 400); // -0.5
		g.drawLine(475, 450, 425, 450); // -1
		g.drawLine(475, 500, 425, 500); // -1.5
		g.drawLine(475, 550, 425, 550); // -2
		g.drawLine(475, 600, 425, 600); // -2,5

		g.drawString("2,5", 475, 150);
		g.drawString("2", 475, 150);
		g.drawString("1,5", 475, 200);
		g.drawString("1", 475, 250);
		g.drawString("0,5", 475, 300);
		g.drawString("-0,5", 475, 400);
		g.drawString("-1", 475, 450);
		g.drawString("-1,5", 475, 500);
		g.drawString("-2", 475, 550);
		g.drawString("-2,5", 475, 600);

		g.setColor(Color.red);

		for (double x = -2000.00; x <= 2000.00; x += 0.01) {
			double Y = (A / (100) * (Math.pow(x, 2))) + (B * x) + (C * (100));
			int d = (int) Math.round(450 + x);
			int h = (int) Math.round(350 - Y);

			g.fillOval(d, h, 5, 5);
		}
	}
}
