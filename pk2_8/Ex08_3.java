public class Ex08_3 {
    public static void main(String[] args){
        Money[] ma={
            new Money("給与",190000),
            new Money("書籍",-900),
            new Money(2000),
            new Money("バス運賃",-480),
            new Money(-900)
        };

        Account acc=new Account();
        for(int i=0;i<ma.length;i++){
            acc.process(ma[i]);

        }

        acc.show();
        System.out.println();
        acc.process(new Money("引っ越し",-300000));
        acc.show();

    }
}

class Money{
    private String name;
    private int money;
    Money(String name,int money){
        if(money>0){
            this.name=name+"として";
        }else{
            this.name=name+"のため";
        }
        this.money=money;
    }


    Money(int money){
        if(money>0){
            this.name="不労所得";
        }else{
            this.name="使途不明";
        }
        this.money=money;
    }

    String getReason(){
        return name;
    }

    int getAmount(){
        return money;
    }
}

class Account{
    private int income;
    private int expend;

    void process(Money m){
        System.out.println(m.getReason());
        if(m.getAmount()>0){
            System.out.println("　収入:"+m.getAmount()+"円");
            income +=m.getAmount();
        }else{
            System.out.println("　支出:"+(-m.getAmount())+"円");
            expend -= m.getAmount();
        }
    }

    void show(){
        System.out.println("収入: "+income+"円");
        System.out.println("支出: "+expend+"円");
        if(income>expend){
            System.out.println("残高: "+(income-expend)+"円");
        }else{
            System.out.println("残高: ▲"+(expend-income)+"円");
        }
    }
}