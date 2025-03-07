public class Square extends Form {
    private float side;

    Square() {

    }

    Square(String _color, float _side) {
        super(_color);
        this.side = _side;
    }

    @Override
    public float getArea() {
        return this.side*this.side;
    }
    public String toString() {
        return super.toString()+" Side: "+this.side;
    }
}
