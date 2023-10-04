package Main;

import java.io.IOException;

/**
 *
 * @author shaj
 */
public class FileReader {
    private FileReader(){
        
    }
    
    public static FileReader getInstanceFR(){
        FileReader fr = new FileReader();
           return fr;
    }
    public MyappDataReader getInstanceMA() throws IOException{
        MyappDataReader mdr = new MyappDataReader();
        return mdr;
        
    }
//    The reason is that the class has a private constructor, and it provides a static method getInstanceFR()to get the instance of the class. 
//    This method always returns the same instance of the class every time it's called, which is the definition of the Singleton pattern.
//
//   Additionally, the class also provides another method getInstanceMA(), 
//   which returns an instance of another class MyappDataReader. 
//   However, this does not affect the fact that FileReader is a Singleton class.
    
    
}