package w5;

import java.util.Arrays;
import mi.q;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48592c;
    public final boolean f48593a;
    public final String f48594b;

    static {
        q qVar = new q(25, (byte) 0);
        qVar.f16973b = Boolean.FALSE;
        f48592c = new b(qVar);
    }

    public b(q qVar) {
        this.f48593a = ((Boolean) qVar.f16973b).booleanValue();
        this.f48594b = (String) qVar.f16974c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48593a == bVar.f48593a && l.l(this.f48594b, bVar.f48594b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48593a), this.f48594b});
    }
}
