package z9;

import java.io.File;
import java.nio.charset.Charset;
public final class k implements c {
    public static final Charset f52892c = Charset.forName("UTF-8");
    public final File f52893a;
    public j f52894b;

    public k(File file) {
        this.f52893a = file;
    }

    @Override
    public final void a() {
        y9.h.c(this.f52894b, "There was a problem closing the Crashlytics log file.");
        this.f52894b = null;
    }

    @Override
    public final java.lang.String y() {
        throw new UnsupportedOperationException("Method not decompiled: z9.k.y():java.lang.String");
    }
}
