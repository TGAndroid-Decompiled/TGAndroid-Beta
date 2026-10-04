package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f44776b;
    public final boolean f44777c;
    public final boolean d;
    public final String[] f44778e;
    public final j[] f44779f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f44776b = str;
        this.f44777c = z10;
        this.d = z11;
        this.f44778e = strArr;
        this.f44779f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44777c == dVar.f44777c && this.d == dVar.d && Objects.equals(this.f44776b, dVar.f44776b) && Arrays.equals(this.f44778e, dVar.f44778e) && Arrays.equals(this.f44779f, dVar.f44779f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44777c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44776b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
