package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f41141b;
    public final boolean f41142c;
    public final boolean d;
    public final String[] e;
    public final j[] f41143f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f41141b = str;
        this.f41142c = z10;
        this.d = z11;
        this.e = strArr;
        this.f41143f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41142c == dVar.f41142c && this.d == dVar.d && Objects.equals(this.f41141b, dVar.f41141b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f41143f, dVar.f41143f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f41142c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f41141b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
