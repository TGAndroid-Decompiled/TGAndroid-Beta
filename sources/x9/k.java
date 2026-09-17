package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f49351c = Charset.forName("UTF-8");
    public final File f49352a;
    public j f49353b;

    public k(File file) {
        this.f49352a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f49353b, "There was a problem closing the Crashlytics log file.");
        this.f49353b = null;
    }

    @Override
    public final java.lang.String e() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.e():java.lang.String");
    }
}
