package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f51094c = Charset.forName("UTF-8");
    public final File f51095a;
    public j f51096b;

    public k(File file) {
        this.f51095a = file;
    }

    @Override
    public final java.lang.String H() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.H():java.lang.String");
    }

    @Override
    public final void c() {
        w9.h.c(this.f51096b, "There was a problem closing the Crashlytics log file.");
        this.f51096b = null;
    }
}
