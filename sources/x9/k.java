package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f46046c = Charset.forName("UTF-8");
    public final File f46047a;
    public j f46048b;

    public k(File file) {
        this.f46047a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f46048b, "There was a problem closing the Crashlytics log file.");
        this.f46048b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.c():java.lang.String");
    }
}
