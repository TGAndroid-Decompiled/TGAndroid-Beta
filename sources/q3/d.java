package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f45884b;
    public final boolean f45885c;
    public final boolean d;
    public final String[] f45886e;
    public final j[] f45887f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f45884b = str;
        this.f45885c = z10;
        this.d = z11;
        this.f45886e = strArr;
        this.f45887f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45885c == dVar.f45885c && this.d == dVar.d && Objects.equals(this.f45884b, dVar.f45884b) && Arrays.equals(this.f45886e, dVar.f45886e) && Arrays.equals(this.f45887f, dVar.f45887f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f45885c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f45884b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
