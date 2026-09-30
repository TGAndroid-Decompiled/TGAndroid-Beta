package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f41405b;
    public final boolean f41406c;
    public final boolean d;
    public final String[] e;
    public final j[] f41407f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f41405b = str;
        this.f41406c = z10;
        this.d = z11;
        this.e = strArr;
        this.f41407f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41406c == dVar.f41406c && this.d == dVar.d && Objects.equals(this.f41405b, dVar.f41405b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f41407f, dVar.f41407f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f41406c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f41405b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
