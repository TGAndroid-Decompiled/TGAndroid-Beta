package sc;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
public abstract class k {
    public static final SecureRandom f48004a = new SecureRandom();

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                if (byteArrayOutputStream.size() == 0) {
                    return null;
                }
            } else if (read == 10) {
                break;
            } else if (read != 13) {
                byteArrayOutputStream.write(read);
            } else {
                int read2 = inputStream.read();
                if (read2 == -1) {
                    byteArrayOutputStream.write(read);
                    break;
                } else if (read2 == 10) {
                    break;
                } else {
                    byteArrayOutputStream.write(read);
                    byteArrayOutputStream.write(read2);
                }
            }
        }
        return byteArrayOutputStream.toString("UTF-8");
    }
}
