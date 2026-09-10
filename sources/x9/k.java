package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f45067c = Charset.forName("UTF-8");
    public final File f45068a;
    public j f45069b;

    public k(File file) {
        this.f45068a = file;
    }

    @Override
    public final java.lang.String F() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.F():java.lang.String");
    }

    @Override
    public final void c() {
        w9.h.c(this.f45069b, "There was a problem closing the Crashlytics log file.");
        this.f45069b = null;
    }
}
