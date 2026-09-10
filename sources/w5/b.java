package w5;

import java.util.Arrays;
import n6.l;
import og.u0;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f43551c;
    public final boolean f43552a;
    public final String f43553b;

    static {
        u0 u0Var = new u0(20);
        u0Var.f14497b = Boolean.FALSE;
        f43551c = new b(u0Var);
    }

    public b(u0 u0Var) {
        this.f43552a = ((Boolean) u0Var.f14497b).booleanValue();
        this.f43553b = (String) u0Var.f14498c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f43552a == bVar.f43552a && l.l(this.f43553b, bVar.f43553b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f43552a), this.f43553b});
    }
}
