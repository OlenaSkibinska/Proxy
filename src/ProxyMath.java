import java.lang.*;

/**
 * Created by cs.ucu.edu.ua on 12/26/2016.
 */
public class ProxyMath implements  IMath{

    private Math math;
    private String subject;

    public ProxyMath(String subject){
        this.subject = subject;
    }
    @Override
    public void study(){
        if (math == null){
            math = new Math(subject);
        }
        math.study();
    }
}
