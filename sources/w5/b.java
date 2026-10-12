package w5;

import java.util.Arrays;
import n6.m;
import n7.z0;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f50112c;
    public final boolean f50113a;
    public final String f50114b;

    static {
        z0 z0Var = new z0(20, (byte) 0);
        z0Var.f16572b = Boolean.FALSE;
        f50112c = new b(z0Var);
    }

    public b(z0 z0Var) {
        this.f50113a = ((Boolean) z0Var.f16572b).booleanValue();
        this.f50114b = (String) z0Var.f16573c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f50113a == bVar.f50113a && m.l(this.f50114b, bVar.f50114b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f50113a), this.f50114b});
    }
}
