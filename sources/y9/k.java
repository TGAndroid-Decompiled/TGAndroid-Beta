package y9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f50553c = Charset.forName("UTF-8");
    public final File f50554a;
    public j f50555b;

    public k(File file) {
        this.f50554a = file;
    }

    @Override
    public final void a() {
        x9.h.c(this.f50555b, "There was a problem closing the Crashlytics log file.");
        this.f50555b = null;
    }

    @Override
    public final java.lang.String d() {
        throw new UnsupportedOperationException("Method not decompiled: y9.k.d():java.lang.String");
    }
}
