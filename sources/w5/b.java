package w5;

import java.util.Arrays;
import mi.q;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48581c;
    public final boolean f48582a;
    public final String f48583b;

    static {
        q qVar = new q(25, (byte) 0);
        qVar.f16975b = Boolean.FALSE;
        f48581c = new b(qVar);
    }

    public b(q qVar) {
        this.f48582a = ((Boolean) qVar.f16975b).booleanValue();
        this.f48583b = (String) qVar.f16976c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48582a == bVar.f48582a && l.l(this.f48583b, bVar.f48583b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48582a), this.f48583b});
    }
}
