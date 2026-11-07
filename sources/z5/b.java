package z5;

import java.util.Arrays;
import q6.m;
import v6.e;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59614c;
    public final boolean f59615a;
    public final String f59616b;

    static {
        ?? obj = new Object();
        obj.f57151a = Boolean.FALSE;
        f59614c = new b(obj);
    }

    public b(e eVar) {
        this.f59615a = ((Boolean) eVar.f57151a).booleanValue();
        this.f59616b = (String) eVar.f57152b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59615a == bVar.f59615a && m.k(this.f59616b, bVar.f59616b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59615a), this.f59616b});
    }
}
