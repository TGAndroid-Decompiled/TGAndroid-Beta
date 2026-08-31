package va;

import java.sql.Date;
import java.sql.Timestamp;
import va.a;
import va.b;
public abstract class f {
    public static final boolean f48940a;
    public static final a.C0000a f48941b;
    public static final b.a f48942c;
    public static final c d;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f48940a = z4;
        if (z4) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f48941b = a.f48933b;
            f48942c = b.f48935b;
            d = d.f48937b;
            return;
        }
        f48941b = null;
        f48942c = null;
        d = null;
    }
}
