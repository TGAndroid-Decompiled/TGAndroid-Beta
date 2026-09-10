package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f40491b;
    public final boolean f40492c;
    public final boolean d;
    public final String[] e;
    public final j[] f40493f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f40491b = str;
        this.f40492c = z10;
        this.d = z11;
        this.e = strArr;
        this.f40493f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f40492c == dVar.f40492c && this.d == dVar.d && Objects.equals(this.f40491b, dVar.f40491b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f40493f, dVar.f40493f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f40492c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f40491b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
