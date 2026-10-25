package x5;

import java.util.Arrays;
import m4.w1;
import o6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f51402c;
    public final boolean f51403a;
    public final String f51404b;

    static {
        w1 w1Var = new w1(26, (byte) 0);
        w1Var.f18293b = Boolean.FALSE;
        f51402c = new b(w1Var);
    }

    public b(w1 w1Var) {
        this.f51403a = ((Boolean) w1Var.f18293b).booleanValue();
        this.f51404b = (String) w1Var.f18294c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f51403a == bVar.f51403a && l.l(this.f51404b, bVar.f51404b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f51403a), this.f51404b});
    }
}
