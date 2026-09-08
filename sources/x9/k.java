package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f49350c = Charset.forName("UTF-8");
    public final File f49351a;
    public j f49352b;

    public k(File file) {
        this.f49351a = file;
    }

    @Override
    public final void b() {
        w9.h.c(this.f49352b, "There was a problem closing the Crashlytics log file.");
        this.f49352b = null;
    }

    @Override
    public final java.lang.String e() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.e():java.lang.String");
    }
}
