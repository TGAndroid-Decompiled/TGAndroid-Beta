package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44620c;
    public final boolean f44621a;
    public final String f44622b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15310b = Boolean.FALSE;
        f44620c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44621a = ((Boolean) aVar.f15310b).booleanValue();
        this.f44622b = (String) aVar.f15311c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44621a == bVar.f44621a && l.l(this.f44622b, bVar.f44622b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44621a), this.f44622b});
    }
}
