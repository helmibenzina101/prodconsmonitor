package podcons;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class tampon {
    private int ntampon = 0;
    private int compteur=0;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition c1 = lock.newCondition();
    private final Condition c2 = lock.newCondition();
    private int taille = 10;
    private int out = 0;
    private int tampon[] = new int[taille];

    public void consommer() {
        lock.lock();
        try {
            if (ntampon == 0) {
                System.out.println("cons en attente");
                c2.await();
                System.out.println("cons quitte la file");
            }
            ntampon--;

            System.out.println(tampon[out++]+ " a été consommé");
            c1.signal();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void produire() {
        lock.lock();
        try {
            while (ntampon == taille) {
                System.out.println("prod en attente");
                c1.await();
                System.out.println("prod quitte la file");
            }
            tampon[compteur] = (int) (Math.random()*100);
            System.out.println("Le producteur a produit : " + tampon[compteur]);
            compteur++;
            compteur=compteur%taille;
            ntampon++;
            c2.signal();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        finally{
            lock.unlock();

        }
    }
}