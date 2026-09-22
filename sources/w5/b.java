package w5;

import java.util.Arrays;
import m5.e;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44910c;
    public final boolean f44911a;
    public final String f44912b;

    static {
        e eVar = new e((char) 0, 26);
        eVar.f14968b = Boolean.FALSE;
        f44910c = new b(eVar);
    }

    public b(e eVar) {
        this.f44911a = ((Boolean) eVar.f14968b).booleanValue();
        this.f44912b = (String) eVar.f14969c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44911a == bVar.f44911a && l.l(this.f44912b, bVar.f44912b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44911a), this.f44912b});
    }
}
