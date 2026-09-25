package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44874c;
    public final boolean f44875a;
    public final String f44876b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15482b = Boolean.FALSE;
        f44874c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44875a = ((Boolean) aVar.f15482b).booleanValue();
        this.f44876b = (String) aVar.f15483c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44875a == bVar.f44875a && l.l(this.f44876b, bVar.f44876b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44875a), this.f44876b});
    }
}
