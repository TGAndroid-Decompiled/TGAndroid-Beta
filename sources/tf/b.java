package tf;

import java.nio.charset.Charset;
public enum b {
    ISO_8859_1(Charset.forName("ISO-8859-1"), 1),
    UTF_16(Charset.forName("UTF-16"), 2),
    UTF_16BE(Charset.forName("UTF-16BE"), 2),
    UTF_8(Charset.forName("UTF-8"), 1);
    
    public final Charset f55431a;
    public final int f55432b;

    b(Charset charset, int i7) {
        this.f55431a = charset;
        this.f55432b = i7;
    }
}
