package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f49818c = Charset.forName("UTF-8");
    public final File f49819a;
    public j f49820b;

    public k(File file) {
        this.f49819a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f49820b, "There was a problem closing the Crashlytics log file.");
        this.f49820b = null;
    }

    @Override
    public final java.lang.String f() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.f():java.lang.String");
    }
}
