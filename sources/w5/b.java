package w5;

import java.util.Arrays;
import n6.l;
import n7.z0;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48067c;
    public final boolean f48068a;
    public final String f48069b;

    static {
        z0 z0Var = new z0(21, false);
        z0Var.f16730b = Boolean.FALSE;
        f48067c = new b(z0Var);
    }

    public b(z0 z0Var) {
        this.f48068a = ((Boolean) z0Var.f16730b).booleanValue();
        this.f48069b = (String) z0Var.f16731c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48068a == bVar.f48068a && l.l(this.f48069b, bVar.f48069b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48068a), this.f48069b});
    }
}
