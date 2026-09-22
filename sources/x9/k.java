package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f45723c = Charset.forName("UTF-8");
    public final File f45724a;
    public j f45725b;

    public k(File file) {
        this.f45724a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f45725b, "There was a problem closing the Crashlytics log file.");
        this.f45725b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.c():java.lang.String");
    }
}
