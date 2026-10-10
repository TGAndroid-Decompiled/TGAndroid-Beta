package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f45983b;
    public final boolean f45984c;
    public final boolean d;
    public final String[] f45985e;
    public final j[] f45986f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f45983b = str;
        this.f45984c = z10;
        this.d = z11;
        this.f45985e = strArr;
        this.f45986f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45984c == dVar.f45984c && this.d == dVar.d && Objects.equals(this.f45983b, dVar.f45983b) && Arrays.equals(this.f45985e, dVar.f45985e) && Arrays.equals(this.f45986f, dVar.f45986f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f45984c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f45983b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
