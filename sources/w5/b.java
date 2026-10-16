package w5;

import java.util.Arrays;
import m2.t;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f47196c;
    public final boolean f47197a;
    public final String f47198b;

    static {
        t tVar = new t(27, (byte) 0);
        tVar.f15111c = Boolean.FALSE;
        f47196c = new b(tVar);
    }

    public b(t tVar) {
        this.f47197a = ((Boolean) tVar.f15111c).booleanValue();
        this.f47198b = (String) tVar.f15110b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f47197a == bVar.f47197a && l.l(this.f47198b, bVar.f47198b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f47197a), this.f47198b});
    }
}
