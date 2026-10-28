package w8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f51179a;

    public o(ag.j jVar) {
        this.f51179a = jVar.f1303a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && o6.l.l(Integer.valueOf(this.f51179a), Integer.valueOf(((o) obj).f51179a)) && o6.l.l(1, 1) && o6.l.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (o6.l.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f51179a), 1, null, Boolean.TRUE});
    }
}
