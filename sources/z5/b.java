package z5;

import java.util.Arrays;
import q6.m;
import tg.y;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f61490c;
    public final boolean f61491a;
    public final String f61492b;

    static {
        y yVar = new y(9, (byte) 0);
        yVar.f58189b = Boolean.FALSE;
        f61490c = new b(yVar);
    }

    public b(y yVar) {
        this.f61491a = ((Boolean) yVar.f58189b).booleanValue();
        this.f61492b = (String) yVar.f58190c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f61491a == bVar.f61491a && m.l(this.f61492b, bVar.f61492b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f61491a), this.f61492b});
    }
}
