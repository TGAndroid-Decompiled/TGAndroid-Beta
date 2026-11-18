package z5;

import java.util.Arrays;
import q6.m;
import tg.x;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f61480c;
    public final boolean f61481a;
    public final String f61482b;

    static {
        x xVar = new x(9, (byte) 0);
        xVar.f58165b = Boolean.FALSE;
        f61480c = new b(xVar);
    }

    public b(x xVar) {
        this.f61481a = ((Boolean) xVar.f58165b).booleanValue();
        this.f61482b = (String) xVar.f58166c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f61481a == bVar.f61481a && m.l(this.f61482b, bVar.f61482b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f61481a), this.f61482b});
    }
}
