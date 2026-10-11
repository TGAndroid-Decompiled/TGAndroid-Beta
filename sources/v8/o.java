package v8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f49606a;

    public o(com.google.android.gms.internal.cast.a aVar) {
        this.f49606a = aVar.f6762a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && n6.m.l(Integer.valueOf(this.f49606a), Integer.valueOf(((o) obj).f49606a)) && n6.m.l(1, 1) && n6.m.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (n6.m.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f49606a), 1, null, Boolean.TRUE});
    }
}
