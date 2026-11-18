package z5;

import java.util.Arrays;
import q6.m;
import tg.x;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f61479c;
    public final boolean f61480a;
    public final String f61481b;

    static {
        x xVar = new x(9, (byte) 0);
        xVar.f58164b = Boolean.FALSE;
        f61479c = new b(xVar);
    }

    public b(x xVar) {
        this.f61480a = ((Boolean) xVar.f58164b).booleanValue();
        this.f61481b = (String) xVar.f58165c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f61480a == bVar.f61480a && m.l(this.f61481b, bVar.f61481b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f61480a), this.f61481b});
    }
}
