import java.awt.Image;

public class SchemeView {
    private Image image;
    private String name;
    private Stability stability;
    
    
    public SchemeView(Image image, String name, Stability stability) {
        this.image = image;
        this.name = name;
        this.stability = stability;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
    public Image getImage() {
        return image;
    }
    
    
    public Stability getStability() {
        return stability;
    }
}
