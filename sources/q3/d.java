package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f41136b;
    public final boolean f41137c;
    public final boolean d;
    public final String[] e;
    public final j[] f41138f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f41136b = str;
        this.f41137c = z10;
        this.d = z11;
        this.e = strArr;
        this.f41138f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41137c == dVar.f41137c && this.d == dVar.d && Objects.equals(this.f41136b, dVar.f41136b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f41138f, dVar.f41138f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f41137c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f41136b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
