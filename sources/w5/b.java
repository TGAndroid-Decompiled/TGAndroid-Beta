package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44873c;
    public final boolean f44874a;
    public final String f44875b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15482b = Boolean.FALSE;
        f44873c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44874a = ((Boolean) aVar.f15482b).booleanValue();
        this.f44875b = (String) aVar.f15483c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44874a == bVar.f44874a && l.l(this.f44875b, bVar.f44875b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44874a), this.f44875b});
    }
}
