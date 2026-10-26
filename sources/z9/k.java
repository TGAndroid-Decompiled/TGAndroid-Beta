package z9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f52834c = Charset.forName("UTF-8");
    public final File f52835a;
    public j f52836b;

    public k(File file) {
        this.f52835a = file;
    }

    @Override
    public final void a() {
        y9.h.c(this.f52836b, "There was a problem closing the Crashlytics log file.");
        this.f52836b = null;
    }

    @Override
    public final java.lang.String y() {
        throw new UnsupportedOperationException("Method not decompiled: z9.k.y():java.lang.String");
    }
}
