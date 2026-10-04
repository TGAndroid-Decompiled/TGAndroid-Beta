package v8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f48218a;

    public o(com.google.android.gms.internal.cast.a aVar) {
        this.f48218a = aVar.f6710a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && n6.l.l(Integer.valueOf(this.f48218a), Integer.valueOf(((o) obj).f48218a)) && n6.l.l(1, 1) && n6.l.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (n6.l.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48218a), 1, null, Boolean.TRUE});
    }
}
