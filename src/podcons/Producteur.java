package podcons;

public class Producteur extends Thread {
    private  tampon tampon ;
    public Producteur(tampon tampon) {
        this.tampon = tampon;
    }
    public void run (){
        tampon.produire();
    }
}
