import java.util.*;

import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class MimeType {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        Map<String,String> mimeTypeMapping = new HashMap<String,String>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            mimeTypeMapping.put(EXT.toUpperCase(), MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            System.err.println(FNAME);
            String mimeType = "UNKNOWN";
            if(FNAME.indexOf(".")==-1 ||  
             FNAME.indexOf(".")==FNAME.length()){
                //System.err.println(FNAME.indexOf("."));
                System.out.println(mimeType);
                continue;
            }
            String extension = FNAME.substring(FNAME.lastIndexOf(".")+1, FNAME.length()).toLowerCase();
            if(mimeTypeMapping.containsKey(extension.toUpperCase())){mimeType = mimeTypeMapping.get(extension.toUpperCase());};
            
            System.out.println(mimeType);
        }
    }
}
