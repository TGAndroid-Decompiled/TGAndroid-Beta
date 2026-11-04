package y5;

import java.util.Arrays;
import p6.m;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f59032c;
    public final boolean f59033a;
    public final String f59034b;

    static {
        ua.b bVar = new ua.b(5);
        bVar.f55783b = Boolean.FALSE;
        f59032c = new b(bVar);
    }

    public b(ua.b bVar) {
        this.f59033a = ((Boolean) bVar.f55783b).booleanValue();
        this.f59034b = (String) bVar.f55784c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.k(null, null) && this.f59033a == bVar.f59033a && m.k(this.f59034b, bVar.f59034b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f59033a), this.f59034b});
    }
}
