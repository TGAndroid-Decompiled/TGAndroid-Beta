package w5;

import java.util.Arrays;
import mi.q;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48603c;
    public final boolean f48604a;
    public final String f48605b;

    static {
        q qVar = new q(25, (byte) 0);
        qVar.f16967b = Boolean.FALSE;
        f48603c = new b(qVar);
    }

    public b(q qVar) {
        this.f48604a = ((Boolean) qVar.f16967b).booleanValue();
        this.f48605b = (String) qVar.f16968c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48604a == bVar.f48604a && l.l(this.f48605b, bVar.f48605b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48604a), this.f48605b});
    }
}
