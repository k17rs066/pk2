class Film{
    String title;
    int point;

    String info(){
        if(this.point==0){
            return "駄作　"+this.title;
        }else{
            return this.point+"点　"+this.title;
        }
    }

    void set(String title,int point){
        this.title=title;
        this.point=point;
    }

    void set(String title){
        this.title=title;
        this.point=3;
    }
    public static  void main(String[] args) {
        Film f1 = new Film();
        f1.set("太陽");
        Film f2 = new Film();
        f2.set("ワールズ・エンド", 2);
        Film f3=new Film();
        f3.set("リアル鬼ごっこ",0);
        Film f4=new Film();
        f4.set("メトロ42",3);
        Film f5=new Film();
        f5.set("プロメテウス",1);

        
        System.out.println(f1.info());
        System.out.println(f2.info());
        System.out.println(f3.info());
        System.out.println(f4.info());
        System.out.println(f5.info());

    }
}