package y9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f50151c = Charset.forName("UTF-8");
    public final File f50152a;
    public j f50153b;

    public k(File file) {
        this.f50152a = file;
    }

    @Override
    public final void a() {
        x9.h.c(this.f50153b, "There was a problem closing the Crashlytics log file.");
        this.f50153b = null;
    }

    @Override
    public final java.lang.String f() {
        throw new UnsupportedOperationException("Method not decompiled: y9.k.f():java.lang.String");
    }
}
