
public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int h, int w){
        this.height = h;
        this.width = w;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    public boolean isSquare() {
        return this.height == this.width;
    }
}

