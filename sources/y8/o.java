package y8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f60529a;

    public o(b7.l lVar) {
        this.f60529a = lVar.f2963a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && q6.m.k(Integer.valueOf(this.f60529a), Integer.valueOf(((o) obj).f60529a)) && q6.m.k(1, 1) && q6.m.k(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (q6.m.k(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f60529a), 1, null, Boolean.TRUE});
    }
}
