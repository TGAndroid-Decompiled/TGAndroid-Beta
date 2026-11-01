package y9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f54365c = Charset.forName("UTF-8");
    public final File f54366a;
    public j f54367b;

    public k(File file) {
        this.f54366a = file;
    }

    @Override
    public final void a() {
        x9.h.c(this.f54367b, "There was a problem closing the Crashlytics log file.");
        this.f54367b = null;
    }

    @Override
    public final java.lang.String e() {
        throw new UnsupportedOperationException("Method not decompiled: y9.k.e():java.lang.String");
    }
}
