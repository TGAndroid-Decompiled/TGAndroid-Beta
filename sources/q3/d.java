package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f45939b;
    public final boolean f45940c;
    public final boolean d;
    public final String[] f45941e;
    public final j[] f45942f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f45939b = str;
        this.f45940c = z10;
        this.d = z11;
        this.f45941e = strArr;
        this.f45942f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45940c == dVar.f45940c && this.d == dVar.d && Objects.equals(this.f45939b, dVar.f45939b) && Arrays.equals(this.f45941e, dVar.f45941e) && Arrays.equals(this.f45942f, dVar.f45942f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f45940c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f45939b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
