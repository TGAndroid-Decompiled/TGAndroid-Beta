package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f45876b;
    public final boolean f45877c;
    public final boolean d;
    public final String[] f45878e;
    public final j[] f45879f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f45876b = str;
        this.f45877c = z10;
        this.d = z11;
        this.f45878e = strArr;
        this.f45879f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45877c == dVar.f45877c && this.d == dVar.d && Objects.equals(this.f45876b, dVar.f45876b) && Arrays.equals(this.f45878e, dVar.f45878e) && Arrays.equals(this.f45879f, dVar.f45879f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f45877c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f45876b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
