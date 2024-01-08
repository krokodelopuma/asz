import java.util.Objects;
public class karlson extends Pepls implements destvea_pepls{//,destvea_pepls2 {
    private String name="Карлсон";
    private Location locashen=Location.darkness;
    public karlson(){
        super("Карлсон");
    }
    /*public void hiding(){
        System.out.println(this.name + " залез в красивый старинный буфет и кое-как прикрыл за собой дверцу");
    }*/
    public void looks(String kuda){
        System.out.println(this.name + " смотрит на" + kuda);
    }
    public void moving(movement Movement,Location locashen){
        this.locashen=locashen;
        switch (Movement) {
            case крадется:
                System.out.println(this.name + " прокрался в "+ locashen);
                break;
            case пробрался:
                System.out.println(this.name +" "+ Movement +" на "+ locashen);
                break;
            case прячется:
                System.out.println(this.name +" стараясь не шуметь, прячясь за "+ locashen);
                break;
            case залез:
                System.out.println(this.name +" залез в красивый старинный буфет и кое-как прикрыл за собой дверцу");
                break;
        }
    }
    public void finds(thoughts what){
        switch (what) {
            case скатерти:
                System.out.println(this.name + " находит скатерти и салфетки");
                break;
        }
    }
}