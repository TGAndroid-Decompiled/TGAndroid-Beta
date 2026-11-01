package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f52473c;
    public final boolean f52474a;
    public final String f52475b;

    static {
        u9.b bVar = new u9.b(3);
        bVar.f50208b = Boolean.FALSE;
        f52473c = new b(bVar);
    }

    public b(u9.b bVar) {
        this.f52474a = ((Boolean) bVar.f50208b).booleanValue();
        this.f52475b = (String) bVar.f50209c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.k(null, null) && this.f52474a == bVar.f52474a && l.k(this.f52475b, bVar.f52475b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f52474a), this.f52475b});
    }
}
