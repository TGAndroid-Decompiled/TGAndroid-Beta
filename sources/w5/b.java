package w5;

import java.util.Arrays;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f52455c;
    public final boolean f52456a;
    public final String f52457b;

    static {
        u9.b bVar = new u9.b(3);
        bVar.f50194b = Boolean.FALSE;
        f52455c = new b(bVar);
    }

    public b(u9.b bVar) {
        this.f52456a = ((Boolean) bVar.f50194b).booleanValue();
        this.f52457b = (String) bVar.f50195c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.k(null, null) && this.f52456a == bVar.f52456a && l.k(this.f52457b, bVar.f52457b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f52456a), this.f52457b});
    }
}
