package y9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f48721c = Charset.forName("UTF-8");
    public final File f48722a;
    public j f48723b;

    public k(File file) {
        this.f48722a = file;
    }

    @Override
    public final void a() {
        x9.h.c(this.f48723b, "There was a problem closing the Crashlytics log file.");
        this.f48723b = null;
    }

    @Override
    public final java.lang.String f() {
        throw new UnsupportedOperationException("Method not decompiled: y9.k.f():java.lang.String");
    }
}
