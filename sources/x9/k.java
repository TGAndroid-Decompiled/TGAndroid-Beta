package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f45750c = Charset.forName("UTF-8");
    public final File f45751a;
    public j f45752b;

    public k(File file) {
        this.f45751a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f45752b, "There was a problem closing the Crashlytics log file.");
        this.f45752b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.c():java.lang.String");
    }
}
