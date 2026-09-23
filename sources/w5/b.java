package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44542c;
    public final boolean f44543a;
    public final String f44544b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15275b = Boolean.FALSE;
        f44542c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44543a = ((Boolean) aVar.f15275b).booleanValue();
        this.f44544b = (String) aVar.f15276c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44543a == bVar.f44543a && l.l(this.f44544b, bVar.f44544b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44543a), this.f44544b});
    }
}
