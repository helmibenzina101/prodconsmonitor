package podcons;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        tampon tampon = new tampon();
        Producteur p1 = new Producteur(tampon);
        Producteur p2 = new Producteur(tampon);
        Producteur p3 = new Producteur(tampon);
        Producteur P4 = new Producteur(tampon);
        Producteur P5 = new Producteur(tampon);
        Producteur P6 = new Producteur(tampon);
        Producteur P7 = new Producteur(tampon);
        Producteur P8 = new Producteur(tampon);
        Producteur P9 = new Producteur(tampon);
        Producteur P10 =new Producteur(tampon);
        Consomateur c1 = new Consomateur(tampon);
        Consomateur c2 = new Consomateur(tampon);
        Consomateur c3 = new Consomateur(tampon);
        Consomateur c4 = new Consomateur(tampon);
        Consomateur c5 = new Consomateur(tampon);
        Consomateur c6 = new Consomateur(tampon);
        Consomateur c7 = new Consomateur(tampon);
        Consomateur c8 = new Consomateur(tampon);
        Consomateur c9 = new Consomateur(tampon);
        Consomateur c10 = new Consomateur(tampon);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        p1.start();
        p2.start();
        p3.start();
        P4.start();

        P5.start();
        P6.start();
        P7.start();
        P8.start();
        P9.start();
        P10.start();

        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
    }
}