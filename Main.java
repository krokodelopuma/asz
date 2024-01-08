import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        karlson karl = new karlson();
        System.out.println(karl.toString());
        malesh male = new malesh();
        System.out.println(male.toString());
        gunnela gunn = new gunnela();
        System.out.println(gunn.toString());
        krester kres = new krester();
        System.out.println(kres.toString());
        rulla rull = new rulla();
        System.out.println(rull.toString());
        fella fell = new fella();
        System.out.println(fell.toString());

        karl.moving(movement.прячется,Location.furniture);
        karl.moving(movement.пробрался,Location.kitchen);
        male.moving(movement.прячется,Location.furniture);
        male.moving(movement.пробрался,Location.kitchen);
        gunn.moving(movement.прячется,Location.furniture);
        gunn.moving(movement.пробрался,Location.kitchen);
        kres.moving(movement.прячется,Location.furniture);
        kres.moving(movement.пробрался,Location.kitchen);
        karl.finds(thoughts.скатерти);
        karl.moving(movement.спрятался,Location.closet);
        male.moving(movement.спрятался,Location.sofa);
        rull.moving(movement.крадется);
        fell.moving(movement.крадется);
        rull.finds(thoughts.деньги);
        rull.finds(thoughts.кольца);

    }
}



