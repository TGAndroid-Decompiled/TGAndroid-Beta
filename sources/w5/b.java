package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44592c;
    public final boolean f44593a;
    public final String f44594b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15300b = Boolean.FALSE;
        f44592c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44593a = ((Boolean) aVar.f15300b).booleanValue();
        this.f44594b = (String) aVar.f15301c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44593a == bVar.f44593a && l.l(this.f44594b, bVar.f44594b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44593a), this.f44594b});
    }
}
