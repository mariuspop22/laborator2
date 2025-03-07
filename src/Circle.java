public class Circle extends Form{
    private float radius;
    Circle(){

    }
    Circle(String _color,float _radius){
        super(_color);
        this.radius=_radius;
    }

    @Override
    public float getArea() {
        return this.radius*this.radius*3.14f;

    }
    public String toString(){
        return super.toString()+" Radius: "+this.radius;
    }
}
