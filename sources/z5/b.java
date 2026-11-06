package z5;

import java.util.Arrays;
import q6.m;
import v6.e;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59608c;
    public final boolean f59609a;
    public final String f59610b;

    static {
        ?? obj = new Object();
        obj.f57151a = Boolean.FALSE;
        f59608c = new b(obj);
    }

    public b(e eVar) {
        this.f59609a = ((Boolean) eVar.f57151a).booleanValue();
        this.f59610b = (String) eVar.f57152b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59609a == bVar.f59609a && m.k(this.f59610b, bVar.f59610b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59609a), this.f59610b});
    }
}
