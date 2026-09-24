package v8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f44521a;

    public o(com.google.android.gms.internal.cast.a aVar) {
        this.f44521a = aVar.f6228a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && n6.l.l(Integer.valueOf(this.f44521a), Integer.valueOf(((o) obj).f44521a)) && n6.l.l(1, 1) && n6.l.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (n6.l.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44521a), 1, null, Boolean.TRUE});
    }
}
