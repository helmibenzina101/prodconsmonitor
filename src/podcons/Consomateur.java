package podcons;

public class Consomateur extends Thread
{
    private  tampon tampon ;
    public Consomateur(tampon tampon) {
        this.tampon = tampon;
    }
    @Override
    public void run() {
        tampon.consommer();
    }
}
