import java.util.Objects;
public class malesh extends Pepls implements destvea_pepls {
    private String name="Малыш";
    private Location locashen=Location.darkness;
    public malesh(){
        super("Малыш");
    }
    /*public void hiding(){
        System.out.println(this.name + " лег под диван у камина");
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
            case спрятался:
                System.out.println(this.name +" спрятался под диван у камина ");
                break;
        }
    }
    int a=0;
    public void thinks(thoughts thoughts_malesh){
        //System.out.println(this.name + " думает - Наверно, нашел " + thoughts_malesh);
        switch (thoughts_malesh) {
            case деньги:
                System.out.println(this.name + " думает - Наверно, нашел " + thoughts_malesh);
                break;
            case кольца:
                System.out.println(this.name + " думает - Наверно, нашел кольца и брошки" );
                break;
        }

    }
}