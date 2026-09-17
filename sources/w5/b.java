package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44615c;
    public final boolean f44616a;
    public final String f44617b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15310b = Boolean.FALSE;
        f44615c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44616a = ((Boolean) aVar.f15310b).booleanValue();
        this.f44617b = (String) aVar.f15311c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44616a == bVar.f44616a && l.l(this.f44617b, bVar.f44617b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44616a), this.f44617b});
    }
}
