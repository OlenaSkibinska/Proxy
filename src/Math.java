/**
 * Created by cs.ucu.edu.ua on 12/26/2016.
 */
public class Math implements IMath {
    private String subject;

    public Math(String subject){
        this.subject = subject;
        chooseYourSubject(this.subject);

    }

    public void chooseYourSubject(String subject){
        System.out.println("I want to khow " + subject);
    }
    @Override
    public void study(){
        System.out.println("Studying " + subject);
    }

}
