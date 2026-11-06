package z5;

import java.util.Arrays;
import q6.m;
import v6.e;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59609c;
    public final boolean f59610a;
    public final String f59611b;

    static {
        ?? obj = new Object();
        obj.f57152a = Boolean.FALSE;
        f59609c = new b(obj);
    }

    public b(e eVar) {
        this.f59610a = ((Boolean) eVar.f57152a).booleanValue();
        this.f59611b = (String) eVar.f57153b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59610a == bVar.f59610a && m.k(this.f59611b, bVar.f59611b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59610a), this.f59611b});
    }
}
