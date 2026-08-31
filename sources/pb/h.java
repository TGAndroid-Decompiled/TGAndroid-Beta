package pb;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public abstract class h {
    public static final Charset f44281a = Charset.defaultCharset();
    public static final Charset f44282b;
    public static final Charset f44283c;
    public static final boolean d;

    static {
        Charset charset;
        Charset charset2;
        boolean z4;
        Charset charset3 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        f44282b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f44283c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f44282b;
        if ((charset4 != null && charset4.equals(f44281a)) || (charset3 != null && charset3.equals(f44281a))) {
            z4 = true;
        } else {
            z4 = false;
        }
        d = z4;
    }
}
