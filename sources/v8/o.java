package v8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f48306a;

    public o(com.google.android.gms.internal.cast.a aVar) {
        this.f48306a = aVar.f6563a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && n6.l.l(Integer.valueOf(this.f48306a), Integer.valueOf(((o) obj).f48306a)) && n6.l.l(1, 1) && n6.l.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (n6.l.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48306a), 1, null, Boolean.TRUE});
    }
}
