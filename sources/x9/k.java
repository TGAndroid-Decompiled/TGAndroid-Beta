package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f49803c = Charset.forName("UTF-8");
    public final File f49804a;
    public j f49805b;

    public k(File file) {
        this.f49804a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f49805b, "There was a problem closing the Crashlytics log file.");
        this.f49805b = null;
    }

    @Override
    public final java.lang.String f() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.f():java.lang.String");
    }
}
