public class Ex12_3 {
    public static void main(String[] args) {
        Locatable array[]={new Line(0,1,0),
                            new Line(1,0,0),
                            new Line(-1,2,5),
                            new Circle(-7,9,5)} ;
        
        for(int y=15;y>=-15;--y){
            for(int x=-15;x<=15;x++){
                boolean included=false;
                for(int i=0;i<array.length;i++){
                    if(array[i].includes(x,y)){
                        included=true;
                        break;
                    }
                }
                if(included){
                    System.out.print("■");
                }else {
                    System.out.print("□");
                }
            }
            System.out.println();
        }
    }
}

interface Locatable{
    public abstract boolean includes(int x,int y);
}

class Circle implements Locatable{
    private int x0,y0,radius;
    Circle(int x0,int y0,int radius){
        this.x0=x0;
        this.y0=y0;
        this.radius=radius;
    }

    public boolean includes(int x,int y){
        return(x-this.x0)*(x-this.x0)+(y-this.y0)*(y-this.y0)<radius*radius;

    }
}

class Line implements Locatable{
    private int a,b,c;

    Line(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public boolean includes(int x,int y){
        return a*x+b*y+c==0;
    }
}