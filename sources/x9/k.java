package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f46113c = Charset.forName("UTF-8");
    public final File f46114a;
    public j f46115b;

    public k(File file) {
        this.f46114a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f46115b, "There was a problem closing the Crashlytics log file.");
        this.f46115b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.c():java.lang.String");
    }
}
