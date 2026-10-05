package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f44783b;
    public final boolean f44784c;
    public final boolean d;
    public final String[] f44785e;
    public final j[] f44786f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f44783b = str;
        this.f44784c = z10;
        this.d = z11;
        this.f44785e = strArr;
        this.f44786f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44784c == dVar.f44784c && this.d == dVar.d && Objects.equals(this.f44783b, dVar.f44783b) && Arrays.equals(this.f44785e, dVar.f44785e) && Arrays.equals(this.f44786f, dVar.f44786f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44784c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44783b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
