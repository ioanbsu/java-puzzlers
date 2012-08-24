import com.google.common.io.Files;
import sun.nio.cs.MS1250;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author IoaN, 8/23/12 5:22 PM
 */
public class Rename {

    public static void main(String[] args) {
        File file = new File("g:\\work\\git\\java-puzzlers\\blablabla\\");
        renameRecurcevly(file.listFiles());
    }


    public static void renameRecurcevly(File[] file) {
        for (File fileOrFolder : file) {
            if (fileOrFolder.isDirectory()) {
                renameRecurcevly(fileOrFolder.listFiles());
            } else if (fileOrFolder.isFile()) {
                try {
                    Charset charset = new MS1250();
                    List<String> lines = Files.readLines(fileOrFolder, charset);
                    lines.add(0, "");
                    lines.add(0, "package " + fileOrFolder.getAbsolutePath().substring(fileOrFolder.getAbsolutePath().lastIndexOf("blablabla") + 10, fileOrFolder.getAbsolutePath().lastIndexOf(fileOrFolder.getName()) - 1).replace("\\", ".") + ";");

                    System.out.println("sdfsd");
                    StringBuffer sequense = new StringBuffer();
                    for (String line : lines) {
                        sequense.append(line);
                    }
                    Files.write(sequense, fileOrFolder, charset);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
