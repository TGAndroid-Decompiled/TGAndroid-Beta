package w5;

import java.util.Arrays;
import mi.q;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f49030c;
    public final boolean f49031a;
    public final String f49032b;

    static {
        q qVar = new q(24, (byte) 0);
        qVar.f17036b = Boolean.FALSE;
        f49030c = new b(qVar);
    }

    public b(q qVar) {
        this.f49031a = ((Boolean) qVar.f17036b).booleanValue();
        this.f49032b = (String) qVar.f17037c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f49031a == bVar.f49031a && l.l(this.f49032b, bVar.f49032b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f49031a), this.f49032b});
    }
}
