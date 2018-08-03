import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Timer;
import java.util.TimerTask;

public class LogServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(LogServlet.class);
    @Override
    public void init() throws ServletException {
        showMessage();
    }

    private void showMessage(){
        Timer t = new Timer( );
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                log.error("Hello World ERROR");
                log.info("Hello World INFO");
                //System.out.println("Hello world");
            }
        }, 1000,10000);
    }
}
