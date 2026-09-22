package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f44588c;
    public final boolean f44589a;
    public final String f44590b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15298b = Boolean.FALSE;
        f44588c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f44589a = ((Boolean) aVar.f15298b).booleanValue();
        this.f44590b = (String) aVar.f15299c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f44589a == bVar.f44589a && l.l(this.f44590b, bVar.f44590b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f44589a), this.f44590b});
    }
}
