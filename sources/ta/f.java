package ta;

import java.sql.Date;
import java.sql.Timestamp;
import ta.a;
import ta.b;
public abstract class f {
    public static final boolean f48188a;
    public static final a.C0000a f48189b;
    public static final b.a f48190c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f48188a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f48189b = a.f48181b;
            f48190c = b.f48183b;
            d = d.f48185b;
            return;
        }
        f48189b = null;
        f48190c = null;
        d = null;
    }
}
