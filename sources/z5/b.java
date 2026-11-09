package z5;

import java.util.Arrays;
import q6.m;
import v6.e;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59717c;
    public final boolean f59718a;
    public final String f59719b;

    static {
        ?? obj = new Object();
        obj.f57256a = Boolean.FALSE;
        f59717c = new b(obj);
    }

    public b(e eVar) {
        this.f59718a = ((Boolean) eVar.f57256a).booleanValue();
        this.f59719b = (String) eVar.f57257b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59718a == bVar.f59718a && m.k(this.f59719b, bVar.f59719b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59718a), this.f59719b});
    }
}
