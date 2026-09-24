package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f45991c = Charset.forName("UTF-8");
    public final File f45992a;
    public j f45993b;

    public k(File file) {
        this.f45992a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f45993b, "There was a problem closing the Crashlytics log file.");
        this.f45993b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.c():java.lang.String");
    }
}
