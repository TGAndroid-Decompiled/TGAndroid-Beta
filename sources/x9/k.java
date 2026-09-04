package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f49321c = Charset.forName("UTF-8");
    public final File f49322a;
    public j f49323b;

    public k(File file) {
        this.f49322a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f49323b, "There was a problem closing the Crashlytics log file.");
        this.f49323b = null;
    }

    @Override
    public final java.lang.String e() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.e():java.lang.String");
    }
}
