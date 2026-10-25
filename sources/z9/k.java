package z9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f52831c = Charset.forName("UTF-8");
    public final File f52832a;
    public j f52833b;

    public k(File file) {
        this.f52832a = file;
    }

    @Override
    public final void a() {
        y9.h.c(this.f52833b, "There was a problem closing the Crashlytics log file.");
        this.f52833b = null;
    }

    @Override
    public final java.lang.String y() {
        throw new UnsupportedOperationException("Method not decompiled: z9.k.y():java.lang.String");
    }
}
