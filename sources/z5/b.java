package z5;

import java.util.Arrays;
import q6.m;
import v6.e;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59584c;
    public final boolean f59585a;
    public final String f59586b;

    static {
        ?? obj = new Object();
        obj.f57127a = Boolean.FALSE;
        f59584c = new b(obj);
    }

    public b(e eVar) {
        this.f59585a = ((Boolean) eVar.f57127a).booleanValue();
        this.f59586b = (String) eVar.f57128b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59585a == bVar.f59585a && m.k(this.f59586b, bVar.f59586b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59585a), this.f59586b});
    }
}
