package ClassLibrary;

import java.io.IOException;    
import java.util.logging.FileHandler;  
import java.util.logging.Level;   
import java.util.logging.Logger;  
public class logClass {  
    public  void printlog(String infomation) throws IOException{  
        Logger log = Logger.getLogger("testlog");  
        log.setLevel(Level.ALL);  
        FileHandler fileHandler = new FileHandler("userlog.log");  
        fileHandler.setLevel(Level.ALL);  
        fileHandler.setFormatter(new logFormatter());  
        log.addHandler(fileHandler);  
        log.info(infomation);     
    }  
}

