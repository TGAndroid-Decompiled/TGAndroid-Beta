package y8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f59221a;

    public o(b7.l lVar) {
        this.f59221a = lVar.f3009a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && q6.m.k(Integer.valueOf(this.f59221a), Integer.valueOf(((o) obj).f59221a)) && q6.m.k(1, 1) && q6.m.k(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (q6.m.k(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f59221a), 1, null, Boolean.TRUE});
    }
}
