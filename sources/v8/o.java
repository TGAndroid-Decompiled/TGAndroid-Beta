package v8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f50721a;

    public o(ae.j jVar) {
        this.f50721a = jVar.f425a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && n6.l.k(Integer.valueOf(this.f50721a), Integer.valueOf(((o) obj).f50721a)) && n6.l.k(1, 1) && n6.l.k(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (n6.l.k(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f50721a), 1, null, Boolean.TRUE});
    }
}
