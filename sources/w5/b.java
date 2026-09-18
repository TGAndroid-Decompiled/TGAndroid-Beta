package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44846c;
    public final boolean f44847a;
    public final String f44848b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15439b = Boolean.FALSE;
        f44846c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44847a = ((Boolean) aVar.f15439b).booleanValue();
        this.f44848b = (String) aVar.f15440c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44847a == bVar.f44847a && l.l(this.f44848b, bVar.f44848b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44847a), this.f44848b});
    }
}
