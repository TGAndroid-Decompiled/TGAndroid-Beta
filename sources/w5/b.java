package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44859c;
    public final boolean f44860a;
    public final String f44861b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15467b = Boolean.FALSE;
        f44859c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44860a = ((Boolean) aVar.f15467b).booleanValue();
        this.f44861b = (String) aVar.f15468c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44860a == bVar.f44860a && l.l(this.f44861b, bVar.f44861b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44860a), this.f44861b});
    }
}
