

public class Triangle extends Form{
    private float height;
    private float base;
    Triangle(){

    }
    Triangle(String _color,float _height,float _base){
        super(_color);
        this.height=_height;
        this.base=_base;
    }

    @Override
    public float getArea() {
        return (height*base)/2;
    }
    public String toString(){
        return super.toString()+" Height: "+this.height+" Base: "+this.base;
    }
    public boolean equals(Triangle tri){
        if (this.getArea()==tri.getArea())
            return true;

            else
                return false;
    }
}
