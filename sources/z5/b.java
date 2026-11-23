package z5;

import java.util.Arrays;
import q6.m;
import tg.y;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f61525c;
    public final boolean f61526a;
    public final String f61527b;

    static {
        y yVar = new y(9, (byte) 0);
        yVar.f58224b = Boolean.FALSE;
        f61525c = new b(yVar);
    }

    public b(y yVar) {
        this.f61526a = ((Boolean) yVar.f58224b).booleanValue();
        this.f61527b = (String) yVar.f58225c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f61526a == bVar.f61526a && m.l(this.f61527b, bVar.f61527b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f61526a), this.f61527b});
    }
}
