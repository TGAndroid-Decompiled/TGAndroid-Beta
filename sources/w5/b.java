package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48585c;
    public final boolean f48586a;
    public final String f48587b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f16928b = Boolean.FALSE;
        f48585c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f48586a = ((Boolean) aVar.f16928b).booleanValue();
        this.f48587b = (String) aVar.f16929c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48586a == bVar.f48586a && l.l(this.f48587b, bVar.f48587b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48586a), this.f48587b});
    }
}
