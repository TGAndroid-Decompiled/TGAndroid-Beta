package sa;

import java.sql.Date;
import java.sql.Timestamp;

public abstract class f {

    public static final boolean f47825a;

    public static final a.C0000a f47826b;

    public static final b.a f47827c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f47825a = z10;
        if (!z10) {
            f47826b = null;
            f47827c = null;
            d = null;
        } else {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f47826b = a.f47818b;
            f47827c = b.f47820b;
            d = d.f47822b;
        }
    }
}
