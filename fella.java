import java.util.Objects;
public class fella extends Pepls {
    private String name="Филе";
    private Location locashen=Location.kitchen;
    public fella(){
        super("Филе");
    }

    public void moving(movement Movement){
        switch (Movement) {
            case крадется:
                System.out.println(this.name + " прокрался в "+ this.locashen);
                break;
            case пробрался:
                System.out.println(this.name + Movement +" на "+ this.locashen);
                break;
            case прячется:
                System.out.println(this.name +" стараясь не шуметь, прячясь за мебелью "+ this.locashen);
                break;
        }
    }
}