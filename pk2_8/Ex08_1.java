public class Ex08_1{
    public static void main(final String[] args) {
        TVProgram tv1 = new TVProgram("徹子の部屋", 1976);
        TVProgram tv2 = new TVProgram("スタジオパークからこんにちは", 1995);
        TVProgram tv3 = new TVProgram("笑点", 1966);

        tv1.show();
        tv2.show();
        tv3.show();
    }
}
class TVProgram {
    private  String name;
    private  int start;

    TVProgram(final String name, final int start) {
        this.name=name;
        this.start=start;
    }
    void show(){
        System.out.println("番組名："+name+"("+start+"年～)");
    }
    
}