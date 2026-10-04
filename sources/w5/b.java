package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48593c;
    public final boolean f48594a;
    public final String f48595b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f16932b = Boolean.FALSE;
        f48593c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.f48594a = ((Boolean) aVar.f16932b).booleanValue();
        this.f48595b = (String) aVar.f16933c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48594a == bVar.f48594a && l.l(this.f48595b, bVar.f48595b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48594a), this.f48595b});
    }
}
