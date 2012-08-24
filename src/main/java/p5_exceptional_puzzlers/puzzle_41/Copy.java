import java.io.*;

public class Copy {
    static void copy(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) > 0)
                out.write(buf, 0, n);
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2)
            System.out.println("Usage: java Copy <source> <dest>");
        else
            copy(args[0], args[1]);
    }
}
