package z5;

import java.util.Arrays;
import q6.m;
import v6.e;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59707c;
    public final boolean f59708a;
    public final String f59709b;

    static {
        ?? obj = new Object();
        obj.f57243a = Boolean.FALSE;
        f59707c = new b(obj);
    }

    public b(e eVar) {
        this.f59708a = ((Boolean) eVar.f57243a).booleanValue();
        this.f59709b = (String) eVar.f57244b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59708a == bVar.f59708a && m.k(this.f59709b, bVar.f59709b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59708a), this.f59709b});
    }
}
