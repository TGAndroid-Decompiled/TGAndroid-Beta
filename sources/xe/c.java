package xe;

import java.nio.charset.Charset;
public enum c {
    ISO_8859_1(Charset.forName("ISO-8859-1"), 1),
    UTF_16(Charset.forName("UTF-16"), 2),
    UTF_16BE(Charset.forName("UTF-16BE"), 2),
    UTF_8(Charset.forName("UTF-8"), 1);
    
    public final Charset f46990a;
    public final int f46991b;

    c(Charset charset, int i10) {
        this.f46990a = charset;
        this.f46991b = i10;
    }
}
