class Poet{
    String name ;
    int year;
    String phrase;

    void set(final String name, final int year, String phrase) {
        this.name = name;
        this.year = year;
        this.phrase=phrase;
    }

    String info(){
            return this.name+"("+this.year+")"+":"+this.phrase;
    }
}

public class Ex06_1 {
    public static void main(final String[] args) {
        final Poet p1 = new Poet();
        final Poet p2 = new Poet();
        final Poet p3 = new Poet();

        p1.set("石川啄木",1886,"働けど働けどなお我が暮らし楽にならざり ぢっと手を見る");
        System.out.println(p1.info());

        p2.set("小林一茶",1763,"痩せ蛙負けるな一茶ここにあり");
        System.out.println(p2.info());

        p3.set("カール・ブッセ",1872,"山のあなたの空遠く幸い住むと人のいふ");
        System.out.println(p3.info());

    }
}