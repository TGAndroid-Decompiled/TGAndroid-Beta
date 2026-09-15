package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f45727c = Charset.forName("UTF-8");
    public final File f45728a;
    public j f45729b;

    public k(File file) {
        this.f45728a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f45729b, "There was a problem closing the Crashlytics log file.");
        this.f45729b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.c():java.lang.String");
    }
}
