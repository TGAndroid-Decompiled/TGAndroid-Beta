package w5;

import java.util.Arrays;
import mi.q;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48583c;
    public final boolean f48584a;
    public final String f48585b;

    static {
        q qVar = new q(25, (byte) 0);
        qVar.f16973b = Boolean.FALSE;
        f48583c = new b(qVar);
    }

    public b(q qVar) {
        this.f48584a = ((Boolean) qVar.f16973b).booleanValue();
        this.f48585b = (String) qVar.f16974c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48584a == bVar.f48584a && l.l(this.f48585b, bVar.f48585b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48584a), this.f48585b});
    }
}
