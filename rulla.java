import java.util.Objects;
public class rulla extends Pepls implements destvea_pepls2 {
    private String name="Рулле";
    public rulla(){
        super("Рулле");
    }
    private Location locashen=Location.kitchen;
    public void finds(thoughts what){
        System.out.println(this.name + " выдвинул ящик секретора и свиснул");
        malesh male = new malesh();
        male.thinks(what);
    }
    public void moving(movement Movement) {
        switch (Movement) {
            case крадется:
                System.out.println(this.name + " прокрался в " + this.locashen);
                break;
            case пробрался:
                System.out.println(this.name + Movement + " на " + this.locashen);
                break;
            case прячется:
                System.out.println(this.name + " стараясь не шуметь, прячясь за мебелью " + this.locashen);
                break;
        }
    }
}