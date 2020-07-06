class Ex12_2 {
    public static void main(String[] args) {
        Speakable s []={new Japanese("丘かすみ"),
                        new Japanese("松香台介"),
                        new English("E.Watson","Hello"),
                        new English("G.Lucas","Hi")};

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].hello());
        }
    }    
}

interface Speakable{
    public abstract String hello();

}

class Japanese implements Speakable{
    private String shimei;

    Japanese(String shimei){
        this.shimei=shimei;
    }

    public String hello(){
        return shimei+"『こんにちは』";
    }
}

class English implements Speakable{
    private String name;
    private String greeting;

    English(String name,String greeting){
        this.name=name;
        this.greeting=greeting;
    }

    public String hello(){
        return name+"〈"+greeting+"〉";
    }    

}