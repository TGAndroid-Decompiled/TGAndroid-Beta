package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f49811c = Charset.forName("UTF-8");
    public final File f49812a;
    public j f49813b;

    public k(File file) {
        this.f49812a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f49813b, "There was a problem closing the Crashlytics log file.");
        this.f49813b = null;
    }

    @Override
    public final java.lang.String f() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.f():java.lang.String");
    }
}
