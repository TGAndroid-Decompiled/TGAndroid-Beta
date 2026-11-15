package z5;

import java.util.Arrays;
import q6.m;
import tg.x;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f60915c;
    public final boolean f60916a;
    public final String f60917b;

    static {
        x xVar = new x(9, (byte) 0);
        xVar.f57596b = Boolean.FALSE;
        f60915c = new b(xVar);
    }

    public b(x xVar) {
        this.f60916a = ((Boolean) xVar.f57596b).booleanValue();
        this.f60917b = (String) xVar.f57597c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f60916a == bVar.f60916a && m.k(this.f60917b, bVar.f60917b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f60916a), this.f60917b});
    }
}
