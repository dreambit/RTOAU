import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class JImage extends Canvas {
	
	private static final long serialVersionUID = 1L;
	private Image image;
	
	public JImage(String url) {
		image = Toolkit.getDefaultToolkit().getImage(url);
	}
	
	@Override
	public void paint(Graphics g) {
	    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	    g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
	}
}
