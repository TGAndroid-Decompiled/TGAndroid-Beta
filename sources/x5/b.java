package x5;

import java.util.Arrays;
import m4.w1;
import o6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f51463c;
    public final boolean f51464a;
    public final String f51465b;

    static {
        w1 w1Var = new w1(26, (byte) 0);
        w1Var.f18292b = Boolean.FALSE;
        f51463c = new b(w1Var);
    }

    public b(w1 w1Var) {
        this.f51464a = ((Boolean) w1Var.f18292b).booleanValue();
        this.f51465b = (String) w1Var.f18293c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f51464a == bVar.f51464a && l.l(this.f51465b, bVar.f51465b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f51464a), this.f51465b});
    }
}
