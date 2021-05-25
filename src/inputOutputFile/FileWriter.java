
package inputOutputFile;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author achab
 */
public class FileWriter {
    public static void saveSringIntoFile(String filePath,String contentToSave) throws IOException
    {
    File file= new File(filePath);
    
    FileUtils.writeStringToFile(file, contentToSave,"UTF-8");
    }
    
}