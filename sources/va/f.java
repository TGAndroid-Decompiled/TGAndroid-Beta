package va;

import java.sql.Date;
import java.sql.Timestamp;
import va.a;
import va.b;
public abstract class f {
    public static final boolean f48976a;
    public static final a.C0000a f48977b;
    public static final b.a f48978c;
    public static final c d;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f48976a = z4;
        if (z4) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f48977b = a.f48969b;
            f48978c = b.f48971b;
            d = d.f48973b;
            return;
        }
        f48977b = null;
        f48978c = null;
        d = null;
    }
}
