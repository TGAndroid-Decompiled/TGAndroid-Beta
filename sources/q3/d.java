package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f41404b;
    public final boolean f41405c;
    public final boolean d;
    public final String[] e;
    public final j[] f41406f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f41404b = str;
        this.f41405c = z10;
        this.d = z11;
        this.e = strArr;
        this.f41406f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41405c == dVar.f41405c && this.d == dVar.d && Objects.equals(this.f41404b, dVar.f41404b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f41406f, dVar.f41406f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f41405c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f41404b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
