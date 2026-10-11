package w5;

import java.util.Arrays;
import n6.m;
import n7.z0;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f49972c;
    public final boolean f49973a;
    public final String f49974b;

    static {
        z0 z0Var = new z0(20, (byte) 0);
        z0Var.f16869b = Boolean.FALSE;
        f49972c = new b(z0Var);
    }

    public b(z0 z0Var) {
        this.f49973a = ((Boolean) z0Var.f16869b).booleanValue();
        this.f49974b = (String) z0Var.f16870c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f49973a == bVar.f49973a && m.l(this.f49974b, bVar.f49974b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f49973a), this.f49974b});
    }
}
