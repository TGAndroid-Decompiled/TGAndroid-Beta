package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f51184c = Charset.forName("UTF-8");
    public final File f51185a;
    public j f51186b;

    public k(File file) {
        this.f51185a = file;
    }

    @Override
    public final java.lang.String H() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.H():java.lang.String");
    }

    @Override
    public final void c() {
        w9.h.c(this.f51186b, "There was a problem closing the Crashlytics log file.");
        this.f51186b = null;
    }
}
