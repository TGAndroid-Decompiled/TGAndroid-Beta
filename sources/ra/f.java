package ra;

import java.sql.Date;
import java.sql.Timestamp;
import ra.a;
import ra.b;
public abstract class f {
    public static final boolean f47105a;
    public static final a.C0000a f47106b;
    public static final b.a f47107c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f47105a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f47106b = a.f47098b;
            f47107c = b.f47100b;
            d = d.f47102b;
            return;
        }
        f47106b = null;
        f47107c = null;
        d = null;
    }
}
