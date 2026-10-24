package w5;

import java.util.Arrays;
import mi.q;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f49029c;
    public final boolean f49030a;
    public final String f49031b;

    static {
        q qVar = new q(24, (byte) 0);
        qVar.f17036b = Boolean.FALSE;
        f49029c = new b(qVar);
    }

    public b(q qVar) {
        this.f49030a = ((Boolean) qVar.f17036b).booleanValue();
        this.f49031b = (String) qVar.f17037c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f49030a == bVar.f49030a && l.l(this.f49031b, bVar.f49031b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f49030a), this.f49031b});
    }
}
