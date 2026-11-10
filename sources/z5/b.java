package z5;

import java.util.Arrays;
import q6.m;
import v6.e;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59715c;
    public final boolean f59716a;
    public final String f59717b;

    static {
        ?? obj = new Object();
        obj.f57252a = Boolean.FALSE;
        f59715c = new b(obj);
    }

    public b(e eVar) {
        this.f59716a = ((Boolean) eVar.f57252a).booleanValue();
        this.f59717b = (String) eVar.f57253b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59716a == bVar.f59716a && m.k(this.f59717b, bVar.f59717b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59716a), this.f59717b});
    }
}
