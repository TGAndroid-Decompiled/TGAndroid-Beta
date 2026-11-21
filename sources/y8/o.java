package y8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f61136a;

    public o(b7.l lVar) {
        this.f61136a = lVar.f2973a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && q6.m.l(Integer.valueOf(this.f61136a), Integer.valueOf(((o) obj).f61136a)) && q6.m.l(1, 1) && q6.m.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (q6.m.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f61136a), 1, null, Boolean.TRUE});
    }
}
