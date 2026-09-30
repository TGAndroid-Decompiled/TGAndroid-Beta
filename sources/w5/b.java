package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44875c;
    public final boolean f44876a;
    public final String f44877b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15483b = Boolean.FALSE;
        f44875c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44876a = ((Boolean) aVar.f15483b).booleanValue();
        this.f44877b = (String) aVar.f15484c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44876a == bVar.f44876a && l.l(this.f44877b, bVar.f44877b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44876a), this.f44877b});
    }
}
