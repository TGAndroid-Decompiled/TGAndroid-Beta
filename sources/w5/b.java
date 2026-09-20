package w5;

import java.util.Arrays;
import m5.e;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44890c;
    public final boolean f44891a;
    public final String f44892b;

    static {
        e eVar = new e((char) 0, 26);
        eVar.f14953b = Boolean.FALSE;
        f44890c = new b(eVar);
    }

    public b(e eVar) {
        this.f44891a = ((Boolean) eVar.f14953b).booleanValue();
        this.f44892b = (String) eVar.f14954c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44891a == bVar.f44891a && l.l(this.f44892b, bVar.f44892b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44891a), this.f44892b});
    }
}
