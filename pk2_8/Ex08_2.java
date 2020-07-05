public class Ex08_2 {
    public static void main(String [] args){
        Film[] f={new Film("太陽"),
                  new Film("ワールズ・エンド",2),
                  new Film("リアル鬼ごっこ",0),
                  new Film("メトロ42"),
                  new Film("プロメテウス",1)
                };

                  for(int i=0;i<f.length;i++){
                      System.out.println(f[i].info());
                  }
    }
}

class Film{
    private String title;
    private int point;

    Film(String title,int point){
        this.title=title;
        this.point=point;
    }
    Film(String title){
        this.title=title;
        this.point=3;
    }

    String info(){
        if(point==0){
            return "駄作"+this.title;
        }else{
            return point+"点　"+title;
        }
    }
}