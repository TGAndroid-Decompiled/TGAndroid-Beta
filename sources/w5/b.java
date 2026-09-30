package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44981c;
    public final boolean f44982a;
    public final String f44983b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15498b = Boolean.FALSE;
        f44981c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44982a = ((Boolean) aVar.f15498b).booleanValue();
        this.f44983b = (String) aVar.f15499c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44982a == bVar.f44982a && l.l(this.f44983b, bVar.f44983b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44982a), this.f44983b});
    }
}
