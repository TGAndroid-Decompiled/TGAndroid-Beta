package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44918c;
    public final boolean f44919a;
    public final String f44920b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15519b = Boolean.FALSE;
        f44918c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44919a = ((Boolean) aVar.f15519b).booleanValue();
        this.f44920b = (String) aVar.f15520c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44919a == bVar.f44919a && l.l(this.f44920b, bVar.f44920b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44919a), this.f44920b});
    }
}
