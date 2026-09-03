package va;

import java.sql.Date;
import java.sql.Timestamp;
import va.a;
import va.b;
public abstract class f {
    public static final boolean f45707a;
    public static final a.C0000a f45708b;
    public static final b.a f45709c;
    public static final c d;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f45707a = z4;
        if (z4) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f45708b = a.f45700b;
            f45709c = b.f45702b;
            d = d.f45704b;
            return;
        }
        f45708b = null;
        f45709c = null;
        d = null;
    }
}
