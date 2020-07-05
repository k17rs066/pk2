public class Ex06_3 {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();
        int[] years = { 1990, 2000, 2010, 2017 };

        p1.setProf("花園香", 2010);
        System.out.println(p1.getProf()); // 表示(西暦年指定なし)
        for (int i = 0; i < years.length; i++) {
            System.out.println(p1.getProf(years[i])); // 表示(指定あり)
        }

        p2.setProf("下原太郎",1998);
        System.out.println(p1.getProf());
        for (int i = 0; i < years.length; i++) {
            System.out.println(p2.getProf(years[i])); // 表示(指定あり)
        }
    }
}

class Person{
    String name;
    int year;

    void setProf(String name,int year){
        this.name=name;
        this.year=year;
    }

    String getProf(){
        return name+":　"+year+"年生まれ";
    }
    String getProf(int year){
        if(year-this.year<-1){
            return name+": "+year+"年時点では誕生前";   

        }else{
            return name+": "+year+"年時点では"+(year-this.year)+"歳";
       
        }
    }
}
