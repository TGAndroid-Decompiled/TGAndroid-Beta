package w5;

import java.util.Arrays;
import n6.m;
import n7.z0;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f50120c;
    public final boolean f50121a;
    public final String f50122b;

    static {
        z0 z0Var = new z0(20, (byte) 0);
        z0Var.f16573b = Boolean.FALSE;
        f50120c = new b(z0Var);
    }

    public b(z0 z0Var) {
        this.f50121a = ((Boolean) z0Var.f16573b).booleanValue();
        this.f50122b = (String) z0Var.f16574c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f50121a == bVar.f50121a && m.l(this.f50122b, bVar.f50122b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f50121a), this.f50122b});
    }
}
