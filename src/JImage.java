import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class JImage extends Canvas {
	
	private static final long serialVersionUID = 1L;
	private Image image;
	
	
	public JImage() {
    }
	
	
	public JImage(String url) {
		image = Toolkit.getDefaultToolkit().getImage(url);
	}
	
	
	public void setImage(Image image) {
        this.image = image;
        repaint();
    }
	
	
	public void setImage(String url) {
        image = Toolkit.getDefaultToolkit().getImage(url);
        repaint();
    }
	
	
	@Override
	public void paint(Graphics g) {
	    if (image != null) {
	        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
	    }
	}
}
