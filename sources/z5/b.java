package z5;

import java.util.Arrays;
import q6.m;
import v6.e;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59708c;
    public final boolean f59709a;
    public final String f59710b;

    static {
        ?? obj = new Object();
        obj.f57244a = Boolean.FALSE;
        f59708c = new b(obj);
    }

    public b(e eVar) {
        this.f59709a = ((Boolean) eVar.f57244a).booleanValue();
        this.f59710b = (String) eVar.f57245b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59709a == bVar.f59709a && m.k(this.f59710b, bVar.f59710b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59709a), this.f59710b});
    }
}
