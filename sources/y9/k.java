package y9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f48722c = Charset.forName("UTF-8");
    public final File f48723a;
    public j f48724b;

    public k(File file) {
        this.f48723a = file;
    }

    @Override
    public final void a() {
        x9.h.c(this.f48724b, "There was a problem closing the Crashlytics log file.");
        this.f48724b = null;
    }

    @Override
    public final java.lang.String e() {
        throw new UnsupportedOperationException("Method not decompiled: y9.k.e():java.lang.String");
    }
}
