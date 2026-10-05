package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48600c;
    public final boolean f48601a;
    public final String f48602b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f16937b = Boolean.FALSE;
        f48600c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f48601a = ((Boolean) aVar.f16937b).booleanValue();
        this.f48602b = (String) aVar.f16938c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48601a == bVar.f48601a && l.l(this.f48602b, bVar.f48602b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48601a), this.f48602b});
    }
}
