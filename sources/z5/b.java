package z5;

import java.util.Arrays;
import q6.m;
import tg.y;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f61521c;
    public final boolean f61522a;
    public final String f61523b;

    static {
        y yVar = new y(9, (byte) 0);
        yVar.f58220b = Boolean.FALSE;
        f61521c = new b(yVar);
    }

    public b(y yVar) {
        this.f61522a = ((Boolean) yVar.f58220b).booleanValue();
        this.f61523b = (String) yVar.f58221c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f61522a == bVar.f61522a && m.l(this.f61523b, bVar.f61523b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f61522a), this.f61523b});
    }
}
