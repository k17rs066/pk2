class Ex12_1{
    public static void main(String[] args) {
        Appointed a1=new Event("建国記念日", 211);
        Appointed a2=new Event("プログラミング基礎Ⅱ", 714);
        Appointed a3=new Event("香椎祭", 1104);
        Appointed a4=new Event("大晦日", 1231);


        a1.display(714);
        a2.display(714);
        a3.display(714);
        a4.display(714);
    }


}


interface Appointed{
    public abstract void display(int today);
}


class Event implements Appointed{
    private String name;
    private int date;

    Event(String name,int date){
        this.name=name;
        this.date=date;
    }

    public void display(int today){
        System.out.print(name+"（"+(date/100)+"月"+(date%100)+"）");
        if(today==date){
            System.out.println("本日");
        }else if(today>date){
            System.out.println("終了");
        }else{
            System.out.println();
        }
    }
}

