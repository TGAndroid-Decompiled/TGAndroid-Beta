package w5;

import java.util.Arrays;
import mi.q;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48628c;
    public final boolean f48629a;
    public final String f48630b;

    static {
        q qVar = new q(25, (byte) 0);
        qVar.f16974b = Boolean.FALSE;
        f48628c = new b(qVar);
    }

    public b(q qVar) {
        this.f48629a = ((Boolean) qVar.f16974b).booleanValue();
        this.f48630b = (String) qVar.f16975c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48629a == bVar.f48629a && l.l(this.f48630b, bVar.f48630b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48629a), this.f48630b});
    }
}
