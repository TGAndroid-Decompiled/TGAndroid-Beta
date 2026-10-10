package x9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f51140c = Charset.forName("UTF-8");
    public final File f51141a;
    public j f51142b;

    public k(File file) {
        this.f51141a = file;
    }

    @Override
    public final java.lang.String H() {
        throw new UnsupportedOperationException("Method not decompiled: x9.k.H():java.lang.String");
    }

    @Override
    public final void c() {
        w9.h.c(this.f51142b, "There was a problem closing the Crashlytics log file.");
        this.f51142b = null;
    }
}
