/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputOutputFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author achab
 */
public class FileReader {
    public static String loadFileIntoSttring(String filePath) throws FileNotFoundException, IOException 
    {
       
            FileInputStream file = new  FileInputStream(filePath);
            String fileContent=IOUtils.toString(file,"UTF-8");
            
            return fileContent;
            
            //  return IOUtils.toString(new  FileInputStream(filePath),"UTF-8"); wagon de train problem
    }

    
    
}
