package va;

import java.sql.Date;
import java.sql.Timestamp;
import va.a;
import va.b;
public abstract class f {
    public static final boolean f45643a;
    public static final a.C0000a f45644b;
    public static final b.a f45645c;
    public static final c d;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f45643a = z4;
        if (z4) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f45644b = a.f45636b;
            f45645c = b.f45638b;
            d = d.f45640b;
            return;
        }
        f45644b = null;
        f45645c = null;
        d = null;
    }
}
