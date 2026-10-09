package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f51096c = Charset.forName("UTF-8");
    public final File f51097a;
    public j f51098b;

    public k(File file) {
        this.f51097a = file;
    }

    @Override
    public final java.lang.String H() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.H():java.lang.String");
    }

    @Override
    public final void c() {
        w9.h.c(this.f51098b, "There was a problem closing the Crashlytics log file.");
        this.f51098b = null;
    }
}
