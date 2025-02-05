class Point implements Relatable{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void print(){
        System.out.println("("+this.x+", "+this.y+")");
    }
    public boolean isSmallerThan(Relatable other){
        Point otherPoint = (Point)other;
        if(this.getX() < otherPoint.getX()) return true;
        else if (this.getX() == otherPoint.getX()){
            if(this.getY() < otherPoint.getY()) return true;
            else return false;
        }
        else return false ;
    }
}