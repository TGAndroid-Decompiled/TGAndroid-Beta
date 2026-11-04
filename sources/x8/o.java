package x8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f58567a;

    public o(a7.l lVar) {
        this.f58567a = lVar.f156a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && p6.m.k(Integer.valueOf(this.f58567a), Integer.valueOf(((o) obj).f58567a)) && p6.m.k(1, 1) && p6.m.k(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (p6.m.k(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f58567a), 1, null, Boolean.TRUE});
    }
}
