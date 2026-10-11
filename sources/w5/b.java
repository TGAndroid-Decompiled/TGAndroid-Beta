package w5;

import java.util.Arrays;
import n6.m;
import n7.z0;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f50006c;
    public final boolean f50007a;
    public final String f50008b;

    static {
        z0 z0Var = new z0(20, (byte) 0);
        z0Var.f16905b = Boolean.FALSE;
        f50006c = new b(z0Var);
    }

    public b(z0 z0Var) {
        this.f50007a = ((Boolean) z0Var.f16905b).booleanValue();
        this.f50008b = (String) z0Var.f16906c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f50007a == bVar.f50007a && m.l(this.f50008b, bVar.f50008b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f50007a), this.f50008b});
    }
}
