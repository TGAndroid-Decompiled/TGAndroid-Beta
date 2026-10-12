package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f51325c = Charset.forName("UTF-8");
    public final File f51326a;
    public j f51327b;

    public k(File file) {
        this.f51326a = file;
    }

    @Override
    public final void a() {
        w9.h.c(this.f51327b, "There was a problem closing the Crashlytics log file.");
        this.f51327b = null;
    }

    @Override
    public final java.lang.String d() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.d():java.lang.String");
    }
}
