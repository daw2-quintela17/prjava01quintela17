
package prjava01quintela17;

/**
 *
 * @author quintela17
 */

import java.io.*;

public class Prjava01quintela17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer01quintela17.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova p&agrave;gina  web de quintela17");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Nova p&agrave;gina web de quintela17");bw.newLine();
            bw.write("    DAW2 UF4 Pràctica2");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }
}
